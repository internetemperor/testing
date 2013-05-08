package interemp.testmod.lib;

import net.minecraft.block.material.Material;

public class BlockReference {
    private static int n = Reference.BLOCKID_START;
    
    // IDs
    public static final int ID_ORE_THORIUM = n++;
    public static final int ID_ORE_URANIUM = n++;
    
    // Materials
    public static final Material MAT_ORE_THORIUM = Material.rock;
    public static final Material MAT_ORE_URANIUM = Material.rock;
    
}
