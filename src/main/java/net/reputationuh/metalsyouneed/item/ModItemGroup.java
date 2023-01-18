package net.reputationuh.metalsyouneed.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.reputationuh.metalsyouneed.MetalsYouNeed;

public class ModItemGroup {
    public static final ItemGroup TITANIUM = FabricItemGroupBuilder.build(
            new Identifier(MetalsYouNeed.MOD_ID, "titanium"), () -> new ItemStack(ModItems.TITANIUM));


}
