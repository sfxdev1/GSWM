package com.sfx.GSWM2.blocks;

import com.sfx.GSWM2.tileentitys.TileEntityNode;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Development on 10/3/2016.
 */
public class Node extends Block implements ITileEntityProvider{
    @com.sfx.GSWM2.annotations.Material
    public static Material material = Material.IRON;

    public Node(Material materialIn) {
        super(materialIn);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityNode();
    }
}
