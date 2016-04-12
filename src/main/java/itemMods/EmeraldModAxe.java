package itemMods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class EmeraldModAxe extends ItemAxe{
	public static ToolMaterial emerald = EnumHelper.addToolMaterial("emerald", 2, 500, 7.0F, 2.5F, 30);
	public EmeraldModAxe(String unlocalizedName,ToolMaterial material) {
		super(emerald);
		setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("Emerald Axe");
        setFull3D();
        setTextureName("mcmods:EmeraldAxe");
	}
}