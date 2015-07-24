package mcadventurecity.cooltech.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mcadventurecity.cooltech.Constants;
import mcadventurecity.cooltech.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BasicMachineCasing extends Block {

	public BasicMachineCasing() {
		super(Material.iron);
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(ModTabs.tabCustom);
		setHarvestLevel("pickaxe",1);
		GameRegistry.registerBlock(this, "basicMachineCasing");

	    this.setBlockName(Constants.MODID + "_" + "basicMachineCasing");
	    this.setHardness(3.0F);
	    setBlockTextureName(Constants.MODID + ":" + "basic_machine");
	}
}
