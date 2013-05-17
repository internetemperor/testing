package interemp.testmod.blocks;

import interemp.testmod.lib.BlockReference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;

public class BlockMachines extends BlockTest {

    public BlockMachines(int id, Material material) {
        super(id, material);
        names = BlockReference.machines;
        setUnlocalizedName("machine"); // this is important for itemblocktest
        hasMetadata = true;

        // Block's hardness (base time to harvest it with the correct tool).
        // Sand = 0.5, Stone = 1.5, Ore = 3.0 Obsidian = 20
        setHardness(3.0F);

        // Block's resistance to explosions. Stone = 10, obsidian = 2000
        setResistance(10.0F);

        // Sound to play when player steps on the block
        setStepSound(Block.soundStoneFootstep);

        // How much light is stopped by this block; 0 for air, 255 for fully
        // opaque.
        setLightOpacity(255);

        // Light level, 0-1. Gets multiplied by 15 and truncated to find the
        // actual light level for the block.
        setLightValue(0.0F);

        // Whether to receive random ticks e.g. plants
        setTickRandomly(false);

        // Harvest level for this block. par2 can be pickaxe, axe, or shovel, or
        // a different toolclass. par3 is the minimum level of item required to
        // break it:
        // 0=bare hands, 1=wood, 2=stone, 3=iron, 4=diamond
        MinecraftForge.setBlockHarvestLevel(this, "pickaxe", 2);
    }
}
