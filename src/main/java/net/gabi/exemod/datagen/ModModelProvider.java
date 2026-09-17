package net.gabi.exemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gabi.exemod.block.ModBlocks;
import net.gabi.exemod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCO_TURMALINA_INDICOLITA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCO_TURMALINA_SCHORL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCO_TURMALINA_RUBELITA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCO_TURMALINA_PARAIBA);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCO_TURMALINA_INDICOLITA_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCO_TURMALINA_SCHORL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCO_TURMALINA_RUBELITA_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCO_TURMALINA_PARAIBA_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCO_TURMALINA_INDICOLITA_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCO_TURMALINA_SCHORL_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCO_TURMALINA_RUBELITA_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCO_TURMALINA_PARAIBA_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TURMALINA_SCHORL, Models.GENERATED);
        itemModelGenerator.register(ModItems.TURMALINA_INDICOLITA, Models.GENERATED);
        itemModelGenerator.register(ModItems.TURMALINA_RUBELITA, Models.GENERATED);
        itemModelGenerator.register(ModItems.TURMALINA_PARAIBA, Models.GENERATED);
        itemModelGenerator.register(ModItems.TURMALINA_SCHORL_BRUTA, Models.GENERATED);
        itemModelGenerator.register(ModItems.TURMALINA_INDICOLITA_BRUTA, Models.GENERATED);
        itemModelGenerator.register(ModItems.TURMALINA_RUBELITA_BRUTA, Models.GENERATED);
        itemModelGenerator.register(ModItems.TURMALINA_PARAIBA_BRUTA, Models.GENERATED);
        itemModelGenerator.register(ModItems.ESTRELA_INCANDESCENTE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BARRA_ACO, Models.GENERATED);
        itemModelGenerator.register(ModItems.BARRA_FERRO_CARVAO, Models.GENERATED);
        itemModelGenerator.register(ModItems.CABO_ACO, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.COUVE_FLOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.METADE_CARVAO, Models.GENERATED);
        itemModelGenerator.register(ModItems.ESTANHO_BRUTO, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZINCO_BRUTO, Models.GENERATED);
    }
}
