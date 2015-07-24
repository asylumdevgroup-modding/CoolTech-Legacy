package mcadventurecity.cooltech.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mcadventurecity.cooltech.Constants;
import mcadventurecity.cooltech.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class IridiumOre extends Block {
	public IridiumOre(){

		super(Material.rock);
		this.setCreativeTab(ModTabs.tabCustom);
		setHarvestLevel("pickaxe",3);
		GameRegistry.registerBlock(this, "iridiumOre");

        this.setBlockName(Constants.MODID + "_" + "iridiumOre");
        this.setHardness(3.0F);
        setBlockTextureName(Constants.MODID + ":" + "iridium_ore");

    }
}
