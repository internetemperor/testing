package interemp.testmod.items.ingots;

import interemp.testmod.items.TMItem;
import interemp.testmod.lib.StringReference;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class IngotThorium extends TMItem {

    public IngotThorium(int id) {
        super(id);
        setMaxStackSize(64);
        setUnlocalizedName(StringReference.NAME_INGOT_THORIUM);
        // TODO: Pull from localization manager
        LanguageRegistry.addName(this, "Thorium Ingot");
    }

}
