package interemp.testmod.lib;

/**
 * Holds all metadata and id references for blocks
 * 
 * TODO: Write modular system for retrieving metadata name lists
 * 
 * @author InternetEmperor
 */
public class BlockReference {
    
    public final static int ID_BLOCK_ORES = 924;

    /**
     * % denotes where the item prefix (generally the same as the (singular) array name will be put
     * 
     * % at the start = Ore Uranium, at the end = Uranium Ore, No % = Uranium
     */
    public static String[] ores = {
        "Uraninite%", "Thorium%"
    };
}
