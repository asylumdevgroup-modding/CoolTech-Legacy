package mcadventurecity.cooltech.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mcadventurecity.cooltech.Constants;
import mcadventurecity.cooltech.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TungstenOre extends Block {
	public TungstenOre(){

		super(Material.rock);
		this.setCreativeTab(ModTabs.tabCustom);
		setHarvestLevel("pickaxe",3);
		GameRegistry.registerBlock(this, "tungstenOre");

        this.setBlockName(Constants.MODID + "_" + "tungstenOre");
        this.setHardness(3.0F);
        setBlockTextureName(Constants.MODID + ":" + "tungsten_ore");

    }
}
