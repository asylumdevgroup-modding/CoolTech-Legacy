package mcadventurecity.cooltech.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mcadventurecity.cooltech.Constants;
import mcadventurecity.cooltech.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TinBlock extends Block {

	public TinBlock() {
		super(Material.iron);
		this.setCreativeTab(ModTabs.tabCustom);
		this.setStepSound(soundTypeMetal);
		setHarvestLevel("pickaxe",1);
		GameRegistry.registerBlock(this, "tinBlock");

	    this.setBlockName(Constants.MODID + "_" + "tinBlock");
	    this.setHardness(3.0F);
	    setBlockTextureName(Constants.MODID + ":" + "tin_block");
	}

}
