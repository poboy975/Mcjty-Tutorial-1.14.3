package com.poboy975.mcjtytutorial.setup;

import net.minecraft.world.World;

public interface IProxy {

    void init();

    World getClientWorld();
}
