package net.reputationuh.metalsyouneed.screen;

import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandlers {
    public static ScreenHandlerType<IndustrialBlastFurnaceScreenHandler> INDUSTRIAL_BLAST_FURNACE_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        INDUSTRIAL_BLAST_FURNACE_SCREEN_HANDLER = new ScreenHandlerType<>(IndustrialBlastFurnaceScreenHandler::new);
    }
}