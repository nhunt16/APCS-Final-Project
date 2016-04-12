package itemMods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ObsidianModPickaxe extends ItemPickaxe{
	public static ToolMaterial obsidian = EnumHelper.addToolMaterial("obsidian", 1, 1000, 5.0F, 1.5F, 30);
	public ObsidianModPickaxe(String unlocalizedName,ToolMaterial material) {
		super(obsidian);
		setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("Obsidian Pickaxe");
        setFull3D();
        setTextureName("mcmods:ObsidianPickaxe");
	}
}