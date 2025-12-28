package net.zusz.zcottoncandymod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zusz.zcottoncandymod.ZCottonCandyMod;
import net.zusz.zcottoncandymod.block.custom.CottonCandyMachineBlock;

public class ModBlocks {
    public static final Block SUGAR_SACK = registerBlock("sugar_sack",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block COTTON_CANDY_MACHINE = registerBlock("cotton_candy_machine",
            new CottonCandyMachineBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ZCottonCandyMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ZCottonCandyMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ZCottonCandyMod.LOGGER.info("Registering Mod Blocks for" + ZCottonCandyMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.SUGAR_SACK);
        });
    }
}
