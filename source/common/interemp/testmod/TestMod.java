package interemp.testmod;

import interemp.testmod.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name= Reference.MOD_NAME, version = Reference.MOD_VERSION)
@NetworkMod(clientSideRequired = Reference.CLIENT_SIDE, serverSideRequired = Reference.SERVER_SIDE)
public class TestMod {
   
    @Instance(Reference.MOD_ID)
    public static TestMod instance;
    
    @SidedProxy(clientSide="interemp.testmod.client.ClientProxy", serverSide="interemp.testmod.CommonProxy")
    public static CommonProxy proxy;
    
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
