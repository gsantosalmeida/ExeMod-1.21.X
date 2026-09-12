package net.gabi.exemod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gabi.exemod.ExeMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block BLOCO_TURMALINA_SCHORL = registerBlock("bloco_turmalina_schorl",
            new Block(AbstractBlock
                    .Settings
                    .create()
                    .strength(3F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BLOCO_TURMALINA_INDICOLITA = registerBlock("bloco_turmalina_indicolita",
            new Block(AbstractBlock
                    .Settings
                    .create()
                    .strength(4F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BLOCO_TURMALINA_RUBELITA = registerBlock("bloco_turmalina_rubelita",
            new Block(AbstractBlock
                    .Settings
                    .create()
                    .strength(5F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BLOCO_TURMALINA_PARAIBA = registerBlock("bloco_turmalina_paraiba",
            new Block(AbstractBlock
                    .Settings
                    .create()
                    .strength(6F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ExeMod.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(ExeMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlock() {
        ExeMod.LOGGER.info("Registering ModItems for " + ExeMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
           entries.add(ModBlocks.BLOCO_TURMALINA_SCHORL);
            entries.add(ModBlocks.BLOCO_TURMALINA_INDICOLITA);
            entries.add(ModBlocks.BLOCO_TURMALINA_RUBELITA);
            entries.add(ModBlocks.BLOCO_TURMALINA_PARAIBA);
        });
    }
}
