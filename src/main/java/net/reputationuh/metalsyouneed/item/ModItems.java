package net.reputationuh.metalsyouneed.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.reputationuh.metalsyouneed.MetalsYouNeed;
import net.reputationuh.metalsyouneed.item.custom.ModAxeItem;
import net.reputationuh.metalsyouneed.item.custom.ModHoeItem;
import net.reputationuh.metalsyouneed.item.custom.ModPickaxeItem;

public class ModItems {
    public static final Item IRON_ROD = registerItem("iron_rod",
            new Item(new FabricItemSettings().group(ModItemGroup.TITANIUM)));

    public static final Item RAW_TITANIUM = registerItem("raw_titanium",
            new Item(new FabricItemSettings().group(ModItemGroup.TITANIUM)));

    public static final Item TITANIUM = registerItem("titanium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TITANIUM)));

    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new ShovelItem(ModToolMaterial.TITANIUM, 3, -3f,
                    new FabricItemSettings().group(ModItemGroup.TITANIUM).maxCount(1)));

    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new ModPickaxeItem(ModToolMaterial.TITANIUM, 2, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.TITANIUM).maxCount(1)));

    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new ModAxeItem(ModToolMaterial.TITANIUM, 6, -3f,
                    new FabricItemSettings().group(ModItemGroup.TITANIUM).maxCount(1)));

    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new ModHoeItem(ModToolMaterial.TITANIUM, -2, 0f,
                    new FabricItemSettings().group(ModItemGroup.TITANIUM).maxCount(1)));

    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new SwordItem(ModToolMaterial.TITANIUM, 5, -2.5f,
                    new FabricItemSettings().group(ModItemGroup.TITANIUM).maxCount(1)));

    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TITANIUM)));

    public static final Item BAUXITE = registerItem("bauxite",
            new Item(new FabricItemSettings().group(ModItemGroup.TITANIUM)));


    public static final Item ALUMINIUM_SHOVEL = registerItem("aluminium_shovel",
            new ShovelItem(ModToolMaterial.ALUMINIUM, 1.5f, -3f,
                    new FabricItemSettings().group(ModItemGroup.TITANIUM).maxCount(1)));

    public static final Item ALUMINIUM_PICKAXE = registerItem("aluminium_pickaxe",
            new ModPickaxeItem(ModToolMaterial.ALUMINIUM, 0, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.TITANIUM).maxCount(1)));

    public static final Item ALUMINIUM_AXE = registerItem("aluminium_axe",
            new ModAxeItem(ModToolMaterial.ALUMINIUM, 5.5f, -3f,
                    new FabricItemSettings().group(ModItemGroup.TITANIUM).maxCount(1)));

    public static final Item ALUMINIUM_HOE = registerItem("aluminium_hoe",
            new ModHoeItem(ModToolMaterial.ALUMINIUM, -2, 0f,
                    new FabricItemSettings().group(ModItemGroup.TITANIUM).maxCount(1)));

    public static final Item ALUMINIUM_SWORD = registerItem("aluminium_sword",
            new SwordItem(ModToolMaterial.ALUMINIUM, 3, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.TITANIUM).maxCount(1)));

    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TITANIUM)));

    public static final Item IRON_POWDER = registerItem("iron_powder",
            new Item(new FabricItemSettings().group(ModItemGroup.TITANIUM)));

    public static final Item CARBON_POWDER = registerItem("carbon_powder",
            new Item(new FabricItemSettings().group(ModItemGroup.TITANIUM)));




    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MetalsYouNeed.MOD_ID, name), item);
    }
    public static void registerModItems(){
        MetalsYouNeed.LOGGER.debug("Registering Mod Items for "+ MetalsYouNeed.MOD_ID);

    }
}
