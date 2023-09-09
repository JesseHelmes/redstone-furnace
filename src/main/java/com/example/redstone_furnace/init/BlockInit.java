package com.example.redstone_furnace.init;

import com.example.redstone_furnace.RedstoneFurnaceMod;
import com.example.redstone_furnace.block.RedstoneFurnace;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RedstoneFurnaceMod.MODID);

	public static final RegistryObject<RedstoneFurnace> REDSTONE_FURNACE = BLOCKS.register("redstone_furnace",
			() -> new RedstoneFurnace(BlockBehaviour.Properties.copy(Blocks.FURNACE)));
}
