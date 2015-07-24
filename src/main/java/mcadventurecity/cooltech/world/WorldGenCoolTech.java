package mcadventurecity.cooltech.world;

import java.util.Random;

import mcadventurecity.cooltech.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenCoolTech implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		  switch (world.provider.dimensionId) {
          case 0: GenerateOverworld(random, chunkX * 16, chunkZ * 16, world); break;
          case 1: GenerateEnd(random, chunkX * 16, chunkZ * 16, world); break;
          case -1: GenerateNether(random, chunkX * 16, chunkZ * 16, world); break;
		  }
		
	}
	
	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY )
    {
        WorldGenMinable minable = new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), Blocks.stone);
        for(int i = 0; i < chancesToSpawn; i++)
        {
            int posX = blockXPos + random.nextInt(16);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = blockZPos + random.nextInt(16);
            minable.generate(world, random, posX, posY, posZ);
        }
    }

	private void GenerateNether(Random random, int i, int j, World world) {
		// TODO Auto-generated method stub
		
	}

	private void GenerateEnd(Random random, int i, int j, World world) {
		// TODO Auto-generated method stub
		
	}

	private void GenerateOverworld(Random random, int x, int z, World world) {
		// TODO Auto-generated method stub
		this.addOreSpawn(ModBlocks.copperOre, world, random, x, z, 2, 8, 25, 0, 80);
		this.addOreSpawn(ModBlocks.tinOre, world, random, x, z, 2, 8, 20, 0, 55);
		this.addOreSpawn(ModBlocks.aluminumOre, world, random, x, z, 1, 6, 22, 0, 65);
		this.addOreSpawn(ModBlocks.sulfurOre, world, random, x, z, 1, 5, 16, 0, 22);
		this.addOreSpawn(ModBlocks.cobaltOre, world, random, x, z, 1, 6, 18, 0, 25);
		this.addOreSpawn(ModBlocks.leadOre, world, random, x, z, 1, 8, 20, 0, 30);
		this.addOreSpawn(ModBlocks.nickelOre, world, random, x, z, 1, 6, 16, 0, 20);
		this.addOreSpawn(ModBlocks.osmiumOre, world, random, x, z, 1, 8, 20, 0, 45);
		this.addOreSpawn(ModBlocks.platinumOre, world, random, x, z, 1, 4, 14, 0, 20);
		this.addOreSpawn(ModBlocks.silverOre, world, random, x, z, 1, 6, 19, 0, 28);
		this.addOreSpawn(ModBlocks.tungstenOre, world, random, x, z, 1, 4, 14, 0, 15);
	}

}
