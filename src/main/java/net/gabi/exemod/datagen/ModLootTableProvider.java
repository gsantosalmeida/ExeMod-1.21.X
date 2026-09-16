package net.gabi.exemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.gabi.exemod.block.ModBlocks;
import net.gabi.exemod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MAGIC_BLOCK);
        addDrop(ModBlocks.BLOCO_TURMALINA_INDICOLITA);
        addDrop(ModBlocks.BLOCO_TURMALINA_RUBELITA);
        addDrop(ModBlocks.BLOCO_TURMALINA_PARAIBA);
        addDrop(ModBlocks.BLOCO_TURMALINA_SCHORL);

        addDrop(ModBlocks.BLOCO_TURMALINA_RUBELITA_DEEPSLATE, multipleOreDrops(ModBlocks.BLOCO_TURMALINA_RUBELITA_DEEPSLATE, ModItems.TURMALINA_RUBELITA_BRUTA, 1, 5));
        addDrop(ModBlocks.BLOCO_TURMALINA_INDICOLITA_DEEPSLATE, multipleOreDrops(ModBlocks.BLOCO_TURMALINA_INDICOLITA_DEEPSLATE, ModItems.TURMALINA_INDICOLITA_BRUTA, 2, 5));
        addDrop(ModBlocks.BLOCO_TURMALINA_PARAIBA_DEEPSLATE, multipleOreDrops(ModBlocks.BLOCO_TURMALINA_PARAIBA_DEEPSLATE, ModItems.TURMALINA_PARAIBA_BRUTA, 1, 5));
        addDrop(ModBlocks.BLOCO_TURMALINA_SCHORL_DEEPSLATE, multipleOreDrops(ModBlocks.BLOCO_TURMALINA_SCHORL_DEEPSLATE, ModItems.TURMALINA_SCHORL_BRUTA, 2, 5));

        addDrop(ModBlocks.BLOCO_TURMALINA_RUBELITA_ORE, multipleOreDrops(ModBlocks.BLOCO_TURMALINA_RUBELITA_ORE, ModItems.TURMALINA_RUBELITA_BRUTA, 1, 4));
        addDrop(ModBlocks.BLOCO_TURMALINA_INDICOLITA_ORE, multipleOreDrops(ModBlocks.BLOCO_TURMALINA_INDICOLITA_ORE, ModItems.TURMALINA_INDICOLITA_BRUTA, 2, 4));
        addDrop(ModBlocks.BLOCO_TURMALINA_PARAIBA_ORE, multipleOreDrops(ModBlocks.BLOCO_TURMALINA_PARAIBA_ORE, ModItems.TURMALINA_PARAIBA_BRUTA, 1, 4));
        addDrop(ModBlocks.BLOCO_TURMALINA_SCHORL_ORE, multipleOreDrops(ModBlocks.BLOCO_TURMALINA_SCHORL_ORE, ModItems.TURMALINA_SCHORL_BRUTA, 2, 4));
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
