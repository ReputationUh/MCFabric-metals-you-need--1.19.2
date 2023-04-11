package net.reputationuh.metalsyouneed.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.shape.VoxelSet;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.gen.carver.RavineCarverConfig;

public class IndustrialBlastFurnaceBlock extends HorizontalFacingBlock implements BlockEntityProvider {
    public static final DirectionProperty FACING = Properties.HOPPER_FACING;

    public IndustrialBlastFurnaceBlock(Settings settings) { super(settings);}

    private static VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 10, 16);

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public BlockEntity createBlockEntity(BlockView blockView){
        return new IndustrialBlastFurnaceBlockEntity();
    }

}
