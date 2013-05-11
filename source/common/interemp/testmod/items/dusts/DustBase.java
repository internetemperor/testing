package interemp.testmod.items.dusts;

import interemp.testmod.items.TMItem;
import interemp.testmod.lib.StringReference;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class DustBase extends TMItem {
    
    public DustBase(int id) {
        super(id);
        setMaxStackSize(64);
        setUnlocalizedName(StringReference.NAME_DUST_URANIUM); // edit
        // TODO: Pull from localization manager
        LanguageRegistry.addName(this, " Dust");
    }
}