package net.zusz.zcottoncandymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.zusz.zcottoncandymod.ZCottonCandyMod;
import net.zusz.zcottoncandymod.blocks.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SUGAR_SACK, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.SUGAR)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.SUGAR, 9)
                .input(ModBlocks.SUGAR_SACK)
                .criterion(hasItem(ModBlocks.SUGAR_SACK), conditionsFromItem(ModBlocks.SUGAR_SACK))
                .offerTo(recipeExporter, Identifier.of(ZCottonCandyMod.MOD_ID, "sugar_from_sugar_sack"));
    }
}
