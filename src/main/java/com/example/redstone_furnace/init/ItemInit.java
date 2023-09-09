package com.example.redstone_furnace.init;

import com.example.redstone_furnace.RedstoneFurnaceMod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			RedstoneFurnaceMod.MODID);

	public static final RegistryObject<BlockItem> REDSTONE_FURNACE = ITEMS.register("redstone_furnace",
			() -> new BlockItem(BlockInit.REDSTONE_FURNACE.get(),
					(new Item.Properties())));
}
