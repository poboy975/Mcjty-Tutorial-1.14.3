package com.poboy975.mcjtytutorial.setup;

import com.poboy975.mcjtytutorial.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    // this creates the creative tab item groups
    public ItemGroup itemgroup = new ItemGroup("mcjtytutorial") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.FIRSTBLOCK);
        }
    };

    public void init() {

    }
}
