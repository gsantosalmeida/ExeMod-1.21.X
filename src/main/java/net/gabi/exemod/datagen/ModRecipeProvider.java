package net.gabi.exemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gabi.exemod.block.ModBlocks;
import net.gabi.exemod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> TURMALINA_SCHORL_SMELTABLES = List.of(
                ModItems.TURMALINA_SCHORL_BRUTA,
                ModBlocks.BLOCO_TURMALINA_SCHORL_ORE,
                ModBlocks.BLOCO_TURMALINA_SCHORL_DEEPSLATE
        );
        List<ItemConvertible> TURMALINA_INDICOLITA_SMELTABLES = List.of(
                ModItems.TURMALINA_INDICOLITA_BRUTA,
                ModBlocks.BLOCO_TURMALINA_INDICOLITA_ORE,
                ModBlocks.BLOCO_TURMALINA_INDICOLITA_DEEPSLATE
        );
        List<ItemConvertible> TURMALINA_RUBELITA_SMELTABLES = List.of(
                ModItems.TURMALINA_RUBELITA_BRUTA,
                ModBlocks.BLOCO_TURMALINA_RUBELITA_ORE,
                ModBlocks.BLOCO_TURMALINA_RUBELITA_DEEPSLATE
        );
        List<ItemConvertible> TURMALINA_PARAIBA_SMELTABLES = List.of(
                ModItems.TURMALINA_PARAIBA_BRUTA,
                ModBlocks.BLOCO_TURMALINA_PARAIBA_ORE,
                ModBlocks.BLOCO_TURMALINA_PARAIBA_DEEPSLATE
        );
        List<ItemConvertible> BARRA_FERRO_CARVAO_SMELTABLES = List.of(
                ModItems.BARRA_FERRO_CARVAO
        );

        offerSmelting(exporter, TURMALINA_SCHORL_SMELTABLES, RecipeCategory.MISC, ModItems.TURMALINA_SCHORL, 0.25F, 200, "turmalina_schorl");
        offerSmelting(exporter, TURMALINA_INDICOLITA_SMELTABLES, RecipeCategory.MISC, ModItems.TURMALINA_INDICOLITA, 0.25F, 200, "turmalina_indicolita");
        offerSmelting(exporter, TURMALINA_RUBELITA_SMELTABLES, RecipeCategory.MISC, ModItems.TURMALINA_RUBELITA, 0.25F, 200, "turmalina_rubelita");
        offerSmelting(exporter, TURMALINA_PARAIBA_SMELTABLES, RecipeCategory.MISC, ModItems.TURMALINA_PARAIBA, 0.25F, 200, "turmalina_paraiba");
        offerSmelting(exporter, BARRA_FERRO_CARVAO_SMELTABLES, RecipeCategory.MISC, ModItems.BARRA_FERRO_CARVAO, 0.25F, 200, "barra_ferro_carvao");

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.METADE_CARVAO, Items.COAL);

        offerBlasting(exporter, TURMALINA_SCHORL_SMELTABLES, RecipeCategory.MISC, ModItems.TURMALINA_SCHORL, 0.25F, 100, "turmalina_schorl");
        offerBlasting(exporter, TURMALINA_INDICOLITA_SMELTABLES, RecipeCategory.MISC, ModItems.TURMALINA_INDICOLITA, 0.25F, 100, "turmalina_indicolita");
        offerBlasting(exporter, TURMALINA_RUBELITA_SMELTABLES, RecipeCategory.MISC, ModItems.TURMALINA_RUBELITA, 0.25F, 100, "turmalina_rubelita");
        offerBlasting(exporter, TURMALINA_PARAIBA_SMELTABLES, RecipeCategory.MISC, ModItems.TURMALINA_PARAIBA, 0.25F, 100, "turmalina_paraiba");
        offerBlasting(exporter, BARRA_FERRO_CARVAO_SMELTABLES, RecipeCategory.MISC, ModItems.BARRA_FERRO_CARVAO, 0.25F, 100, "barra_ferro_carvao");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TURMALINA_SCHORL, RecipeCategory.DECORATIONS, ModBlocks.BLOCO_TURMALINA_SCHORL);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TURMALINA_INDICOLITA, RecipeCategory.DECORATIONS, ModBlocks.BLOCO_TURMALINA_INDICOLITA);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TURMALINA_RUBELITA, RecipeCategory.DECORATIONS, ModBlocks.BLOCO_TURMALINA_RUBELITA);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TURMALINA_PARAIBA, RecipeCategory.DECORATIONS, ModBlocks.BLOCO_TURMALINA_PARAIBA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BARRA_FERRO_CARVAO)
                .pattern("#@")
                .input('#', ModItems.METADE_CARVAO)
                .input('@', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.METADE_CARVAO), conditionsFromItem(ModItems.METADE_CARVAO))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CABO_ACO)
                .pattern("#")
                .pattern("#")
                .input('#', ModItems.BARRA_ACO)
                .criterion(hasItem(ModItems.BARRA_ACO), conditionsFromItem(ModItems.BARRA_ACO))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MAGIC_BLOCK)
                .pattern("#@")
                .pattern("!$")
                .input('#', ModItems.TURMALINA_INDICOLITA)
                .input('@', ModItems.TURMALINA_PARAIBA)
                .input('!', ModItems.TURMALINA_SCHORL)
                .input('$', ModItems.TURMALINA_RUBELITA)
                .criterion(hasItem(ModItems.TURMALINA_SCHORL), conditionsFromItem(ModItems.TURMALINA_SCHORL))
                .criterion(hasItem(ModItems.TURMALINA_INDICOLITA), conditionsFromItem(ModItems.TURMALINA_INDICOLITA))
                .criterion(hasItem(ModItems.TURMALINA_RUBELITA), conditionsFromItem(ModItems.TURMALINA_RUBELITA))
                .criterion(hasItem(ModItems.TURMALINA_PARAIBA), conditionsFromItem(ModItems.TURMALINA_PARAIBA))
                .offerTo(exporter);

    }
}
