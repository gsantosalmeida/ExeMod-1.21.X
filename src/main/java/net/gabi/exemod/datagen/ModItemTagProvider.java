package net.gabi.exemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gabi.exemod.block.ModBlocks;
import net.gabi.exemod.item.ModItems;
import net.gabi.exemod.util.ModTags;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ModTags.Items.ITENS_TRANSFORMS)
                .add(ModItems.TURMALINA_INDICOLITA)
                .add(ModItems.TURMALINA_SCHORL)
                .add(ModItems.TURMALINA_PARAIBA)
                .add(ModItems.TURMALINA_RUBELITA);
    }
}
