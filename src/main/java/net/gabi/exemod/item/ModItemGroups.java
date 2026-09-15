package net.gabi.exemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gabi.exemod.ExeMod;
import net.gabi.exemod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TURMALINA_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ExeMod.MOD_ID, "itens_turmalinas"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TURMALINA_RUBELITA))
                    .displayName(Text.translatable("itemgroup.exemod.item_turmalina"))
                    .entries((displayContext, entries) ->{
                        entries.add(ModItems.TURMALINA_RUBELITA);
                        entries.add(ModItems.TURMALINA_INDICOLITA);
                        entries.add(ModItems.TURMALINA_SCHORL);
                        entries.add(ModItems.TURMALINA_PARAIBA);
                        entries.add(ModItems.TURMALINA_RUBELITA_BRUTA);
                        entries.add(ModItems.TURMALINA_INDICOLITA_BRUTA);
                        entries.add(ModItems.TURMALINA_SCHORL_BRUTA);
                        entries.add(ModItems.TURMALINA_PARAIBA_BRUTA);
                    }).build());

    public static final ItemGroup TURMALINA_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ExeMod.MOD_ID, "blocos_turmalinas"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BLOCO_TURMALINA_PARAIBA))
                    .displayName(Text.translatable("itemgroup.exemod.bloco_turmalina"))
                    .entries((displayContext, entries) ->{
                        entries.add(ModBlocks.BLOCO_TURMALINA_RUBELITA);
                        entries.add(ModBlocks.BLOCO_TURMALINA_INDICOLITA);
                        entries.add(ModBlocks.BLOCO_TURMALINA_SCHORL);
                        entries.add(ModBlocks.BLOCO_TURMALINA_PARAIBA);
                        entries.add(ModBlocks.BLOCO_TURMALINA_SCHORL_ORE);
                        entries.add(ModBlocks.BLOCO_TURMALINA_SCHORL_DEEPSLATE);
                        entries.add(ModBlocks.BLOCO_TURMALINA_INDICOLITA_ORE);
                        entries.add(ModBlocks.BLOCO_TURMALINA_INDICOLITA_DEEPSLATE);
                        entries.add(ModBlocks.BLOCO_TURMALINA_RUBELITA_ORE);
                        entries.add(ModBlocks.BLOCO_TURMALINA_RUBELITA_DEEPSLATE);
                        entries.add(ModBlocks.BLOCO_TURMALINA_PARAIBA_ORE);
                        entries.add(ModBlocks.BLOCO_TURMALINA_PARAIBA_DEEPSLATE);
                        entries.add(ModBlocks.MAGIC_BLOCK);
                    }).build());


    public static void registerItemGroups() {
        ExeMod.LOGGER.info("Registering ModItemGroups for " + ExeMod.MOD_ID);
    }
}
