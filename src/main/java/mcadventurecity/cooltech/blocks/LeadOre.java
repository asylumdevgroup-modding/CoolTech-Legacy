package mcadventurecity.cooltech.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mcadventurecity.cooltech.Constants;
import mcadventurecity.cooltech.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LeadOre extends Block {
	public LeadOre(){

		super(Material.rock);
		this.setCreativeTab(ModTabs.tabCustom);
		setHarvestLevel("pickaxe",2);
		GameRegistry.registerBlock(this, "leadOre");

        this.setBlockName(Constants.MODID + "_" + "leadOre");
        this.setHardness(3.0F);
        setBlockTextureName(Constants.MODID + ":" + "lead_ore");

    }
}
