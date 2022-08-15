package net.aknell.waltuhmod;

import net.aknell.waltuhmod.block.ModBlocks;
import net.aknell.waltuhmod.block.entity.ModBlockEntities;
import net.aknell.waltuhmod.item.ModItems;
import net.aknell.waltuhmod.recipe.ModRecipes;
import net.aknell.waltuhmod.screen.ModScreenHandlers;
import net.aknell.waltuhmod.util.ModLootTableModifiers;
import net.aknell.waltuhmod.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WaltuhWhiteMod implements ModInitializer {
	public static final String MOD_ID = "waltuhmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();

		ModBlockEntities.registerAllBlockEntities();
		ModRecipes.registerRecipes();

		ModLootTableModifiers.modifyLootTables();

		ModScreenHandlers.registerAllScreenHandlers();

	}
}
