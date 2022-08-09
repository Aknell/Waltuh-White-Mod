package net.aknell.waltuhmod.item;

import net.aknell.waltuhmod.WaltuhWhiteMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item METHAMPHETAMINE = registerItem("methamphetamine",
            new Item(new FabricItemSettings().group(ModItemGroup.WALTUH_WHITE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(WaltuhWhiteMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WaltuhWhiteMod.LOGGER.debug("Registering Mod Items for " + WaltuhWhiteMod.MOD_ID);
    }

}
