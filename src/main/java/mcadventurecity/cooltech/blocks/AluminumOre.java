package mcadventurecity.cooltech.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mcadventurecity.cooltech.Constants;
import mcadventurecity.cooltech.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AluminumOre extends Block {

	public AluminumOre() {
		super(Material.rock);
		this.setCreativeTab(ModTabs.tabCustom);
		setHarvestLevel("pickaxe",1);
		GameRegistry.registerBlock(this, "aluminumOre");

	    this.setBlockName(Constants.MODID + "_" + "aluminumOre");
	    this.setHardness(3.0F);
	    setBlockTextureName(Constants.MODID + ":" + "aluminum_ore");
	}
}
