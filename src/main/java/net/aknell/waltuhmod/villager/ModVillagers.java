package net.aknell.waltuhmod.villager;

import com.google.common.collect.ImmutableSet;
import net.aknell.waltuhmod.WaltuhWhiteMod;
import net.aknell.waltuhmod.block.ModBlocks;
import net.aknell.waltuhmod.block.entity.ModBlockEntities;
import net.aknell.waltuhmod.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {

    public static final PointOfInterestType DEALER_POI = registerPOI("dealer_poi", ModBlocks.SYNTHESIZER);
    public static final VillagerProfession DEALER = registerProfession("dealer",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(WaltuhWhiteMod.MOD_ID, "dealer_poi")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(WaltuhWhiteMod.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(WaltuhWhiteMod.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_CLERIC).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(WaltuhWhiteMod.MOD_ID, name),
                1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

    public static void registerVillagers() {
        WaltuhWhiteMod.LOGGER.debug("Registering villagers for " + WaltuhWhiteMod.MOD_ID);
    }

    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(DEALER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PAPER, 25),
                            new ItemStack(Items.EMERALD, 1),
                            16, 4, 0.05f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(Items.BOOKSHELF, 1),
                            12, 3, 0.05f
                    )));
                }
        );
        TradeOfferHelper.registerVillagerOffers(DEALER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(ModItems.AMPHETAMINE, 2),
                            16, 3, 0.05f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(ModItems.METHYLAMINE, 2),
                            7, 2, 0.05f
                    )));
                }
        );
        TradeOfferHelper.registerVillagerOffers(DEALER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(Items.GOLD_INGOT, 8),
                            new ItemStack(ModItems.RAW_METH, 4),
                            8, 4, 0.05f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 9),
                            new ItemStack(ModBlocks.SYNTHESIZER, 1),
                            16, 3, 0.05f
                    )));
                }
        );
        TradeOfferHelper.registerVillagerOffers(DEALER, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 24),
                            new ItemStack(ModBlocks.METH_GLASS, 1),
                            16, 3, 0.05f
                    )));
                }
        );
        TradeOfferHelper.registerVillagerOffers(DEALER, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 48),
                            new ItemStack(Items.DIAMOND, 7),
                            new ItemStack(ModItems.METHAMPHETAMINE, 4),
                            16, 3, 0.05f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(Items.DIAMOND, 2),
                            new ItemStack(ModItems.CRYSTAL_METH, 16),
                            16, 3, 0.05f
                    )));
                }
        );
    }

}
