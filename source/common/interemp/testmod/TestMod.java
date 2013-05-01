package interemp.testmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import interemp.testmod.lib.Reference;

@Mod(modid = Reference.MOD_ID, name= Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class TestMod {
   
    // Register blocks and items
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        
    }
    
    // Register recipes
    @Init
    public void init(FMLInitializationEvent event) {
        
    }
    
    // Interact with other mods
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
