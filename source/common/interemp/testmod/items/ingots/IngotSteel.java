package interemp.testmod.items.ingots;

import interemp.testmod.items.TMItem;
import interemp.testmod.lib.StringReference;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class IngotSteel extends TMItem {
    
    public IngotSteel(int id) {
        super(id);
        setMaxStackSize(64);
        setUnlocalizedName(StringReference.NAME_INGOT_STEEL); // edit
        // TODO: Pull from localization manager
        LanguageRegistry.addName(this, "Steel Ingot");
    }
}
