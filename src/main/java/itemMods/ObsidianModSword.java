package itemMods;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ObsidianModSword extends ItemSword {
	public static ToolMaterial obsidian = EnumHelper.addToolMaterial("obsidian", 1, 1000, 5.0F, 1.5F, 30);
    public ObsidianModSword(String unlocalizedName,ToolMaterial material) {
    	super(obsidian);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName("Obsidian Sword");
        setFull3D();
    }
}