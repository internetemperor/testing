package interemp.testmod.core;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import interemp.testmod.blocks.OreMultiblock;
import interemp.testmod.blocks.OreThorium;
import interemp.testmod.blocks.OreUraninite;
import interemp.testmod.lib.BlockReference;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Manages all block related activities (registering, textures, etc)
 * 
 * @author InternetEmperor
 */
public class BlockManager {
    
    // Block instances
    
    public static Block oreThorium;
    public static Block oreUraninite;
    public static Block oreMultiblock;

    public static void init() {
        //oreThorium = new OreThorium(BlockReference.ID_ORE_THORIUM, BlockReference.MAT_ORE_THORIUM);
        //oreUraninite = new OreUraninite(BlockReference.ID_ORE_Uraninite, BlockReference.MAT_ORE_Uraninite);
        oreMultiblock = new OreMultiblock(BlockReference.ID_ORE_MULTIBLOCK, BlockReference.MAT_ORE_Uraninite);
    }
    
}
