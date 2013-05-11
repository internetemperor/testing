package interemp.testmod.items.ingots;

import interemp.testmod.items.TMItem;
import interemp.testmod.lib.StringReference;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class IngotUranium extends TMItem {
    
    public IngotUranium(int id) {
        super(id);
        setMaxStackSize(64);
        setUnlocalizedName(StringReference.NAME_INGOT_URANIUM);
        // TODO: Pull from localization manager
        LanguageRegistry.addName(this, "Uranium Ingot");
    }
}
