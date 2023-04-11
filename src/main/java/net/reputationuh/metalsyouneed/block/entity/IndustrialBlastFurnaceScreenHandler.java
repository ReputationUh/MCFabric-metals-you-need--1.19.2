package net.reputationuh.metalsyouneed.block.entity;

import net.minecraft.screen.ScreenHandler;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.reputationuh.metalsyouneed.MetalsYouNeed;
import net.reputationuh.metalsyouneed.block.entity.ImplementedInventory;
import net.minecraft.util.math.BlockPos;
import net.reputationuh.metalsyouneed.block.entity.ModBlockEntity;

public class IndustrialBlastFurnaceScreenHandler extends ScreenHandler {
    private final BlockEntity blockEntity;

    public IndustrialBlastFurnaceScreenHandler(int syncId, PlayerInventory playerInventory, BlockEntity blockEntity) {
            super(MetalsYouNeed.MY_CUSTOM_BLOCK_SCREEN_HANDLER_TYPE, syncId);
        this.blockEntity = blockEntity;
}
