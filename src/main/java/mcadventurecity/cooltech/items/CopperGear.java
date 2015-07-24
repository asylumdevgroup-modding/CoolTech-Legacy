package mcadventurecity.cooltech.items;

import cpw.mods.fml.common.registry.GameRegistry;
import mcadventurecity.cooltech.Constants;
import mcadventurecity.cooltech.ModTabs;
import net.minecraft.item.Item;

public class CopperGear extends Item {

	private String name = "copperGear";
public CopperGear() {
		
		setUnlocalizedName(Constants.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(ModTabs.tabCustom);
		setTextureName(Constants.MODID + ":" + "copper_gear");
	}
}
