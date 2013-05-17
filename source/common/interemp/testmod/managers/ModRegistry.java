package interemp.testmod.managers;

import java.util.HashMap;

import net.minecraft.item.ItemStack;

public class ModRegistry {
    public static HashMap<String, ItemStack> registry = new HashMap<String, ItemStack>();
    
    public static void registerItem(String unlocalName, ItemStack item) {
        registry.put(unlocalName, item);
    }
    
    public static ItemStack getItem(String unlocalName, int qty) {
        ItemStack item = registry.get(unlocalName);
        if(item != null) {
            item = item.copy();
            item.stackSize = qty;
        }
        return item;
    }
    
    public static void printAll() {
        System.out.println("Printing all TestMod registered items");
        for(String itemName : registry.keySet()) {
            System.out.println(itemName);
        }
    }
}
