package mcmods;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

//Didn't create a lot of blocks because didn't feel the need/want
public class YellowBlock extends Block {
    public YellowBlock() {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabBlock);
        setStepSound(soundTypeStone);
        setHardness(2.0F);
        setResistance(4.0F);

        //The higher the F value the higher the light level of the block.
        setLightLevel(0.5F);
    }
}
