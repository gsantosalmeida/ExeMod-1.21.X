package net.gabi.exemod.block;

import net.gabi.exemod.ExeMod;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {


    private static Block registerBlock(String name, Block block){
        return Registry.register(Registries.BLOCK, Identifier.of(ExeMod.MOD_ID, name), block);
    }
    public static void registerModBlocks() {
        ExeMod.LOGGER.info("Registering ModBlocks" + ExeMod.MOD_ID);
    }

}
