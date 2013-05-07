package interemp.testmod.core;

import interemp.testmod.blocks.OreMonazite;
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
    
    public static Block oreMonazite;
    public static Block oreUraninite;

    public static void init() {
        oreMonazite = new OreMonazite(BlockReference.ID_ORE_MONAZITE, BlockReference.MAT_ORE_MONAZITE);
        oreUraninite = new OreUraninite(BlockReference.ID_ORE_URANINITE, BlockReference.MAT_ORE_URANINITE);
    }
}
