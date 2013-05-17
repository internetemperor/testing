package interemp.testmod.items;

import interemp.testmod.TestMod;
import interemp.testmod.lib.Reference;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemTest extends Item {
    
    public String[] names;
    public Icon[] iconArray;
    public boolean hasMetadata = false;

    public ItemTest(int id) {
        super(id);
        setCreativeTab(TestMod.tab);
        setMaxStackSize(64);
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int meta) {
        return this.iconArray[meta % iconArray.length];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ic) {
        if(hasMetadata()) {
            this.iconArray = new Icon[names.length];

            for (int i = 0; i < names.length; i++)
            {
                this.iconArray[i] = ic.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1) + names[i]);
            }
        }
        else {
            itemIcon = ic.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        }
    }
    
    @SuppressWarnings("unchecked")
    @SideOnly(Side.CLIENT)
    public void getSubItems(int id, CreativeTabs tabs, List list){
        for(int i = 0; i < names.length; i++){
                list.add(new ItemStack(id, 1, i));
         }
     }
    
    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return this.getUnlocalizedName() + names[itemStack.getItemDamage()];
    }
    
    public boolean hasMetadata() {
        return hasMetadata;
    }
}
