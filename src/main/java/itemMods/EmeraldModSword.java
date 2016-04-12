package itemMods;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class EmeraldModSword extends ItemSword {
	public static ToolMaterial emerald = EnumHelper.addToolMaterial("emerald", 2, 500, 7.0F, 2.5F, 30);
    public EmeraldModSword(String unlocalizedName,ToolMaterial material) {
    	super(emerald);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName("Emerald Sword");
        setFull3D();
    }
}