package net.zusz.zcottoncandymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zusz.zcottoncandymod.ZCottonCandyMod;

public class ModItems {

    public static final Item COTTON_CANDY = registerItem("cotton_candy", new Item(new Item.Settings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ZCottonCandyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ZCottonCandyMod.LOGGER.info("Registering Mod Items for " + ZCottonCandyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(COTTON_CANDY);
        });
    }
}
