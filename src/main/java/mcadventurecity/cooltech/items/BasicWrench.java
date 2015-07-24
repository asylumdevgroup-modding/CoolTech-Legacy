package mcadventurecity.cooltech.items;

import cofh.api.item.IToolHammer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BasicWrench extends Item implements IToolHammer{

	@Override
	public boolean isUsable(ItemStack item, EntityLivingBase user, int x,
			int y, int z) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void toolUsed(ItemStack item, EntityLivingBase user, int x, int y,
			int z) {
		// TODO Auto-generated method stub
		
	}

}
