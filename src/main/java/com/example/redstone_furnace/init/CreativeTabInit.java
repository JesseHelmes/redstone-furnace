package com.example.redstone_furnace.init;

import com.example.redstone_furnace.RedstoneFurnaceMod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RedstoneFurnaceMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabInit {
	@SubscribeEvent
	public static void buildContents(BuildCreativeModeTabContentsEvent event) {
		if(event.getTabKey() != CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			return;
		}

		event.getEntries().putAfter(Items.BLAST_FURNACE.getDefaultInstance(),
				ItemInit.REDSTONE_FURNACE.get().getDefaultInstance(),
				CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
	}
}
