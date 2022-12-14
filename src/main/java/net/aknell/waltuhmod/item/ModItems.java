package net.aknell.waltuhmod.item;

import net.aknell.waltuhmod.WaltuhWhiteMod;
import net.aknell.waltuhmod.item.drinks.ModDrinkItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item CHLORINE = registerItem("chlorine",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(8)));
    public static final Item HYDROCHLORIC_ACID = registerItem("hydrochloric_acid",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(8)));
    public static final Item SALT = registerItem("salt",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(64)));
    public static final Item SALINE = registerItem("saline",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(8)));
    public static final Item METHANE = registerItem("methane",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(8)));
    public static final Item HYDROGEN_CYANIDE = registerItem("hydrogen_cyanide",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(8)));
    public static final Item SODIUM_HYDROXIDE = registerItem("sodium_hydroxide",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(8)));
    public static final Item SODIUM_CYANIDE = registerItem("sodium_cyanide",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(8)));
    public static final Item TOLUENE = registerItem("toluene",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(8)));
    public static final Item BENZYL_CHLORIDE = registerItem("benzyl_chloride",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(8)));
    public static final Item BENZYL_CYANIDE = registerItem("benzyl_cyanide",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(8)));
    public static final Item PHENYLACETIC_ACID = registerItem("phenylacetic_acid",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(8)));
    public static final Item ACETIC_ANHYDRIDE = registerItem("acetic_anhydride",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(8)));
    public static final Item AMPHETAMINE = registerItem("amphetamine",
            new ModDrinkItem(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(8).rarity(Rarity.RARE).food(ModFoodComponents.AMPHETAMINE)));
    public static final Item PHENYLACETONE = registerItem("phenylacetone",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(8)));
    public static final Item METHYLAMINE = registerItem("methylamine",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(8)));
    public static final Item RAW_METH = registerItem("raw_meth",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).maxCount(16).rarity(Rarity.RARE)));
    public static final Item METHAMPHETAMINE = registerItem("methamphetamine",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).rarity(Rarity.RARE).food(ModFoodComponents.METHAMPHETAMINE)));

    public static final Item CRYSTAL_METH = registerItem("crystal_meth",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE).rarity(Rarity.RARE)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(WaltuhWhiteMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WaltuhWhiteMod.LOGGER.debug("Registering Mod Items for " + WaltuhWhiteMod.MOD_ID);
    }

}
