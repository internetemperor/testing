package interemp.testmod.managers;

import interemp.testmod.lib.BlockReference;
import interemp.testmod.lib.ItemReference;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class ConfigHandler {

    public static Configuration config;

    public static void preinit(FMLPreInitializationEvent event) {
        config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        
        BlockReference.id_block_ores = config.getBlock("blockTMOres", BlockReference.id_block_ores).getInt();
        BlockReference.id_block_machines = config.getBlock("blockTMMachines", BlockReference.id_block_machines).getInt();
        ItemReference.id_item_dusts = config.getItem("itemTMDusts", ItemReference.id_item_dusts).getInt();
        ItemReference.id_item_ingots = config.getItem("itemTMIngots", ItemReference.id_item_ingots).getInt();
        ItemReference.id_item_chemicals = config.getItem("itemTMChemicals", ItemReference.id_item_chemicals).getInt();
        
        config.save();
    }
}
