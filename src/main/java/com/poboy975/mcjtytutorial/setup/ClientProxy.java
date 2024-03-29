package com.poboy975.mcjtytutorial.setup;

import com.poboy975.mcjtytutorial.blocks.FirstBlockScreen;
import com.poboy975.mcjtytutorial.blocks.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {

    @Override
    public void init() {
        ScreenManager.registerFactory(ModBlocks.FIRSTBLOCK_CONTAINER, FirstBlockScreen::new);
    }

    @Override
    public World getClientWorld() {

        return Minecraft.getInstance().world;
    }

    @Override
    public PlayerEntity getClientPlayer() {
        return Minecraft.getInstance().player;

    }
}
