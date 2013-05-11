package interemp.testmod.blocks;

import interemp.testmod.lib.BlockReference;
import net.minecraft.block.material.Material;

public class BlockOres extends BlockTest {

    public BlockOres(int id, Material material) {
        super(id, material);
        nameConstant = "Ore";
        names = BlockReference.ores;
        setUnlocalizedName("ore"); // this is important for itemblocktest
        hasMetadata = true;
    }
}
