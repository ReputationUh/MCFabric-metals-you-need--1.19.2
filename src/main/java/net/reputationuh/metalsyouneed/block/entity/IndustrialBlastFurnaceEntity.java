package net.reputationuh.metalsyouneed.block.entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.reputationuh.metalsyouneed.block.entity.ImplementedInventory;
import net.minecraft.util.math.BlockPos;
import net.reputationuh.metalsyouneed.block.entity.ModBlockEntity;

public class IndustrialBlastFurnaceEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);

    public IndustrialBlastFurnaceEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntity.INDUSTRIAL_BLAST_FURNACE, pos, state);
    }

    public DefaultedList<ItemStack> getInventory() {
        return this.inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Industrial Blast Furnace");
    }

    public ScreenHandler createMenu(int Sync, PlayerInventory inv, PlayerEntity player){
        return new IndustrialBlastFurnaceScreenHandler(Sync, inv, this);
    }
}
