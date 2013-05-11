package interemp.testmod.blocks;

import interemp.testmod.TestMod;
import interemp.testmod.lib.BlockReference;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockTest extends ItemBlock {

    public ItemBlockTest(int id) {
        super(id);
        setHasSubtypes(true);
        setCreativeTab(TestMod.tab);
    }

    @Override
    public int getMetadata (int meta) {
        return meta;
    }

    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        System.out.println("unlocalName: " + this.getUnlocalizedName() + ", itemstack.getitem.getunlocal: " + itemStack.getItem().getUnlocalizedName());
        return this.getUnlocalizedName() + BlockReference.ores[itemStack.getItemDamage()];
        // returns tile.ore + blockref.ores[meta];
        // so tile.oreUraninite
        /*
         * So I can substring the bit after tile., pass it to my blockref to get the collection of names
         */
    }
}
