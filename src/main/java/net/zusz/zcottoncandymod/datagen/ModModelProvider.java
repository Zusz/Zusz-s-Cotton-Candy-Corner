package net.zusz.zcottoncandymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.zusz.zcottoncandymod.blocks.ModBlocks;
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
    }
}
