package mcadventurecity.cooltech.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mcadventurecity.cooltech.Constants;
import mcadventurecity.cooltech.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CobaltOre extends Block {
	public CobaltOre(){

		super(Material.rock);
		this.setCreativeTab(ModTabs.tabCustom);
		setHarvestLevel("pickaxe",3);
		GameRegistry.registerBlock(this, "cobaltOre");

        this.setBlockName(Constants.MODID + "_" + "cobaltOre");
        this.setHardness(3.0F);
        setBlockTextureName(Constants.MODID + ":" + "cobalt_ore");

    }
}
