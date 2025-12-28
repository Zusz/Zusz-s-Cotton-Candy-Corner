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
    public static final Item BLACK_COTTON_CANDY = registerItem("black_cotton_candy", new Item(new Item.Settings()));
    public static final Item BLUE_COTTON_CANDY = registerItem("blue_cotton_candy", new Item(new Item.Settings()));
    public static final Item BROWN_COTTON_CANDY = registerItem("brown_cotton_candy", new Item(new Item.Settings()));
    public static final Item CYAN_COTTON_CANDY = registerItem("cyan_cotton_candy", new Item(new Item.Settings()));
    public static final Item GRAY_COTTON_CANDY = registerItem("gray_cotton_candy", new Item(new Item.Settings()));
    public static final Item GREEN_COTTON_CANDY = registerItem("green_cotton_candy", new Item(new Item.Settings()));
    public static final Item LIGHT_BLUE_COTTON_CANDY = registerItem("light_blue_cotton_candy", new Item(new Item.Settings()));
    public static final Item LIGHT_GRAY_COTTON_CANDY = registerItem("light_gray_cotton_candy", new Item(new Item.Settings()));
    public static final Item LIME_COTTON_CANDY = registerItem("lime_cotton_candy", new Item(new Item.Settings()));
    public static final Item MAGENTA_COTTON_CANDY = registerItem("magenta_cotton_candy", new Item(new Item.Settings()));
    public static final Item ORANGE_COTTON_CANDY = registerItem("orange_cotton_candy", new Item(new Item.Settings()));
    public static final Item PINK_COTTON_CANDY = registerItem("pink_cotton_candy", new Item(new Item.Settings()));
    public static final Item PURPLE_COTTON_CANDY = registerItem("purple_cotton_candy", new Item(new Item.Settings()));
    public static final Item RED_COTTON_CANDY = registerItem("red_cotton_candy", new Item(new Item.Settings()));
    public static final Item WHITE_COTTON_CANDY = registerItem("white_cotton_candy", new Item(new Item.Settings()));
    public static final Item YELLOW_COTTON_CANDY = registerItem("yellow_cotton_candy", new Item(new Item.Settings()));



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
