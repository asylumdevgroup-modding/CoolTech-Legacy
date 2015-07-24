package mcadventurecity.cooltech.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import mcadventurecity.cooltech.Constants;
import mcadventurecity.cooltech.ModTabs;

public class CopperOre extends Block {

	public CopperOre(){

		super(Material.rock);
		this.setCreativeTab(ModTabs.tabCustom);
		setHarvestLevel("pickaxe",1);
		GameRegistry.registerBlock(this, "copperOre");

        this.setBlockName(Constants.MODID + "_" + "copperOre");
        this.setHardness(3.0F);
        setBlockTextureName(Constants.MODID + ":" + "copper_ore");

    }
}
