package interemp.testmod.core;

import interemp.testmod.blocks.OreThorium;
import interemp.testmod.blocks.OreUraninite;
import interemp.testmod.lib.BlockReference;
import net.minecraft.block.Block;

/**
 * Manages all block related activities (registering, textures, etc)
 * 
 * @author InternetEmperor
 */
public class BlockManager {
    
    // Block instances
    
    public static Block oreThorium;
    public static Block oreUraninite;

    public static void init() {
        oreThorium = new OreThorium(BlockReference.ID_ORE_THORIUM, BlockReference.MAT_ORE_THORIUM);
        oreUraninite = new OreUraninite(BlockReference.ID_ORE_Uraninite, BlockReference.MAT_ORE_Uraninite);
    }
}
