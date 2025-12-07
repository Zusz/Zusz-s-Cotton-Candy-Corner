package net.zusz.zcottoncandymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zusz.zcottoncandymod.ZCottonCandyMod;
import net.zusz.zcottoncandymod.blocks.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup COTTON_CANDY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ZCottonCandyMod.MOD_ID, "cotton_candy_items"),
            FabricItemGroup.builder()
                    .icon(()-> new ItemStack(ModItems.COTTON_CANDY))
                    .displayName(Text.translatable("itemgroup.zcottoncandymod.cotton_candy_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.COTTON_CANDY);
                        entries.add(ModBlocks.SUGAR_SACK);
                    })
                    .build());

    public static void registerItemGroups() {
        ZCottonCandyMod.LOGGER.info("Registering Item Groups for " + ZCottonCandyMod.MOD_ID);
    }
}
