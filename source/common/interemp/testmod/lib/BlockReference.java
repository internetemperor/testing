package interemp.testmod.lib;

import net.minecraft.block.material.Material;

public class BlockReference {
    private static int n = Reference.BLOCKID_START;
    
    // IDs
    public static final int ID_ORE_MONAZITE = n++;
    public static final int ID_ORE_URANINITE = n++;
    
    // Materials
    public static final Material MAT_ORE_MONAZITE = Material.rock;
    public static final Material MAT_ORE_URANINITE = Material.rock;
    
}
