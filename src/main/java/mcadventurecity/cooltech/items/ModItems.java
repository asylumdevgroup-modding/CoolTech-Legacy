package mcadventurecity.cooltech.items;

import net.minecraft.item.Item;

public final class ModItems {
	

	public static Item silicon;
	public static Item copperIngot;
	public static Item tinIngot;
	public static Item copperGear;
	public static Item aluminumIngot;
	public static Item sulfur;
	public static Item tinGear;
	public static Item aluminumGear;
	public static Item hotCopperIngot;
	public static Item hotTinIngot;
	public static Item bronzeIngot;
	public static Item basicCircuit;
	public static Item titaniumIngot;
	public static Item cobaltIngot;
	public static Item nickelIngot;
	public static Item zincIngot;
	public static Item silverIngot;
	public static Item tungstenIngot;
	public static Item osmiumIngot;
	public static Item iridiumIngot;
	public static Item platinumIngot;
	public static Item leadIngot;
	public static Item basicWrench;
	
	public static void init(){
		
		silicon = new Silicon();
		copperIngot = new CopperIngot();
		tinIngot = new TinIngot();
		copperGear = new CopperGear();
		tinGear = new TinGear();
		aluminumGear = new AluminumGear();
		aluminumIngot = new AluminumIngot();
		sulfur = new Sulfur();
		hotCopperIngot = new HotCopperIngot();
		hotTinIngot = new HotTinIngot();
		bronzeIngot = new BronzeIngot();
		basicCircuit = new BasicCircuit();
		titaniumIngot = new TitaniumIngot();
		cobaltIngot = new CobaltIngot();
		nickelIngot = new NickelIngot();
		zincIngot = new ZincIngot();
		silverIngot = new SilverIngot();
		tungstenIngot = new TungstenIngot();
		osmiumIngot = new OsmiumIngot();
		iridiumIngot = new IridiumIngot();
		platinumIngot = new PlatinumIngot();
		leadIngot = new LeadIngot();
		basicWrench = new BasicWrench();

	}	
}
