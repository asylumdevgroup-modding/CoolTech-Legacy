package mcadventurecity.cooltech;

import mcadventurecity.cooltech.blocks.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModTabs {
	public static CreativeTabs tabCustom = new CreativeTabs("tabCoolTech") {
		@Override
		@SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item.getItemFromBlock(ModBlocks.copperOre);
	    }
	};
}
