package itemMods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class ObsidianModAxe extends ItemAxe{
	public static ToolMaterial obsidian = EnumHelper.addToolMaterial("obsidian", 1, 1000, 5.0F, 1.5F, 30);
	public ObsidianModAxe(String unlocalizedName,ToolMaterial material) {
		super(obsidian);
		setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("Obsidian Axe");
        setFull3D();
        setTextureName("mcmods:ObsidianAxe");
	}
}