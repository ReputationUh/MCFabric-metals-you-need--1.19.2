package net.reputationuh.metalsyouneed.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import net.reputationuh.metalsyouneed.MetalsYouNeed;
import net.reputationuh.metalsyouneed.block.ModBlocks;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<IndustrialBlastFurnaceEntity> INDUSTRIAL_BLAST_FURNACE;

    public static void registerBlockEntities() {
        INDUSTRIAL_BLAST_FURNACE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(MetalsYouNeed.MOD_ID, "industrial_blast_furnace"),
                FabricBlockEntityTypeBuilder.create(IndustrialBlastFurnaceEntity::new,
                        ModBlocks.INDUSTRIAL_BLAST_FURNACE).build(null));

    }
}
