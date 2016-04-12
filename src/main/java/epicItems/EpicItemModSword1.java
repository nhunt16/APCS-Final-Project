package epicItems;

import net.minecraft.item.ItemSword;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

//making a sword so my sword extends the superclass "ItemSword" – pulls Minecraft code for sword properties
public class EpicItemModSword1 extends ItemSword{
	//create tool material sword–epic item–should have statistics slightly higher than diamond tools
	// public static ToolMaterial name = EnumHelper.addToolMaterial("NAME", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability); 
	public static ToolMaterial ender = EnumHelper.addToolMaterial("ender", 3, 1800, 14.0F, 4.5F, 30);
	//create constructor and pass in the name and material
	public EpicItemModSword1(String unlocalizedName,ToolMaterial material) {
		//use the ender material
		super(ender);
		//ensure it cannot stack and add it to the combat tab for items
		setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabCombat);
        //set the name and texture
        setUnlocalizedName("Blade of The Ender Dragon");
        setTextureName("mcmods:EnderSword");
        //render the item as a tool/weapon item
        setFull3D();
	}
}