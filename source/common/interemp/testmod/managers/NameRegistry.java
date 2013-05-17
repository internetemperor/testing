package interemp.testmod.managers;

import java.util.HashMap;
import java.util.Map;

/**
 * Name registry
 * Holds all names using the unlocalized name as the key
 * 
 * @author InternetEmperor
 */
public class NameRegistry {
    
    public static Map<String, String> names;
    
    // Register names
    // TODO: Read from localization file
    public static void preinit() {
        names = new HashMap<String, String>();
        names.put("oreUraninite", "Uraninite Ore");
        names.put("oreMonazite", "Monazite Ore");
        names.put("oreFluorite", "Fluorite Ore");
    }

    public static String getName(String key) {
        return names.get(key);
    }

}
