package com.example.redstone_furnace.init;

import com.example.redstone_furnace.RedstoneFurnaceMod;
import com.example.redstone_furnace.menu.RedstoneFurnaceMenu;

import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MenuInit {
	public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, RedstoneFurnaceMod.MODID);

	public static final RegistryObject<MenuType<RedstoneFurnaceMenu>> REDSTONE_FURNACE = MENUS.register("redstone_furnace_menu",
			(() -> IForgeMenuType.create((pWindowID, pInventory, pData) -> {
				return new RedstoneFurnaceMenu(pWindowID, pInventory);
			})));

	// TODO test this
//	() -> new MenuType<SolarFurnaceMenu>(SolarFurnaceMenu::new, FeatureFlags.DEFAULT_FLAGS));
}
