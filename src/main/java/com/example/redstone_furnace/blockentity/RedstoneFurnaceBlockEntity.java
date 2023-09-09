package com.example.redstone_furnace.blockentity;

import com.example.redstone_furnace.init.BlockEntityInit;
import com.example.redstone_furnace.menu.RedstoneFurnaceMenu;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class RedstoneFurnaceBlockEntity extends NoFuelFurnaceBlockEntity {
	public RedstoneFurnaceBlockEntity(BlockPos blockPos, BlockState blockState) {
		super(BlockEntityInit.REDSTONE_FURNACE.get(), blockPos, blockState, RecipeType.SMELTING);
	}

	protected Component getDefaultName() {
		return Component.translatable("gui.redstone_furnace.container.redstone_furnace");
	}

	protected AbstractContainerMenu createMenu(int p_59293_, Inventory inventory) {
		return new RedstoneFurnaceMenu(p_59293_, inventory, this, this.dataAccess);
	}

	public static void serverTick(Level level, BlockPos blockPos, BlockState blockState, RedstoneFurnaceBlockEntity entity) {
		boolean flag = level.getBestNeighborSignal(blockPos) > 7;
		entity.updateBurnDuratation(90, flag);

		NoFuelFurnaceBlockEntity.serverTick(level, blockPos, blockState, entity);
	}
}
