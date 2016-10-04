package com.sfx.GSWM2.logic;

import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;

/**
 * Created by Development on 10/3/2016.
 */
public interface IOutput <T> extends ITickable{
    void setInputLocation(BlockPos pos);
}
