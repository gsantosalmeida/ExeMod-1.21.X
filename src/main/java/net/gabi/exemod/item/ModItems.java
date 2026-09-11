package net.gabi.exemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gabi.exemod.ExeMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems{
    public static final Item TURMALINA_SCHORL = registerItem("turmalina_schorl", new Item(new Item.Settings()));
    public static final Item TURMALINA_INDICOLITA = registerItem("turmalina_indicolita", new Item(new Item.Settings()));
    public static final Item TURMALINA_RUBELITA = registerItem("turmalina_rubelita", new Item(new Item.Settings()));
    public static final Item TURMALINA_PARAIBA = registerItem("turmalina_paraiba", new Item(new Item.Settings()));
    public static final Item TURMALINA_SCHORL_BRUTA = registerItem("turmalina_schorl_bruta", new Item(new Item.Settings()));
    public static final Item TURMALINA_INDICOLITA_BRUTA = registerItem("turmalina_indicolita_bruta", new Item(new Item.Settings()));
    public static final Item TURMALINA_RUBELITA_BRUTA = registerItem("turmalina_rubelita_bruta", new Item(new Item.Settings()));
    public static final Item TURMALINA_PARAIBA_BRUTA = registerItem("turmalina_paraiba_bruta", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ExeMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ExeMod.LOGGER.info("Registering ModItems" + ExeMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TURMALINA_SCHORL);
            entries.add(TURMALINA_INDICOLITA);
            entries.add(TURMALINA_RUBELITA);
            entries.add(TURMALINA_PARAIBA);
            entries.add(TURMALINA_SCHORL_BRUTA);
            entries.add(TURMALINA_INDICOLITA_BRUTA);
            entries.add(TURMALINA_RUBELITA_BRUTA);
            entries.add(TURMALINA_PARAIBA_BRUTA);
        });
    }
}
