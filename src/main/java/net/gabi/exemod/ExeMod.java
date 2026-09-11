package net.gabi.exemod;

import net.fabricmc.api.ModInitializer;

import net.gabi.exemod.item.ModItems;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExeMod implements ModInitializer {
	public static final String MOD_ID = "exemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
