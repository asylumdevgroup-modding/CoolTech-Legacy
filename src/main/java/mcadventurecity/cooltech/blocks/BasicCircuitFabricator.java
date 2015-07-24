package mcadventurecity.cooltech.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import mcadventurecity.cooltech.Constants;
import mcadventurecity.cooltech.ModTabs;
import mcadventurecity.cooltech.tileentities.TileEntityBasicCircuitFabricator;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BasicCircuitFabricator extends Block implements ITileEntityProvider {

    public IIcon[] icons = new IIcon[6];

	public BasicCircuitFabricator() {
		super(Material.iron);
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(ModTabs.tabCustom);
		setHarvestLevel("pickaxe",1);
		GameRegistry.registerBlock(this, "basicCircuitFabricator");

	    this.setBlockName(Constants.MODID + "_" + "basicCircuitFabricator");
	    this.setBlockTextureName(Constants.MODID + ":" + "basicCircuitFabricator");
	    this.setHardness(3.0F);
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		// TODO Auto-generated method stub
	    for (int i = 0; i < 6; i ++) {
	        this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
	    }
	}
	@Override
	public IIcon getIcon(int side, int meta) {
	    return this.icons[side];
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		// TODO Auto-generated method stub
		return new TileEntityBasicCircuitFabricator();
	}
	@Override
    public boolean hasTileEntity(int metadata) {

        return true;
    }
}
