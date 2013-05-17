package interemp.testmod.items;

import interemp.testmod.lib.ItemReference;

public class ItemIngots extends ItemTest {

    public ItemIngots(int id) {
        super(id);
        setHasSubtypes(true);
        setMaxDamage(0);
        setUnlocalizedName("ingot");
        hasMetadata = true;
        names = ItemReference.ingots;
    }
}
