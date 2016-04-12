package itemMods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HardenedObsidian extends Item {
    public HardenedObsidian() {
        super();
        setMaxStackSize(32);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("Hardened Obsidian");
        setTextureName("mcmods:HardenedObsidian");
    }
}
