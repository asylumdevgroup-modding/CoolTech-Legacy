package mcadventurecity.cooltech;

import mcadventurecity.cooltech.blocks.ModBlocks;
import mcadventurecity.cooltech.items.ModItems;
import mcadventurecity.cooltech.world.WorldGenCoolTech;
import mcadventurecity.cooltech.Constants;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
@Mod(modid = Constants.MODID, version = Constants.VERSION)
public class CoolTech {


	int copperOreID;
	int tinOreID;
	int siliconID;
	int copperIngotID;
	int tinIngotID;
	@SidedProxy(clientSide = Constants.CLIENT_PROXY_CLASS, serverSide = Constants.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
	@Mod.Instance(Constants.MODID)
	public static CoolTech instance;
    	@Mod.EventHandler
    	
        public void preInit(FMLPreInitializationEvent event) {

    		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    		
    		config.load();

    		// Configuration goes here.
    			
    		config.save();
    		
    		ModBlocks.init();
    		ModItems.init();
    		GameRegistry.registerWorldGenerator(new WorldGenCoolTech(), 1);
        	

    	}
    	
    	

     

        @Mod.EventHandler

        public void init(FMLInitializationEvent event) {
        	proxy.registerTileEntities();
        	GameRegistry.addRecipe(new ItemStack(Blocks.bedrock), "xxx", "xyx", "xxx",
                    'x', Blocks.obsidian, 'y', Blocks.stone);
        	GameRegistry.addRecipe(new ItemStack(ModBlocks.copperBlock), "xxx", "xxx", "xxx",
                    'x', ModItems.copperIngot);
        	GameRegistry.addRecipe(new ItemStack(ModBlocks.tinBlock), "xxx", "xxx", "xxx",
                    'x', ModItems.tinIngot);
        	GameRegistry.addRecipe(new ItemStack(ModBlocks.basicMachineCasing), "xxx", "yzy", "xxx",
                    'x', ModItems.tinIngot, 'y', Items.iron_ingot, 'z', ModItems.copperGear);
        	GameRegistry.addRecipe(new ItemStack(ModItems.copperGear), " x ", "xyx", " x ",
                    'x', ModItems.copperIngot, 'y', Items.stick);
        	GameRegistry.addRecipe(new ItemStack(ModItems.tinGear), " x ", "xyx", " x ",
                    'x', ModItems.tinIngot, 'y', Items.stick);
        	GameRegistry.addRecipe(new ItemStack(ModItems.aluminumGear), " x ", "xyx", " x ",
                    'x', ModItems.aluminumIngot, 'y', Items.stick);
        	GameRegistry.addRecipe(new ItemStack(ModBlocks.basicCircuitFabricator), "aaa", "bcb", "ded",
                    'a', ModItems.tinIngot, 'b', ModItems.aluminumIngot, 'c', ModBlocks.basicMachineCasing, 'd', ModItems.copperGear, 'e', ModItems.tinGear);
        	GameRegistry.addRecipe(new ItemStack(ModItems.basicCircuit), " x ", "yzy", " x ",
                    'x', ModItems.copperIngot, 'y', ModItems.silicon, 'z', Items.redstone);
        	GameRegistry.addRecipe(new ItemStack(ModItems.basicWrench), "x x", " y ", " z ",
                    'x', ModItems.copperIngot, 'y', ModItems.tinIngot, 'z', ModItems.osmiumIngot);
        	GameRegistry.addShapelessRecipe(new ItemStack (ModItems.bronzeIngot, 4), new Object[]{ModItems.hotCopperIngot, ModItems.hotCopperIngot, ModItems.hotCopperIngot, ModItems.hotTinIngot});
        	GameRegistry.addShapelessRecipe(new ItemStack (ModItems.silicon, 2), new Object[]{Blocks.sand});
        	GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack (ModItems.copperIngot), 0.2F);
        	GameRegistry.addSmelting(ModBlocks.tinOre, new ItemStack (ModItems.tinIngot), 0.2F);
        	GameRegistry.addSmelting(ModBlocks.cobaltOre, new ItemStack (ModItems.cobaltIngot), 0.3F);
        	GameRegistry.addSmelting(ModBlocks.iridiumOre, new ItemStack (ModItems.iridiumIngot), 0.6F);
        	GameRegistry.addSmelting(ModBlocks.leadOre, new ItemStack (ModItems.leadIngot), 0.3F);
        	GameRegistry.addSmelting(ModBlocks.nickelOre, new ItemStack (ModItems.nickelIngot), 0.4F);
        	GameRegistry.addSmelting(ModBlocks.osmiumOre, new ItemStack (ModItems.osmiumIngot), 0.2F);
        	GameRegistry.addSmelting(ModBlocks.platinumOre, new ItemStack (ModItems.platinumIngot), 0.5F);
        	GameRegistry.addSmelting(ModBlocks.silverOre, new ItemStack (ModItems.silverIngot), 0.3F);
        	GameRegistry.addSmelting(ModBlocks.tungstenOre, new ItemStack (ModItems.tungstenIngot), 0.5F);
        	GameRegistry.addSmelting(ModBlocks.aluminumOre, new ItemStack (ModItems.aluminumIngot), 0.2F);
        	GameRegistry.addSmelting(ModBlocks.sulfurOre, new ItemStack (ModItems.sulfur, 4), 0.3F);
        	GameRegistry.addSmelting(ModItems.copperIngot, new ItemStack (ModItems.hotCopperIngot), 0.2F);
        	GameRegistry.addSmelting(ModItems.tinIngot, new ItemStack (ModItems.hotTinIngot), 0.2F);
        	
        	OreDictionary.registerOre("oreCopper", ModBlocks.copperOre);
        	OreDictionary.registerOre("oreTin", ModBlocks.tinOre);
        	OreDictionary.registerOre("oreAluminum",ModBlocks.aluminumOre);
        	OreDictionary.registerOre("oreAluminium", ModBlocks.aluminumOre);
        	OreDictionary.registerOre("oreSulfur", ModBlocks.sulfurOre);
        	OreDictionary.registerOre("ingotCopper", ModItems.copperIngot);
        	OreDictionary.registerOre("ingotTin", ModItems.tinIngot);
        	OreDictionary.registerOre("ingotAluminum", ModItems.aluminumIngot);
        	OreDictionary.registerOre("ingotAluminium", ModItems.aluminumIngot);
        	OreDictionary.registerOre("dustSulfur", ModItems.sulfur);
        	OreDictionary.registerOre("gearCopper", ModItems.copperGear);
        	OreDictionary.registerOre("gearTin", ModItems.tinGear);
        	OreDictionary.registerOre("gearAluminum", ModItems.aluminumGear);
        	OreDictionary.registerOre("gearAluminium", ModItems.aluminumGear);
        	OreDictionary.registerOre("ingotBronze", ModItems.bronzeIngot);
        	OreDictionary.registerOre("oreLead", ModBlocks.leadOre);
        	OreDictionary.registerOre("oreNickel", ModBlocks.nickelOre);
        	OreDictionary.registerOre("oreOsmium", ModBlocks.osmiumOre);
        	OreDictionary.registerOre("orePlatinum", ModBlocks.platinumOre);
        	OreDictionary.registerOre("oreSilver", ModBlocks.silverOre);
        	OreDictionary.registerOre("oreTungsten", ModBlocks.tungstenOre);
        	OreDictionary.registerOre("ingotLead", ModItems.leadIngot);
        	OreDictionary.registerOre("ingotNickel", ModItems.nickelIngot);
        	OreDictionary.registerOre("ingotOsmium", ModItems.osmiumIngot);
        	OreDictionary.registerOre("ingotPlatinum", ModItems.platinumIngot);
        	OreDictionary.registerOre("ingotSilver", ModItems.silverIngot);
        	OreDictionary.registerOre("ingotTungsten", ModItems.tungstenIngot);
        }

     

        @Mod.EventHandler

        public void postInit(FMLPostInitializationEvent event) {

     

        }
}
