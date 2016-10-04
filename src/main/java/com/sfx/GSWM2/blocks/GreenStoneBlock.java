package com.sfx.GSWM2.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/*
 * Created by Development on 10/3/2016.
 */
public class GreenStoneBlock extends Block{
    @com.sfx.GSWM2.annotations.Material
    public static Material material = Material.IRON;

    public GreenStoneBlock(Material materialIn) {
        super(materialIn);
    }

}
