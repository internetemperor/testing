package interemp.testmod.managers;

import thermalexpansion.api.crafting.CraftingHelpers;
import thermalexpansion.api.crafting.CraftingManagers;
import thermalexpansion.api.item.ItemRegistry;
import net.minecraft.item.ItemStack;

public class CraftingHandler {
    
    // Ores
    private static ItemStack oreUraninite = ModRegistry.getItem("oreUraninite", 1);
    private static ItemStack oreMonazite = ModRegistry.getItem("oreMonazite", 1);
    private static ItemStack oreFluorite = ModRegistry.getItem("oreFluorite", 1);
    
    // Dusts
    private static ItemStack dustUraninite = ModRegistry.getItem("dustUraninite", 1);
    private static ItemStack dustMonazite = ModRegistry.getItem("dustMonazite", 1);
    private static ItemStack dustFluorite = ModRegistry.getItem("dustFluorite", 1);
    private static ItemStack dustYellowcake = ModRegistry.getItem("dustYellowcake", 1);
    private static ItemStack dustUraniumOxide = ModRegistry.getItem("dustUraniumOxide", 1);
    private static ItemStack dustEnrichedUraniumOxide = ModRegistry.getItem("dustEnrichedUraniumOxide", 1);
    private static ItemStack dustDepletedUraniumOxide = ModRegistry.getItem("dustDepletedUraniumOxide", 1);
    private static ItemStack dustPlutoniumOxide = ModRegistry.getItem("dustPlutoniumOxide", 1);
    private static ItemStack dustMixedOxide = ModRegistry.getItem("dustMixedOxide", 1);
    private static ItemStack dustUraniumHex = ModRegistry.getItem("dustUraniumHex", 1);
    private static ItemStack dustEnrichedUraniumHex = ModRegistry.getItem("dustEnrichedUraniumHex", 1);
    
    // Ingots
    private static ItemStack ingotUranium = ModRegistry.getItem("ingotUranium", 1);
    private static ItemStack ingotThorium = ModRegistry.getItem("ingotThorium", 1);
    private static ItemStack ingotSteel = ModRegistry.getItem("ingotSteel", 1);
    private static ItemStack ingotDepletedUranium = ModRegistry.getItem("ingotDepletedUranium", 1);
    private static ItemStack ingotEnrichedUranium = ModRegistry.getItem("ingotEnrichedUranium", 1);
    private static ItemStack ingotPlutonium = ModRegistry.getItem("ingotPlutonium", 1);

    public static void postinit() {
        // TODO: Finish adding basic recipes
        // Thermal Expansion related recipes
        CraftingHelpers.addPulverizerOreToDustRecipe(oreUraninite, dustUraninite);
        CraftingHelpers.addPulverizerOreToDustRecipe(oreMonazite, dustMonazite);
        CraftingHelpers.addPulverizerOreToDustRecipe(oreFluorite, dustFluorite);
        
        CraftingHelpers.addSmelterDustToIngotsRecipe(dustUraniumOxide, ingotUranium);
        CraftingHelpers.addSmelterDustToIngotsRecipe(dustDepletedUraniumOxide, ingotDepletedUranium);
        CraftingHelpers.addSmelterDustToIngotsRecipe(dustEnrichedUraniumOxide, ingotEnrichedUranium);
        CraftingHelpers.addSmelterDustToIngotsRecipe(dustPlutoniumOxide, ingotPlutonium);
        CraftingHelpers.addSmelterDustToIngotsRecipe(dustMonazite, ingotThorium);
        
        CraftingHelpers.addSmelterOreToIngotsRecipe(oreMonazite, ingotThorium);
        
        CraftingManagers.smelterManager.addRecipe(400, ItemRegistry.getItem("dustIron", 2), dustFluorite, ingotSteel);
    }
}
