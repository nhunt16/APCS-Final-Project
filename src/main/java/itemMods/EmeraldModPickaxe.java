package itemMods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class EmeraldModPickaxe extends ItemPickaxe{
	public static ToolMaterial emerald = EnumHelper.addToolMaterial("emerald", 2, 500, 7.0F, 2.5F, 30);
	public EmeraldModPickaxe(String unlocalizedName,ToolMaterial material) {
		super(emerald);
		setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("Emerald Pickaxe");
        setFull3D();
        setTextureName("mcmods:EmeraldPickaxe");
	}
}