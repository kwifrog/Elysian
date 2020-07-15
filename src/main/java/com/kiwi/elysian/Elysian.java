package com.kiwi.elysian;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Elysian.MODID)
public class Elysian {

    public static final String MODID = "elysian";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final ItemGroup TAB = new ItemGroup("elysianTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.STONE_BRICKS);
        }
    };

}