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
        return this.getUnlocalizedName() + BlockReference.nameLookup(itemStack);
    }
}
