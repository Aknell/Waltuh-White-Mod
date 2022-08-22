package net.aknell.waltuhmod.block;

import net.aknell.waltuhmod.WaltuhWhiteMod;
import net.aknell.waltuhmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block METH_GLASS = registerBlock("meth_glass", new Block(FabricBlockSettings.of(Material.GLASS).strength(4f).requiresTool().nonOpaque()), ModItemGroup.WALTUH_WHITE);
    public static final Block SYNTHESIZER = registerBlock("synthesizer", new SynthesizerBlock(FabricBlockSettings.of(Material.METAL).strength(4f).nonOpaque()), ModItemGroup.WALTUH_WHITE);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(WaltuhWhiteMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(WaltuhWhiteMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        WaltuhWhiteMod.LOGGER.debug("Registering Mod Blocks for " + WaltuhWhiteMod.MOD_ID);
    }

}
