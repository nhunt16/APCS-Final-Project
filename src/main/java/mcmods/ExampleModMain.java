package mcmods;

import cpw.mods.fml.common.Mod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import armorMods.EmeraldModArmor;
import armorMods.ObsidianModArmor;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.SidedProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import epicItems.EpicItemModSword1;
import epicItems.EpicItemModSword2;
import itemMods.ObsidianModAxe;
import itemMods.ObsidianModHoe;
import itemMods.ObsidianModPickaxe;
import itemMods.ObsidianModSpade;
import itemMods.ObsidianModSword;
import legendaryItems.LegendaryItemModSword1;
import legendaryItems.LegendaryItemModSword2;
import itemMods.EmeraldModAxe;
import itemMods.EmeraldModHoe;
import itemMods.EmeraldModPickaxe;
import itemMods.EmeraldModSpade;
import itemMods.EmeraldModSword;
import itemMods.HardenedObsidian;

@Mod(modid = ExampleModMain.modid, version = ExampleModMain.version)
public class ExampleModMain {

    public static final String modid = "mcmods";
    public static final String version = "1.0.0";

    //All Blocks–Initialize
    public static Block YellowBlock;

    //All Items–Initialize
    public static Item ObsidianSword;
    public static Item ObsidianPickaxe;
    public static Item ObsidianAxe;
    public static Item ObsidianShovel;
    public static Item ObsidianHoe;
    public static Item HardenedObsidian;
    public static Item EmeraldSword;
    public static Item EmeraldPickaxe;
    public static Item EmeraldAxe;
    public static Item EmeraldShovel;
    public static Item EmeraldHoe;
    
    //All Rare Items–Initialize
    public static Item Andonisus;
    public static Item EnderBlade;
    public static Item Reaver;
    public static Item Doomblade;

    //All Armor–Initialize
    public static Item ObsidianHelmet;
    public static Item ObsidianChestplate;
    public static Item ObsidianLeggings;
    public static Item ObsidianBoots;
    public static Item EmeraldHelmet;
    public static Item EmeraldChestplate;
    public static Item EmeraldLeggings;
    public static Item EmeraldBoots;
    
    //All Tool Materials–Initialize
    public static ToolMaterial ender;
    public static ToolMaterial blood_diamond;
    public static ToolMaterial obsidian;
    public static ToolMaterial bloodborn;
    public static ToolMaterial emerald;
    public static ToolMaterial darkborn;
    
    //All Armor Materials–Initialize
    public static ArmorMaterial hardened_obsidian;
    public static ArmorMaterial hardened_emerald;

    //Technical Prerequisite (not of interest)
    @SidedProxy(clientSide = "mcmods.ClientProxy", serverSide = "mcmods.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler //Blocks & Items Go Here
    public void preInit (FMLPreInitializationEvent event){
    	
    	//BLOCK REGISTRY
        YellowBlock = new YellowBlock().setBlockName("BlockExampleBlock").setBlockTextureName("mcmods:ExampleBlock");
        GameRegistry.registerBlock(YellowBlock, "ExampleBlock");
        
        //COMMON RARITY-ITEM REGISTRY - COMMON ITEMS SHOULD HAVE LESSER PROPERTIES LESS THAN THAT OF DIAMOND – ARE IDENTIFIED BY WHITE TEXT
        ObsidianSword = new ObsidianModSword("Obsidian Sword", obsidian).setUnlocalizedName("Obsidian Sword").setTextureName("mcmods:ObsidianSword");
        GameRegistry.registerItem(ObsidianSword, "Obsidian Sword");
        
        ObsidianPickaxe = new ObsidianModPickaxe("Obsidian Pickaxe", obsidian).setUnlocalizedName("Obsidian Pickaxe").setTextureName("mcmods:ObsidianPickaxe");
        GameRegistry.registerItem(ObsidianPickaxe, "Obsidian Pickaxe");
        
        ObsidianAxe = new ObsidianModAxe("Obsidian Axe", obsidian).setUnlocalizedName("Obsidian Axe").setTextureName("mcmods:ObsidianAxe");
        GameRegistry.registerItem(ObsidianAxe, "Obsidian Axe");
        
        ObsidianShovel = new ObsidianModSpade("Obsidian Shovel", obsidian).setUnlocalizedName("Obsidian Shovel").setTextureName("mcmods:ObsidianShovel");
        GameRegistry.registerItem(ObsidianShovel, "Obsidian Shovel");
        
        ObsidianHoe = new ObsidianModHoe("Obsidian Hoe", obsidian).setUnlocalizedName("Obsidian Hoe").setTextureName("mcmods:ObsidianHoe");
        GameRegistry.registerItem(ObsidianHoe, "Obsidian Hoe");
        
        HardenedObsidian = new HardenedObsidian().setUnlocalizedName("Hardened Obsidian").setTextureName("mcmods:HardenedObsidian");
        GameRegistry.registerItem(HardenedObsidian, "Hardened Obsidian");
        
        EmeraldSword = new EmeraldModSword("Emerald Sword", emerald).setUnlocalizedName("Emerald Sword").setTextureName("mcmods:EmeraldSword");
        GameRegistry.registerItem(EmeraldSword, "Emerald Sword");
        
        EmeraldPickaxe = new EmeraldModPickaxe("Emerald Pickaxe", emerald).setUnlocalizedName("Emerald Pickaxe").setTextureName("mcmods:EmeraldPickaxe");
        GameRegistry.registerItem(EmeraldPickaxe, "Emerald Pickaxe");
        
        EmeraldAxe = new EmeraldModAxe("Emerald Axe", emerald).setUnlocalizedName("Emerald Axe").setTextureName("mcmods:EmeraldAxe");
        GameRegistry.registerItem(EmeraldAxe, "Emerald Axe");
        
        EmeraldShovel = new EmeraldModSpade("Emerald Shovel", emerald).setUnlocalizedName("Emerald Shovel").setTextureName("mcmods:EmeraldShovel");
        GameRegistry.registerItem(EmeraldShovel, "Emerald Shovel");
        
        EmeraldHoe = new EmeraldModHoe("Emerald Hoe", emerald).setUnlocalizedName("Emerald Hoe").setTextureName("mcmods:EmeraldHoe");
        GameRegistry.registerItem(EmeraldHoe, "Emerald Hoe");
        
        //COMMON RARITY-ARMOR REGISTRY - COMMON ITEMS HAVE LESSER PROPERTIES LESS THAN THAT OF DIAMOND – ARE IDENTIFIED BY WHITE TEXT
        ObsidianHelmet = new ObsidianModArmor("Obsidian Helmet", hardened_obsidian, "ObsidianArmor", 0).setUnlocalizedName("Obsidian Helmet").setTextureName("mcmods:ObsidianHelmet");
        GameRegistry.registerItem(ObsidianHelmet, "Obsidian Helmet");
        
        ObsidianChestplate = new ObsidianModArmor("Obsidian Chestplate", hardened_obsidian, "ObsidianArmor", 1).setUnlocalizedName("Obsidian Chestplate").setTextureName("mcmods:ObsidianChestplate");
        GameRegistry.registerItem(ObsidianChestplate, "Obsidian Chestplate");
        
        ObsidianLeggings = new ObsidianModArmor("Obsidian Leggings", hardened_obsidian, "ObsidianArmor", 2).setUnlocalizedName("Obsidian Leggings").setTextureName("mcmods:ObsidianLeggings");
        GameRegistry.registerItem(ObsidianLeggings, "Obsidian Leggings");
        
        ObsidianBoots = new ObsidianModArmor("Obsidian Boots", hardened_obsidian, "ObsidianArmor", 3).setUnlocalizedName("Obsidian Boots").setTextureName("mcmods:ObsidianBoots");
        GameRegistry.registerItem(ObsidianBoots, "Obsidian Boots");
        
        EmeraldHelmet = new EmeraldModArmor("Emerald Helmet", hardened_emerald, "EmeraldArmor", 0).setUnlocalizedName("Emerald Helmet").setTextureName("mcmods:EmeraldHelmet");
        GameRegistry.registerItem(EmeraldHelmet, "Emerald Helmet");
        
        EmeraldChestplate = new EmeraldModArmor("Emerald Chestplate", hardened_emerald, "EmeraldArmor", 1).setUnlocalizedName("Emerald Chestplate").setTextureName("mcmods:EmeraldChestplate");
        GameRegistry.registerItem(EmeraldChestplate, "Emerald Chestplate");
        
        EmeraldLeggings = new EmeraldModArmor("Emerald Leggings", hardened_emerald, "EmeraldArmor", 2).setUnlocalizedName("Emerald Leggings").setTextureName("mcmods:EmeraldLeggings");
        GameRegistry.registerItem(EmeraldLeggings, "Emerald Leggings");
        
        EmeraldBoots = new EmeraldModArmor("Emerald Boots", hardened_obsidian, "EmeraldArmor", 3).setUnlocalizedName("Emerald Boots").setTextureName("mcmods:EmeraldBoots");
        GameRegistry.registerItem(EmeraldBoots, "Emerald Boots");
        
        //EPIC RARITY-ITEMS REGISTRY - EPIC ITEMS SHOULD HAVE HIGH STASTICS MORE THAN THAT OF DIAMOND – ARE IDENTIFIED BY DARK PURPLE TEXT
        EnderBlade = new EpicItemModSword1("Blade of The Ender Dragon", ender).setUnlocalizedName("Blade of The Ender Dragon").setTextureName("mcmods:EnderSword");
        GameRegistry.registerItem(EnderBlade, "Blade of The Ender Dragon");
        
        Doomblade = new EpicItemModSword2("Hellscream's Doomblade", darkborn).setUnlocalizedName("Hellscream's Doomblade").setTextureName("mcmods:BloodSword");
        GameRegistry.registerItem(Doomblade, "Hellscream's Doomblade");
        
        //LEGENDARY RARITY-LEGNENDARY ITEMS ARE EXTREMELY POWERFUL IN COMPARISON TO COMMON TOOLS/WEAPONS – ARE IDENTIFIED BY ORANGE TEXT
        Andonisus = new LegendaryItemModSword1("Andonisus", blood_diamond).setUnlocalizedName("Andonisus, Reaper of Souls").setTextureName("mcmods:StoneSword");
        GameRegistry.registerItem(Andonisus, "Andonisus, Reaper of Souls");
        
        Reaver = new LegendaryItemModSword2("Skullforge Reaver", bloodborn).setUnlocalizedName("Skullforge Reaver").setTextureName("mcmods:RainbowSword");
        GameRegistry.registerItem(Reaver, "Skullforge Reaver");
        
    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event){
    	
    	//ALL SMELTING RECIPES
    	//GameRegistry.addSmelting(input,(output), xp received) 
    	GameRegistry.addSmelting(Blocks.obsidian, new ItemStack(ExampleModMain.HardenedObsidian), 10.0f);
    	
    	//ALL CRAFTING RECIPES
    	//GameRegistry.addRecipe(intended_creation), new Object[]{
    	//[think of this as the 3x3 crafting table], 'used_variables', Blocks.name or Items.name
    	//OBSIDIAN TOOLS AND WEAPON RECIPES
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.ObsidianSword), new Object[]{
            	" A ",
            	" A ",
            	" B ",
            	'A', Blocks.obsidian, 'B', Items.stick
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.ObsidianPickaxe), new Object[]{
            	"XXX",
            	" B ",
            	" B ",
            	'X', Blocks.obsidian, 'B', Items.stick
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.ObsidianAxe), new Object[]{
            	"XX ",
            	"XB ",
            	" B ",
            	'X', Blocks.obsidian, 'B', Items.stick
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.ObsidianShovel), new Object[]{
            	" X ",
            	" B ",
            	" B ",
            	'X', Blocks.obsidian, 'B', Items.stick
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.ObsidianHoe), new Object[]{
            	"XX ",
            	" B ",
            	" B ",
            	'X', Blocks.obsidian, 'B', Items.stick
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.EmeraldSword), new Object[]{
            	" X ",
            	" X ",
            	" B ",
            	'X', Items.emerald, 'B', Items.stick
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.EmeraldPickaxe), new Object[]{
            	"XXX",
            	" B ",
            	" B ",
            	'X', Items.emerald, 'B', Items.stick
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.EmeraldAxe), new Object[]{
            	"XX ",
            	"XB ",
            	" B ",
            	'X', Items.emerald, 'B', Items.stick
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.EmeraldShovel), new Object[]{
            	" X ",
            	" B ",
            	" B ",
            	'X', Items.emerald, 'B', Items.stick
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.EmeraldHoe), new Object[]{
            	"XX ",
            	" B ",
            	" B ",
            	'X', Items.emerald, 'B', Items.stick
            	});
        
        //OBSIDIAN ARMOR RECIPES
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.ObsidianHelmet), new Object[]{
            	"XXX",
            	"X X",
            	"   ",
            	'X', ExampleModMain.HardenedObsidian
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.ObsidianChestplate), new Object[]{
            	"X X",
            	"XXX",
            	"XXX",
            	'X', ExampleModMain.HardenedObsidian
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.ObsidianLeggings), new Object[]{
            	"XXX",
            	"X X",
            	"X X",
            	'X', ExampleModMain.HardenedObsidian
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.ObsidianBoots), new Object[]{
            	"   ",
            	"X X",
            	"X X",
            	'X', ExampleModMain.HardenedObsidian
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.EmeraldHelmet), new Object[]{
            	"XXX",
            	"X X",
            	"   ",
            	'X', Items.emerald
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.EmeraldLeggings), new Object[]{
            	"XXX",
            	"X X",
            	"X X",
            	'X', Items.emerald
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.EmeraldBoots), new Object[]{
            	"   ",
            	"X X",
            	"X X",
            	'X', Items.emerald
            	});
        
        //EPIC RARITY ITEM RECIPES
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.EnderBlade), new Object[]{
            	" A ",
            	"XYX",
            	"ZBZ",
            	'X', Blocks.iron_block, 'Y', Items.ender_eye, 'Z', Items.emerald, 'A', Items.diamond_sword, 'B', Items.blaze_rod
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.Doomblade), new Object[]{
            	" A ",
            	"XYX",
            	"ZBZ",
            	'X', Blocks.gold_block, 'Y', Items.nether_star, 'Z', Items.emerald, 'A', Items.diamond_sword, 'B', Items.blaze_rod
            	});
        
        //LEGENDARY RARITY ITEMS RECIPES
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.Andonisus), new Object[]{
            	"AXA",
            	"AZA",
            	"YBY",
            	'X', Blocks.obsidian, 'Y', new ItemStack(Items.skull, 1, 1), 'A', Items.diamond_sword, 'B', Items.blaze_rod, 'Z', Items.nether_star
            	});
        
        GameRegistry.addRecipe(new ItemStack(ExampleModMain.Reaver), new Object[]{
            	" A ",
            	"XYX",
            	"ZBZ",
            	'X', Blocks.obsidian, 'Y', new ItemStack(Items.skull, 1, 1), 'Z', Items.ghast_tear, 'A', Items.diamond_sword, 'B', Items.blaze_rod
            	});
    }

    @Mod.EventHandler
    public void load (FMLInitializationEvent event){
    	
    	//LANGUAGE REGISTRY AKA WHERE ITEM/BLOCK IN GAME NAMES ARE ESTABLISHED  
    	// SEE FORMATTING CODES (http://minecraft.gamepedia.com/Formatting_codes) FOR ALTERING IN GAME ITEM TEXT COLOR
        LanguageRegistry.addName(YellowBlock, "Ender Block");
        LanguageRegistry.addName(ObsidianSword, "Obsidian Sword");
        LanguageRegistry.addName(ObsidianPickaxe, "Obsidian Pickaxe");
        LanguageRegistry.addName(ObsidianAxe, "Obsidian Axe");
        LanguageRegistry.addName(ObsidianShovel, "Obsidian Shovel");
        LanguageRegistry.addName(ObsidianHoe, "Obsidian Hoe");
        LanguageRegistry.addName(ObsidianHelmet, "Obsidian Helmet");
        LanguageRegistry.addName(ObsidianChestplate, "Obsidian Chestplate");
        LanguageRegistry.addName(ObsidianLeggings, "Obsidian Leggings");
        LanguageRegistry.addName(ObsidianBoots, "Obsidian Boots");
        LanguageRegistry.addName(HardenedObsidian, "Hardened Obsidian");
        LanguageRegistry.addName(EmeraldSword, "Emerald Sword");
        LanguageRegistry.addName(EmeraldPickaxe, "Emerald Pickaxe");
        LanguageRegistry.addName(EmeraldAxe, "Emerald Axe");
        LanguageRegistry.addName(EmeraldShovel, "Emerald Shovel");
        LanguageRegistry.addName(EmeraldHoe, "Emerald Hoe");
        LanguageRegistry.addName(EmeraldHelmet, "Emerald Helmet");
        LanguageRegistry.addName(EmeraldChestplate, "Emerald Chestplate");
        LanguageRegistry.addName(EmeraldLeggings, "Emerald Leggings");
        LanguageRegistry.addName(EmeraldBoots, "Emerald Boots");
        LanguageRegistry.addName(Andonisus, "§6Andonisus, Reaper of Souls");
        LanguageRegistry.addName(EnderBlade, "§5Blade of The Ender Dragon");
        LanguageRegistry.addName(Reaver, "§6Skullforge Reaver");
        LanguageRegistry.addName(Doomblade, "§5Hellscream's Doomblade");

        //proxy.registerRenderers();
    }
}
