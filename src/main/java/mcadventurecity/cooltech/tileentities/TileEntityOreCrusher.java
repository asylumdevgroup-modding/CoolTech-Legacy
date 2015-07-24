package mcadventurecity.cooltech.tileentities;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyHandler;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityOreCrusher extends TileEntity implements IEnergyHandler{
	public static final String publicName = "tileEntityOreCrusher";
    private String name = "tileEntityOreCrusher";

    public String getName() {

        return name;
    }
    
    protected EnergyStorage storage = new EnergyStorage(48000);

	@Override
	public boolean canConnectEnergy(ForgeDirection from) {
		
		return true;
	}

	@Override
	public int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate) {

		return storage.receiveEnergy(maxReceive, simulate);
	}


	@Override
	public int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate) {

		return storage.extractEnergy(maxExtract, simulate);
	}


	@Override
	public int getEnergyStored(ForgeDirection from) {

		return storage.getEnergyStored();
	}

	@Override
	public int getMaxEnergyStored(ForgeDirection from) {

		return storage.getMaxEnergyStored();
	}
}
