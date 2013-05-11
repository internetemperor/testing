package interemp.testmod.items.ingots;

import interemp.testmod.items.TMItem;
import interemp.testmod.lib.StringReference;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class IngotEnrichedUranium extends TMItem {
    
    public IngotEnrichedUranium(int id) {
        super(id);
        setMaxStackSize(64);
        setUnlocalizedName(StringReference.NAME_INGOT_ENRICHED_URANIUM);
        // TODO: Pull from localization manager
        LanguageRegistry.addName(this, "Enriched Uranium Ingot");
    }
}
