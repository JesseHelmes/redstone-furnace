package com.example.redstone_furnace.client.screen;

import com.example.redstone_furnace.RedstoneFurnaceMod;
import com.example.redstone_furnace.menu.RedstoneFurnaceMenu;

import net.minecraft.client.gui.screens.recipebook.SmeltingRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RedstoneFurnaceScreen extends NoFuelFurnaceScreen<RedstoneFurnaceMenu> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(RedstoneFurnaceMod.MODID, "textures/gui/redstone_furnace.png");

	public RedstoneFurnaceScreen(RedstoneFurnaceMenu menu, Inventory inventory, Component component) {
		super(menu, new SmeltingRecipeBookComponent(), inventory, component, TEXTURE);
	}
}