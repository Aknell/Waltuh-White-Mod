package net.aknell.waltuhmod.block.entity;

import net.aknell.waltuhmod.WaltuhWhiteMod;
import net.aknell.waltuhmod.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {

    public static BlockEntityType<SynthesizerBlockEntity> SYNTHESIZER;

    public static void registerAllBlockEntities() {
        SYNTHESIZER = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(WaltuhWhiteMod.MOD_ID, "synthesizer"),
                FabricBlockEntityTypeBuilder.create(SynthesizerBlockEntity::new, ModBlocks.SYNTHESIZER).build(null));
    }

}
