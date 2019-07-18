package com.poboy975.mcjtytutorial.blocks;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {
    @ObjectHolder("mcjtytutorial:firstblock")
    public static FirstBlock FIRSTBLOCK;

    @ObjectHolder("mcjtytutorial:firstblock")
    public static TileEntityType<FirstBlockTile> FIRSTBLOCK_TILE;

    @ObjectHolder("mcjtytutorial:firstblock")
    public static ContainerType<FirstBlockContainer> FIRSTBLOCK_CONTAINER;

}
