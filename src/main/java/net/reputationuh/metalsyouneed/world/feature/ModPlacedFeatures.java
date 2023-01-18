package net.reputationuh.metalsyouneed.world.feature;

import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.placementmodifier.*;
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

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> TITANIUM_ORE_PLACED = PlacedFeatures.register("titanium_ore_placed",
            ModConfiguredFeatures.TITANIUM_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> BAUXITE_ORE_PLACED = PlacedFeatures.register("bauxite_ore_placed",
            ModConfiguredFeatures.BAUXITE_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    public static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    public static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
