package net.reputationuh.metalsyouneed;

import net.fabricmc.api.ModInitializer;
import net.reputationuh.metalsyouneed.block.ModBlocks;
import net.reputationuh.metalsyouneed.item.ModItems;
import net.reputationuh.metalsyouneed.world.feature.ModConfiguredFeatures;
import net.reputationuh.metalsyouneed.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetalsYouNeed implements ModInitializer {
	public static final String MOD_ID = "metalsyouneed";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModOreGeneration.generateOres();
	}
}
