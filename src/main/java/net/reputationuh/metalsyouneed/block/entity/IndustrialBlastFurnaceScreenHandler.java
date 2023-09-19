package net.reputationuh.metalsyouneed.block.entity;

import net.minecraft.screen.ScreenHandler;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.reputationuh.metalsyouneed.MetalsYouNeed;

public abstract class IndustrialBlastFurnaceScreenHandler extends ScreenHandler {
    private final BlockEntity IndustrialBlastFurnaceBlockEntity;

    public IndustrialBlastFurnaceScreenHandler(int syncId, PlayerInventory playerInventory, BlockEntity blockEntity) {
            super(MetalsYouNeed.INDUSTRIAL_BLAST_FURNACE_SCREEN_HANDLER, syncId);
        this.IndustrialBlastFurnaceBlockEntity = blockEntity;
    }
}

