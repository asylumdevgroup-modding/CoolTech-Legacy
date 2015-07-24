package mcadventurecity.cooltech.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mcadventurecity.cooltech.Constants;
import mcadventurecity.cooltech.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CopperBlock extends Block {

	public CopperBlock() {
		super(Material.iron);
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(ModTabs.tabCustom);
		setHarvestLevel("pickaxe",1);
		GameRegistry.registerBlock(this, "copperBlock");

	    this.setBlockName(Constants.MODID + "_" + "copperBlock");
	    this.setHardness(3.0F);
	    setBlockTextureName(Constants.MODID + ":" + "copper_block");
	}
}
