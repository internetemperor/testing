package interemp.testmod.lib;

/**
 * Holds all metadata and id references for items
 * 
 * TODO: Write modular system for retrieving metadata name lists
 * 
 * @author InternetEmperor
 */
public class ItemReference {
    public static int id_item_dusts = 1;
    
    

    // Name prefix for this group is Pulverized
    // Unlocalized name prefix is ore
    public static String[] dusts = {
        "%Uranium",
        "Uranium Dioxide",
        "Enriched Uranium Dioxide",
        "Depleted Uranium Dioxide",
        "Uranium Hexafluoride",
        "Enriched Uranium Hexafluoride",
        "Plutonium Dioxide",
        "Mixed Oxide",
        "%Thorium",
        "%Fluorite"
    };
    
    public static String[] ingots = {
        "Uranium%",
        "Depleted Uranium%",
        "Enriched Uranium%",
        "Plutonium%",
        "Steel%"
    };
    
    public static String[] chemicals = {
        "Nitric Acid",
        "Fluorine"
    };
}
