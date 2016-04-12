package armorMods;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import mcmods.ExampleModMain;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ObsidianModArmor extends ItemArmor{//obsidian armor is better than chain armor but not as good as iron armor
	// public static ArmorMaterial name = EnumHelper.addArmorMaterial("NAME", durability, damageReduction[], enchantability)
	public static ArmorMaterial hardened_obsidian = EnumHelper.addArmorMaterial("obsidian", 20, new int[] {2, 5, 4, 2}, 30);
	public String textureName;
	//create constructor and pass in the name, material, texture name, and type (helmet, chestplate, etc)
	public ObsidianModArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
	    super(hardened_obsidian, 0, type);
	    this.textureName = textureName;
        setCreativeTab(CreativeTabs.tabCombat);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(ExampleModMain.modid + ":" + unlocalizedName);
	}
	
	// armor textures require a method that override the already written Minecraft code for alternating the two necessary layers of armor texture
		// getArmorTexture returns the name of the textures contained within the textures folder (inside resources folder)
		// credit: "_Bedrock_Miner_" his tutorial – http://bedrockminer.jimdo.com/modding-tutorials/basic-modding-1-7/custom-armor/
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return ExampleModMain.modid + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
}