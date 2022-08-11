package net.aknell.waltuhmod.recipe;

import net.aknell.waltuhmod.WaltuhWhiteMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {

    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(WaltuhWhiteMod.MOD_ID, SynthesizerRecipe.Serializer.ID), SynthesizerRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(WaltuhWhiteMod.MOD_ID, SynthesizerRecipe.Type.ID), SynthesizerRecipe.Type.INSTANCE);
    }

}
