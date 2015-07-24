package mcadventurecity.cooltech.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mcadventurecity.cooltech.Constants;
import mcadventurecity.cooltech.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PlatinumOre extends Block {
	public PlatinumOre(){

		super(Material.rock);
		this.setCreativeTab(ModTabs.tabCustom);
		setHarvestLevel("pickaxe",3);
		GameRegistry.registerBlock(this, "platinumOre");

        this.setBlockName(Constants.MODID + "_" + "platinumOre");
        this.setHardness(3.0F);
        setBlockTextureName(Constants.MODID + ":" + "platinum_ore");

    }
}
