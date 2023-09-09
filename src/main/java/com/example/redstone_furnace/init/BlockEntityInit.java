package com.example.redstone_furnace.init;

import com.example.redstone_furnace.RedstoneFurnaceMod;
import com.example.redstone_furnace.blockentity.RedstoneFurnaceBlockEntity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityInit {
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
			DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RedstoneFurnaceMod.MODID);

	public static final RegistryObject<BlockEntityType<RedstoneFurnaceBlockEntity>> REDSTONE_FURNACE = BLOCK_ENTITIES
			.register("redstone_furnace",
					() -> BlockEntityType.Builder.of(RedstoneFurnaceBlockEntity::new, BlockInit.REDSTONE_FURNACE.get())
							.build(null));
}
