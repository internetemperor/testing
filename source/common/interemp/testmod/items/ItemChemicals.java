package interemp.testmod.items;

import interemp.testmod.lib.ItemReference;

public class ItemChemicals extends ItemTest {

    public ItemChemicals(int id) {
        super(id);
        setHasSubtypes(true);
        setMaxDamage(0);
        setUnlocalizedName("chemical");
        hasMetadata = true;
        names = ItemReference.chemicals;
    }
}
