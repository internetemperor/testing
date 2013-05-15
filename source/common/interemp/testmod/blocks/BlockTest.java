package interemp.testmod.blocks;

import java.util.List;

import interemp.testmod.TestMod;
import interemp.testmod.lib.Reference;
import interemp.testmod.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTest extends Block {
    
    public String[] names;
    public String nameConstant;
    public Icon[] iconArray;
    public boolean hasMetadata = false;

    public BlockTest(int id, Material material) {
        super(id, material);
        setCreativeTab(TestMod.tab);
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        return this.iconArray[meta % iconArray.length];
    }
    
    public int damageDropped(int meta) {
        return meta;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ic) {
        if(hasMetadata()) {
            this.iconArray = new Icon[names.length];

            for (int i = 0; i < names.length; i++)
            {
                String name = names[i];
                name = name.replaceFirst("%", "");
                name = name.replaceAll(" ", "");
                this.iconArray[i] = ic.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + getUnlocalizedName2() + name);
            }
        }
        else {
            blockIcon = ic.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName2());
        }
    }
    
    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int id, CreativeTabs tab, List list) {
        for (int j = 0; j < names.length; ++j)
        {
            list.add(new ItemStack(id, 1, j));
        }
    }
    
    public boolean hasMetadata() {
        return hasMetadata;
    }
}
