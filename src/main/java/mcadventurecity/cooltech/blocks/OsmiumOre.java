package mcadventurecity.cooltech.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mcadventurecity.cooltech.Constants;
import mcadventurecity.cooltech.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OsmiumOre extends Block {
	public OsmiumOre(){

		super(Material.rock);
		this.setCreativeTab(ModTabs.tabCustom);
		setHarvestLevel("pickaxe",1);
		GameRegistry.registerBlock(this, "osmiumOre");

        this.setBlockName(Constants.MODID + "_" + "osmiumOre");
        this.setHardness(3.0F);
        setBlockTextureName(Constants.MODID + ":" + "osmium_ore");

    }
}
