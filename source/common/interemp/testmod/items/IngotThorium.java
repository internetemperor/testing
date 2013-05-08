package interemp.testmod.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import interemp.testmod.TestMod;
import interemp.testmod.lib.StringReference;

public class IngotThorium extends TMItem {

    public IngotThorium(int id) {
        super(id);
        setMaxStackSize(64);
        setCreativeTab(TestMod.tabTM);
        setUnlocalizedName(StringReference.NAME_INGOT_THORIUM);
        // TODO: Pull from localization manager
        LanguageRegistry.addName(this, "Thorium Ingot");
    }

}
