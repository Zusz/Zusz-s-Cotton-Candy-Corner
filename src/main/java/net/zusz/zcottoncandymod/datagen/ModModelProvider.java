package net.zusz.zcottoncandymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.zusz.zcottoncandymod.block.ModBlocks;
import net.zusz.zcottoncandymod.item.ModItems;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createSingletonBlockState(
                        ModBlocks.SUGAR_SACK,
                        Models.CUBE_BOTTOM_TOP.upload(
                                ModBlocks.SUGAR_SACK,
                                new TextureMap()
                                        .put(TextureKey.TOP, Identifier.of("zcottoncandymod", "block/sugar_sack_top"))
                                        .put(TextureKey.BOTTOM, Identifier.of("zcottoncandymod", "block/sack_bottom"))
                                        .put(TextureKey.SIDE, Identifier.of("zcottoncandymod", "block/sack_side")),
                                blockStateModelGenerator.modelCollector
                        )
                )
        );
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COTTON_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_COTTON_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_COTTON_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROWN_COTTON_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_COTTON_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_COTTON_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_COTTON_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_BLUE_COTTON_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_GRAY_COTTON_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME_COTTON_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGENTA_COTTON_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_COTTON_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_COTTON_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_COTTON_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_COTTON_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_COTTON_CANDY, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_COTTON_CANDY, Models.GENERATED);

    }
}
