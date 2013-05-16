package interemp.testmod.lib;

import java.util.Map;

import net.minecraft.item.ItemStack;

/**
 * Holds all metadata and id references for blocks
 * 
 * TODO: Write modular system for retrieving metadata name lists
 * 
 * @author InternetEmperor
 */
public class BlockReference {
    
    public static Map<String, String[]> blockGroups;
    
    public static int id_block_ores = 1700;

    /**
     * % denotes where the item prefix (generally the same as the (singular) array name will be put
     * 
     * % at the start = Ore Uranium, at the end = Uranium Ore, No % = Uranium
     */
    public static String[] ores = {
        "Uraninite%",
        "Monazite%",
        "Fluorite%"
    };
    
    public static String[] machines = {
        "Electrolyzer",
        "Centrifuge",
        "Chemistry Table"
    };
    
    public static String nameLookup(ItemStack itemStack) {
        String name = "";
        if(itemStack.getItem().getUnlocalizedName().endsWith("ore")) {
            name = ores[itemStack.getItemDamage()];
            name = name.replaceAll("%", "");
        }
        return name;
    }
    
    public static void init() {
        // Collect all block name arrays into map
        // Traverse map, registering blocks as required
        
    }
}
