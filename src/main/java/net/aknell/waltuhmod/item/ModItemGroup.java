package net.aknell.waltuhmod.item;

import net.aknell.waltuhmod.WaltuhWhiteMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup WALTUH_WHITE = FabricItemGroupBuilder.build(
            new Identifier(WaltuhWhiteMod.MOD_ID, "methamphetamine"), () -> new ItemStack(ModItems.METHAMPHETAMINE));

}
