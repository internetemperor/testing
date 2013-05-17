package interemp.testmod.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import interemp.testmod.items.ItemChemicals;
import interemp.testmod.items.ItemDusts;
import interemp.testmod.items.ItemIngots;
import interemp.testmod.managers.ModRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Holds all metadata and id references for items
 * 
 * TODO: Write modular system for retrieving metadata name lists
 * 
 * @author InternetEmperor
 */
public class ItemReference {
    public static int id_item_dusts = 4000;
    public static int id_item_ingots = 4000;
    public static int id_item_chemicals = 4000;
    
    // Items
    public static ItemDusts itemDusts;
    public static ItemIngots itemIngots;
    public static ItemChemicals itemChemicals;
    
    // Dusts
    public static ItemStack dustUraninite;
    public static ItemStack dustMonazite;
    public static ItemStack dustFluorite;
    public static ItemStack dustYellowcake;
    public static ItemStack dustUraniumOxide;
    public static ItemStack dustEnrichedUraniumOxide;
    public static ItemStack dustDepletedUraniumOxide;
    public static ItemStack dustPlutoniumOxide;
    public static ItemStack dustMixedOxide;
    public static ItemStack dustUraniumHex;
    public static ItemStack dustEnrichedUraniumHex;
    
    // Ingots
    public static ItemStack ingotUranium;
    public static ItemStack ingotThorium;
    public static ItemStack ingotSteel;
    public static ItemStack ingotDepletedUranium;
    public static ItemStack ingotEnrichedUranium;
    public static ItemStack ingotPlutonium;
    
    // Chemicals
    public static ItemStack chemicalNitricAcid;
    public static ItemStack chemicalFluorine;
    
    public static void preinit() {
        itemDusts = new ItemDusts(id_item_dusts);
        itemIngots = new ItemIngots(id_item_ingots);
        itemChemicals = new ItemChemicals(id_item_chemicals);
    }
    
    public static void init() {        
        GameRegistry.registerItem(itemDusts, "TestMod Dusts Item");
        GameRegistry.registerItem(itemIngots, "TestMod Ingots Item");
        GameRegistry.registerItem(itemChemicals, "TestMod Chemicals Item");
        
        // Names
        LanguageRegistry.addName(dustUraninite = new ItemStack(itemDusts, 1, 0), "Pulverized Uraninite");
        LanguageRegistry.addName(dustMonazite = new ItemStack(itemDusts, 1, 1), "Pulverized Monazite");
        LanguageRegistry.addName(dustFluorite = new ItemStack(itemDusts, 1, 2), "Pulverized Fluorite");
        LanguageRegistry.addName(dustYellowcake = new ItemStack(itemDusts, 1, 3), "Yellowcake");
        LanguageRegistry.addName(dustUraniumOxide = new ItemStack(itemDusts, 1, 4), "Uranium Oxide");
        LanguageRegistry.addName(dustEnrichedUraniumOxide = new ItemStack(itemDusts, 1, 5), "Enriched Uranium Oxide");
        LanguageRegistry.addName(dustDepletedUraniumOxide = new ItemStack(itemDusts, 1, 6), "Depleted Uranium Oxide");
        LanguageRegistry.addName(dustPlutoniumOxide = new ItemStack(itemDusts, 1, 7), "Plutonium Oxide");
        LanguageRegistry.addName(dustMixedOxide = new ItemStack(itemDusts, 1, 8), "Mixed Oxide");
        LanguageRegistry.addName(dustUraniumHex = new ItemStack(itemDusts, 1, 9), "Uranium Hexafluoride");
        LanguageRegistry.addName(dustEnrichedUraniumHex = new ItemStack(itemDusts, 1, 10), "Enriched Uranium Hexafluoride");
        
        LanguageRegistry.addName(ingotUranium = new ItemStack(itemIngots, 1, 0), "Uranium Ingot");
        LanguageRegistry.addName(ingotThorium = new ItemStack(itemIngots, 1, 1), "Thorium Ingot");
        LanguageRegistry.addName(ingotSteel = new ItemStack(itemIngots, 1, 2), "Steel Ingot");
        LanguageRegistry.addName(ingotDepletedUranium = new ItemStack(itemIngots, 1, 3), "Depleted Uranium Ingot");
        LanguageRegistry.addName(ingotDepletedUranium = new ItemStack(itemIngots, 1, 4), "Enriched Uranium Ingot");
        LanguageRegistry.addName(ingotPlutonium = new ItemStack(itemIngots, 1, 5), "Plutonium Ingot");
        
        LanguageRegistry.addName(chemicalNitricAcid = new ItemStack(itemChemicals, 1, 0), "Nitric Acid");
        LanguageRegistry.addName(chemicalFluorine = new ItemStack(itemChemicals, 1, 1), "Fluorine");
        
        // Itemstacks
        ModRegistry.registerItem("dustUraninite", dustUraninite);
        ModRegistry.registerItem("dustMonazite", dustMonazite);
        ModRegistry.registerItem("dustFluorite", dustFluorite);
        ModRegistry.registerItem("dustYellowcake", dustYellowcake);
        ModRegistry.registerItem("dustUraniumOxide", dustUraniumOxide);
        ModRegistry.registerItem("dustEnrichedUraniumOxide", dustEnrichedUraniumOxide);
        ModRegistry.registerItem("dustDepletedUraniumOxide", dustDepletedUraniumOxide);
        ModRegistry.registerItem("dustPlutoniumOxide", dustPlutoniumOxide);
        ModRegistry.registerItem("dustMixedOxide", dustMixedOxide);
        
        ModRegistry.registerItem("ingotUranium", ingotUranium);
        ModRegistry.registerItem("ingotThorium", ingotThorium);
        ModRegistry.registerItem("ingotSteel", ingotSteel);
        ModRegistry.registerItem("ingotDepletedUranium", ingotDepletedUranium);
        ModRegistry.registerItem("ingotEnrichedUranium", ingotEnrichedUranium);
        ModRegistry.registerItem("ingotPlutonium", ingotPlutonium);
        
        ModRegistry.registerItem("dustUraniumHex", dustUraniumHex);
        ModRegistry.registerItem("dustEnrichedUraniumHex", dustEnrichedUraniumHex);
        
        // OreDictionary Registration
        OreDictionary.registerOre("dustUraninite", dustUraninite);
        OreDictionary.registerOre("dustMonazite", dustMonazite);
        OreDictionary.registerOre("dustFluorite", dustFluorite);
        OreDictionary.registerOre("dustYellowcake", dustYellowcake);
        OreDictionary.registerOre("ingotThorium", ingotThorium);
        OreDictionary.registerOre("ingotSteel", ingotSteel);
    }

    public static String[] dusts = {
        "Uraninite",
        "Monazite",
        "Fluorite",
        "Yellowcake",
        "UraniumOxide",
        "EnrichedUraniumOxide",
        "DepletedUraniumOxide",
        "PlutoniumOxide",
        "MixedOxide",
        "UraniumHex",
        "EnrichedUraniumHex"
    };
    
    public static String[] ingots = {
        "Uranium",
        "Thorium",
        "Steel",
        "DepletedUranium",
        "EnrichedUranium",
        "Plutonium"
    };
    
    public static String[] chemicals = {
        "NitricAcid",
        "Fluorine"
    };
}
