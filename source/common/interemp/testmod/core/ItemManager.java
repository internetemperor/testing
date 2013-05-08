package interemp.testmod.core;

import interemp.testmod.items.IngotThorium;
import interemp.testmod.items.IngotUranium;
import interemp.testmod.lib.ItemReference;
import net.minecraft.item.Item;

public class ItemManager {
    // register recipes
    
    public static Item ingotThorium;
    public static Item ingotUranium;
    
    public static void init() {
        ingotThorium = new IngotThorium(ItemReference.ID_INGOT_THORIUM);
        ingotUranium = new IngotUranium(ItemReference.ID_INGOT_URANIUM);
    }
}
