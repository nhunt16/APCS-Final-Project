package legendaryItems;

import net.minecraft.item.ItemSword;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class LegendaryItemModSword1 extends ItemSword{
	//create tool material sword–legendary item–should have much higher durability and damage than diamond tools/sword
	//public static ToolMaterial name = EnumHelper.addToolMaterial("NAME", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
	public static ToolMaterial blood_diamond = EnumHelper.addToolMaterial("blood_diamond", 3, 10000, 15.0F, 11.0F, 30);
	public LegendaryItemModSword1(String unlocalizedName,ToolMaterial material) {
		super(blood_diamond);
		setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName("Andonisus, Reaper of Souls");
        setTextureName("mcmods:StoneSword");
        setFull3D();
	}
}

//take note of the extreme difficulty to make these in ExampleModMain under legendary item recipes