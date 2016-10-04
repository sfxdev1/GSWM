package com.sfx.GSWM2.blocks;

import com.sfx.GSWM2.annotations.Block;
import com.sfx.GSWM2.annotations.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.lang.reflect.Field;

/**
 * Created by Development on 10/3/2016.
 */
public class GSWMBlocks {
    @Block(name = "block_greenstone")
    public static GreenStoneBlock greenStoneBlock;
    public static void init(){
        for (Field field : GSWMBlocks.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(Block.class)) {
                boolean temp = field.isAccessible();
                field.setAccessible(true);
                try {
                    Class c = field.getType();
                    Field material = c.getField("material");
                    if (material.isAnnotationPresent(Material.class)) {
                        field.set(null,field.getType().getConstructor(Material.class).newInstance(material.getType().cast(material.get(null))));
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }
                field.setAccessible(temp);
            }
        }
    }
    public static void register(){
        for (Field field : GSWMBlocks.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(Block.class)) {
                Block meta = field.getAnnotation(Block.class);
                try {
                    net.minecraft.block.Block block = (net.minecraft.block.Block) field.get(null);
                    block.setRegistryName(meta.name());
                    block.setUnlocalizedName(meta.name());
                    GameRegistry.register(block);
                    field.set(null,block);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
