package net.aknell.waltuhmod;

import net.aknell.waltuhmod.block.ModBlocks;
import net.aknell.waltuhmod.screen.ModScreenHandlers;
import net.aknell.waltuhmod.screen.SynthesizerScreen;
import net.aknell.waltuhmod.screen.SynthesizerScreenHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.registry.Registry;

public class WaltuhWhiteModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.METH_GLASS, RenderLayer.getTranslucent());

        HandledScreens.register(ModScreenHandlers.SYNTHESIZER_SCREEN_HANDLER, SynthesizerScreen::new);
    }
}
