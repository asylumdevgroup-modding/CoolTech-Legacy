package mcadventurecity.cooltech;

import cpw.mods.fml.common.registry.GameRegistry;
import mcadventurecity.cooltech.tileentities.TileEntityBasicCircuitFabricator;

public class CommonProxy {
	public void registerTileEntities() {

        GameRegistry.registerTileEntity(TileEntityBasicCircuitFabricator.class, TileEntityBasicCircuitFabricator.publicName);
    }
}
