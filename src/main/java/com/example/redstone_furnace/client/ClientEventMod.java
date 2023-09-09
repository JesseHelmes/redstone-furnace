package com.example.redstone_furnace.client;

import com.example.redstone_furnace.RedstoneFurnaceMod;
import com.example.redstone_furnace.client.screen.RedstoneFurnaceScreen;
import com.example.redstone_furnace.init.MenuInit;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = RedstoneFurnaceMod.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEventMod {
	public static void init(final FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MenuInit.REDSTONE_FURNACE.get(), RedstoneFurnaceScreen::new);
		});
	}
}
