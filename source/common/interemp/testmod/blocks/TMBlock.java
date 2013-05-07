/***************************************************
 * Base block class for the TestMod mod
 ***************************************************/
package interemp.testmod.blocks;

import interemp.testmod.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TMBlock extends Block {

    public TMBlock(int id, Material material) {
        super(id, material);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName2());
    }
}
