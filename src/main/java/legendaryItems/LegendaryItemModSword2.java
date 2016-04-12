package legendaryItems;

import net.minecraft.item.ItemSword;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class LegendaryItemModSword2 extends ItemSword{
	public static ToolMaterial bloodborn = EnumHelper.addToolMaterial("bloodborn", 3, 6000, 14.0F, 9.0F, 30);
	public LegendaryItemModSword2(String unlocalizedName,ToolMaterial material) {
		super(bloodborn);
		setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName("Skullforge Reaver");
        setFull3D();
        setTextureName("mcmods:RainbowSword");
	}
}