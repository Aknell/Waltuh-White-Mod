package net.aknell.waltuhmod.screen;

import net.aknell.waltuhmod.WaltuhWhiteMod;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModScreenHandlers {
    public static ScreenHandlerType<SynthesizerScreenHandler> SYNTHESIZER_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        SYNTHESIZER_SCREEN_HANDLER = Registry.register(
                Registry.SCREEN_HANDLER, new Identifier(WaltuhWhiteMod.MOD_ID, "synthesizer"), new ScreenHandlerType<>(SynthesizerScreenHandler::new));
    }
}
