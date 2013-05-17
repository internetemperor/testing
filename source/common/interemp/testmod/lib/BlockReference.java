package interemp.testmod.lib;

import java.util.HashMap;

import interemp.testmod.blocks.BlockMachines;
import interemp.testmod.blocks.BlockOres;
import interemp.testmod.blocks.ItemBlockTest;
import interemp.testmod.managers.ModRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Holds all metadata and id references for blocks
 * 
 * TODO: Write modular system for retrieving metadata name lists
 * 
 * @author InternetEmperor
 */
public class BlockReference {
    
    public static HashMap<String, String> blocks = new HashMap<String, String>();
    
    // These are set in ConfigHandler
    public static int id_block_ores = 900;
    public static int id_block_machines = 900;
    
    // Blocks
    public static BlockOres blockOres;
    public static BlockMachines blockMachines;
    
    // Ores
    public static ItemStack oreUraninite;
    public static ItemStack oreMonazite;
    public static ItemStack oreFluorite;
    
    // Machines
    public static ItemStack machineElectrolyzer;
    public static ItemStack machineCentrifuge;
    public static ItemStack machineChemistryTable;
    
    // Instantiate all blocks
    public static void preinit() {
        blockOres = new BlockOres(id_block_ores, Material.rock);
        blockMachines = new BlockMachines(id_block_machines, Material.rock);
    }
    
    public static void init() {
        // Register blocks
        GameRegistry.registerBlock(blockOres, ItemBlockTest.class, "TestMod Ores Block");
        GameRegistry.registerBlock(blockMachines, ItemBlockTest.class, "TestMod Machines Block");
        
        // Add names
        LanguageRegistry.addName(oreUraninite = new ItemStack(blockOres, 1, 0), "Uraninite Ore");
        LanguageRegistry.addName(oreMonazite = new ItemStack(blockOres, 1, 1), "Monazite Ore");
        LanguageRegistry.addName(oreFluorite = new ItemStack(blockOres, 1, 2), "Fluorite Ore");
        
        LanguageRegistry.addName(machineElectrolyzer = new ItemStack(blockMachines, 1, 0), "Electrolyzer");
        LanguageRegistry.addName(machineCentrifuge = new ItemStack(blockMachines, 1, 1), "Centrifuge");
        LanguageRegistry.addName(machineChemistryTable = new ItemStack(blockMachines, 1, 2), "Chemistry Table");
        
        // Register itemstacks
        ModRegistry.registerItem("oreUraninite", oreUraninite);
        ModRegistry.registerItem("oreMonazite", oreMonazite);
        ModRegistry.registerItem("oreFluorite", oreFluorite);
        ModRegistry.registerItem("machineElectrolyzer", machineElectrolyzer );
        ModRegistry.registerItem("machineCentrifuge", machineCentrifuge);
        ModRegistry.registerItem("machineChemistryTable", machineChemistryTable);
        
        //OreDictionary registration
        OreDictionary.registerOre("oreUraninite", oreUraninite);
        OreDictionary.registerOre("oreMonazite", oreMonazite);
        OreDictionary.registerOre("oreFluorite", oreFluorite);
    }
    

    // TODO: Move to NameRegistry
    public static String[] ores = {
        "Uraninite",
        "Monazite",
        "Fluorite"
    };
    
    public static String[] machines = {
        "Electrolyzer",
        "Centrifuge",
        "ChemistryTable"
    };
    
    // TODO: Move to NameRegistry
    public static String nameLookup(ItemStack itemStack) {
        String name = "";
        if(itemStack.getItem().getUnlocalizedName().endsWith("ore")) {
            name = ores[itemStack.getItemDamage()];
        }
        else if(itemStack.getItem().getUnlocalizedName().endsWith("machine")) {
            name = machines[itemStack.getItemDamage()];
        }
        return name;
    }
    

}
