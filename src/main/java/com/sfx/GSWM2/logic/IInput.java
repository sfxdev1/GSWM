package com.sfx.GSWM2.logic;

import net.minecraft.util.ITickable;

/**
 * Created by Development on 10/3/2016.
 */
public interface IInput<T> extends ITickable{
    T getOutPut();
}
