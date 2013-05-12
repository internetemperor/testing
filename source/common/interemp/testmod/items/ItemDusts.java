package interemp.testmod.items;

public class ItemDusts extends ItemTest {

    public ItemDusts(int id) {
        super(id);
        setHasSubtypes(true);
        setMaxDamage(0);
        setUnlocalizedName("dust");
        nameConstant = "Pulverized";
    }

}
