package interemp.testmod.core;

import interemp.testmod.items.ingots.IngotDepletedUranium;
import interemp.testmod.items.ingots.IngotEnrichedUranium;
import interemp.testmod.items.ingots.IngotPlutonium;
import interemp.testmod.items.ingots.IngotSteel;
import interemp.testmod.items.ingots.IngotThorium;
import interemp.testmod.items.ingots.IngotUranium;
import interemp.testmod.lib.ItemReference;
import net.minecraft.item.Item;

public class ItemManager {
    // register recipes
    
    public static Item ingotThorium;
    public static Item ingotUranium;
    public static Item ingotDepletedUranium;
    public static Item ingotEnrichedUranium;
    public static Item ingotSteel;
    public static Item ingotPlutonium;
    
    public static void init() {
        ingotThorium = new IngotThorium(ItemReference.ID_INGOT_THORIUM);
        ingotUranium = new IngotUranium(ItemReference.ID_INGOT_URANIUM);
        ingotDepletedUranium = new IngotDepletedUranium(ItemReference.ID_INGOT_DEPLETED_URANIUM);
        ingotEnrichedUranium = new IngotEnrichedUranium(ItemReference.ID_INGOT_ENRICHED_URANIUM);
        ingotSteel = new IngotSteel(ItemReference.ID_INGOT_STEEL);
        ingotPlutonium = new IngotPlutonium(ItemReference.ID_INGOT_PLUTONIUM);
    }
}
