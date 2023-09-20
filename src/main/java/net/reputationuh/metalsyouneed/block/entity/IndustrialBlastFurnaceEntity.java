package net.reputationuh.metalsyouneed.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.reputationuh.metalsyouneed.MetalsYouNeed;
import net.reputationuh.metalsyouneed.item.ModItems;
import net.reputationuh.metalsyouneed.screen.IndustrialBlastFurnaceScreenHandler;
import org.jetbrains.annotations.Nullable;

public class IndustrialBlastFurnaceEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 70;

    public IndustrialBlastFurnaceEntity( BlockPos pos, BlockState state) {
        super(ModBlockEntities.INDUSTRIAL_BLAST_FURNACE, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                switch (index) {
                    case 0:
                        return IndustrialBlastFurnaceEntity.this.progress;
                    case 1:
                        return IndustrialBlastFurnaceEntity.this.maxProgress;
                    default:
                        return 0;
                }
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0:
                        IndustrialBlastFurnaceEntity.this.progress = value;
                        break;
                    case 1:
                        IndustrialBlastFurnaceEntity.this.maxProgress = value;
                        break;
                }
            }

            public int size() {
                return 2;
            }
        };
    }
            @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Industrial Blast Furnace");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new IndustrialBlastFurnaceScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    public void writeNbt(NbtCompound nbt){
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("industrial_blast_furnace.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("industrial_blast_furnace.progress");
    }

    public static void tick(World world, BlockPos blockPos, BlockState state, IndustrialBlastFurnaceEntity entity) {
        if(world.isClient()){
            return;
        }

        if(hasRecipe(entity)){
            entity.progress++;
            markDirty(world, blockPos, state);
            if(entity.progress >= entity.maxProgress){
                craftItems(entity);
            }
        } else {
            entity.resetProgress();
            markDirty(world, blockPos, state);
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static void craftItems(IndustrialBlastFurnaceEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        if(hasRecipe(entity)) {
            entity.removeStack(1, 1);

            entity.setStack(2, new ItemStack(ModItems.RAW_TITANIUM,
                    entity.getStack(2).getCount() + 1));

            entity.resetProgress();
        }
    }

    private static boolean hasRecipe(IndustrialBlastFurnaceEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for ( int i = 0; i < entity.size(); i++){
            inventory.setStack(i, entity.getStack(i));
        }

        boolean hasRawMaterialInFirstSlot = entity.getStack(1).getItem() == (ModItems.RAW_TITANIUM); //Should Add More Materials Here
        return hasRawMaterialInFirstSlot && canInsertAmountIntoOutputSlot(inventory, 1)
                && canInsertItemIntoOutputSlot(inventory, ModItems.RAW_TITANIUM);
    }


    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(2).getItem() == output || inventory.getStack(2).isEmpty();
    }
    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory, int count) {
        return inventory.getStack(2).getMaxCount() > inventory.getStack(2).getMaxCount() + count;
    }

    }
