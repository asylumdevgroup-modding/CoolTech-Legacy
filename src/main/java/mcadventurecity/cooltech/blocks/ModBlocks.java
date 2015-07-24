package mcadventurecity.cooltech.blocks;

import net.minecraft.block.Block;

public final class ModBlocks {

	public static Block copperOre;
	public static Block tinOre;
	public static Block aluminumOre;
	public static Block sulfurOre;
	public static Block copperBlock;
	public static Block tinBlock;
	public static Block basicMachineCasing;
	public static Block basicCircuitFabricator;
	public static Block oreCrusher;
	public static Block titaniumOre;
	public static Block cobaltOre;
	public static Block nickelOre;
	public static Block zincOre;
	public static Block silverOre;
	public static Block tungstenOre;
	public static Block osmiumOre;
	public static Block iridiumOre;
	public static Block platinumOre;
	public static Block leadOre;
	
	public static void init(){

		copperOre = new CopperOre();
		tinOre = new TinOre();
		copperBlock = new CopperBlock();
		tinBlock = new TinBlock();
		basicMachineCasing = new BasicMachineCasing();
		aluminumOre = new AluminumOre();
		sulfurOre = new SulfurOre();
		basicCircuitFabricator = new BasicCircuitFabricator();
		oreCrusher = new OreCrusher();
		cobaltOre = new CobaltOre();
		nickelOre = new NickelOre();
		silverOre = new SilverOre();
		tungstenOre = new TungstenOre();
		osmiumOre = new OsmiumOre();
		iridiumOre = new IridiumOre();
		platinumOre = new PlatinumOre();
		leadOre = new LeadOre();
    }
}
