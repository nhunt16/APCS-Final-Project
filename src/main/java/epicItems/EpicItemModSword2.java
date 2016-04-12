package epicItems;

import net.minecraft.item.ItemSword;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class EpicItemModSword2 extends ItemSword{
	//create tool material sword–epic item–should have statistics slightly higher than diamond tools
	// public static ToolMaterial name = EnumHelper.addToolMaterial("NAME", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability); 
	public static ToolMaterial darkborn = EnumHelper.addToolMaterial("darkborn", 3, 2000, 15.0F, 5.5F, 30);
	//create constructor and pass in the name and material
	public EpicItemModSword2(String unlocalizedName,ToolMaterial material) {
		super(darkborn);
		//ensure it cannot stack and add it to the combat tab for items
		setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabCombat);
        //set the name and texture
        setUnlocalizedName("Hellscream's Doomblade");
        setTextureName("mcmods:BloodSword");
        //render the item as a tool/weapon item
        setFull3D();
	}
}