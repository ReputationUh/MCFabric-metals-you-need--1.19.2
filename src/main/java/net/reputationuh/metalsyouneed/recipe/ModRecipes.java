package net.reputationuh.metalsyouneed.recipe;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.reputationuh.metalsyouneed.MetalsYouNeed;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MetalsYouNeed.MOD_ID, IndustrialBlustingFurnaceRecipe.Serializer.ID),
                IndustrialBlustingFurnaceRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(MetalsYouNeed.MOD_ID, IndustrialBlustingFurnaceRecipe.Type.ID),
                IndustrialBlustingFurnaceRecipe.Type.INSTANCE);
    }
}
