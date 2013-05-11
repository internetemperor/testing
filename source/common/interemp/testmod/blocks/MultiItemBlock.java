package interemp.testmod.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class MultiItemBlock extends ItemBlock {

    public MultiItemBlock(int id) {
        super(id);
    }

    @Override
    public int getMetadata (int damageValue) {
        return damageValue;
    }
}
