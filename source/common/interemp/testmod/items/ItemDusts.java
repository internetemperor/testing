package interemp.testmod.items;

import interemp.testmod.lib.ItemReference;

public class ItemDusts extends ItemTest {

    public ItemDusts(int id) {
        super(id);
        setHasSubtypes(true);
        setMaxDamage(0);
        setUnlocalizedName("dust");
        nameConstant = "Pulverized";
        hasMetadata = true;
        names = ItemReference.dusts;
    }
}
