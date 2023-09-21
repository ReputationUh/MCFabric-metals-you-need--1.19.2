package net.reputationuh.metalsyouneed;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.reputationuh.metalsyouneed.screen.IndustrialBlastFurnaceScreen;
import net.reputationuh.metalsyouneed.screen.ModScreenHandlers;

public class MetalsYouNeedClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.INDUSTRIAL_BLAST_FURNACE_SCREEN_HANDLER, IndustrialBlastFurnaceScreen::new);
    }
}
