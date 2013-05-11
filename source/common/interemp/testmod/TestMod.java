package interemp.testmod;

import interemp.testmod.core.CreativeTab;
import interemp.testmod.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
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
    
    public static CreativeTabs tabTM = new CreativeTab(CreativeTabs.getNextID(), Reference.MOD_ID);
    
    /**
    * In the preInit step you only want to load configs, reserve block/item
    * IDs, and inform Forge if your mod has to be loaded after any others. No
    * heavy loading or registering should occur here, because it happens as
    * soon as they start Minecraft and there's no guarantee that your mod will
    * be loaded.
    *
    * @param event An event object with useful data
    */
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
       
    }
    
    /**
    * This is where all the heavy loading and registering of handlers goes.
    * This occurs when you connect to a server or open a world.
    *
    * @param event An event object with useful data
    */
    @Init
    public void init(FMLInitializationEvent event) {
        
    }
    
    /**
    * Stuff to do after the player connects. This is for things that need to
    * wait until the world is completely loaded before initializing.
    *
    * @param event An event object with useful data
    */
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
