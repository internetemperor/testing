package interemp.testmod.lib;

import java.util.HashMap;
import java.util.Map;

/**
 * String reference class
 * Holds all strings used in the mod in a hashmap using the icon name as the key
 * 
 * TODO: Make it read from the config file for localization purposes
 * TODO: Retrieve key strings from BlockReference, ItemReference metadata/item lists
 * 
 * @author InternetEmperor
 */
public class Strings {
    
    public static Map<String, String> STRING_REF;
    static {
        STRING_REF = new HashMap<String, String>();
        STRING_REF.put("oreUraninite", "Uraninite Ore");
    }

    public static String getName(String key) {
        return STRING_REF.get(key);
    }

}
