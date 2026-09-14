package net.gabi.exemod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gabi.exemod.ExeMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import static com.ibm.icu.impl.duration.impl.DataRecord.EGender.F;

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
                    .strength(3F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BLOCO_TURMALINA_RUBELITA = registerBlock("bloco_turmalina_rubelita",
            new Block(AbstractBlock
                    .Settings
                    .create()
                    .strength(3.5F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BLOCO_TURMALINA_PARAIBA = registerBlock("bloco_turmalina_paraiba",
            new Block(AbstractBlock
                    .Settings
                    .create()
                    .strength(3.5F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BLOCO_TURMALINA_SCHORL_ORE = registerBlock("bloco_turmalina_schorl_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
            AbstractBlock.Settings.create().strength(3F).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block BLOCO_TURMALINA_SCHORL_DEEPSLATE = registerBlock("bloco_turmalina_schorl_deepslate",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,6),
            AbstractBlock.Settings.create().strength(4.5F).requiresTool().sounds(BlockSoundGroup.STONE)));


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
            entries.add(ModBlocks.BLOCO_TURMALINA_SCHORL_ORE);
            entries.add(ModBlocks.BLOCO_TURMALINA_SCHORL_DEEPSLATE);
        });
    }
}
