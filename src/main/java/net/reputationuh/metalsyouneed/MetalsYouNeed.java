package net.reputationuh.metalsyouneed;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.util.Identifier;
import net.reputationuh.metalsyouneed.block.ModBlocks;
import net.reputationuh.metalsyouneed.block.entity.ModBlockEntities;
import net.reputationuh.metalsyouneed.item.ModItems;
import net.reputationuh.metalsyouneed.recipe.ModRecipes;
import net.reputationuh.metalsyouneed.screen.ModScreenHandlers;
import net.reputationuh.metalsyouneed.world.feature.ModConfiguredFeatures;
import net.reputationuh.metalsyouneed.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetalsYouNeed implements ModInitializer {
	public static final String MOD_ID = "metalsyouneed";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
//	public static final Identifier INDUSTRIAL_BLAST_FURNACE_ID = new Identifier(MOD_ID, "industrial_blast_furnace");


	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModOreGeneration.generateOres();

		ModBlockEntities.registerBlockEntities();

		ModScreenHandlers.registerAllScreenHandlers();
//		ServerTickEvents.START_SERVER_TICK.register(new PlayerTickHandler());


	}
}

