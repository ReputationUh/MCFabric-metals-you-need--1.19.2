package net.reputationuh.metalsyouneed.world.feature;

import net.reputationuh.metalsyouneed.MetalsYouNeed;
import net.reputationuh.metalsyouneed.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;
public class ModConfiguredFeatures {
    public static void registerConfiguredFeatures(){
         MetalsYouNeed.LOGGER.debug("Registering the ModConfiguredFeatures for "+ MetalsYouNeed.MOD_ID);
    }
    public static final List<OreFeatureConfig.Target> OVERWORLD_TITANIUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.TITANIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_TITANIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TITANIUM_ORE =
            ConfiguredFeatures.register("titanium_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_TITANIUM_ORES, 6));



    public static final List<OreFeatureConfig.Target> OVERWORLD_BAUXITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.BAUXITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_BAUXITE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BAUXITE_ORE =
            ConfiguredFeatures.register("bauxite_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_BAUXITE_ORES, 9));

}
