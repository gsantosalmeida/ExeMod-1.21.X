package net.gabi.exemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gabi.exemod.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BLOCO_TURMALINA_INDICOLITA)
                .add(ModBlocks.BLOCO_TURMALINA_INDICOLITA_DEEPSLATE)
                .add(ModBlocks.BLOCO_TURMALINA_INDICOLITA_ORE)
                .add(ModBlocks.BLOCO_TURMALINA_SCHORL)
                .add(ModBlocks.BLOCO_TURMALINA_SCHORL_DEEPSLATE)
                .add(ModBlocks.BLOCO_TURMALINA_SCHORL_ORE)
                .add(ModBlocks.BLOCO_TURMALINA_RUBELITA)
                .add(ModBlocks.BLOCO_TURMALINA_RUBELITA_DEEPSLATE)
                .add(ModBlocks.BLOCO_TURMALINA_RUBELITA_ORE)
                .add(ModBlocks.BLOCO_TURMALINA_PARAIBA)
                .add(ModBlocks.BLOCO_TURMALINA_PARAIBA_DEEPSLATE)
                .add(ModBlocks.BLOCO_TURMALINA_PARAIBA_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BLOCO_TURMALINA_INDICOLITA)
                .add(ModBlocks.BLOCO_TURMALINA_INDICOLITA_DEEPSLATE)
                .add(ModBlocks.BLOCO_TURMALINA_INDICOLITA_ORE)
                .add(ModBlocks.BLOCO_TURMALINA_SCHORL)
                .add(ModBlocks.BLOCO_TURMALINA_SCHORL_DEEPSLATE)
                .add(ModBlocks.BLOCO_TURMALINA_SCHORL_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.BLOCO_TURMALINA_RUBELITA)
                .add(ModBlocks.BLOCO_TURMALINA_RUBELITA_DEEPSLATE)
                .add(ModBlocks.BLOCO_TURMALINA_RUBELITA_ORE)
                .add(ModBlocks.BLOCO_TURMALINA_PARAIBA)
                .add(ModBlocks.BLOCO_TURMALINA_PARAIBA_DEEPSLATE)
                .add(ModBlocks.BLOCO_TURMALINA_PARAIBA_ORE);
    }
}
