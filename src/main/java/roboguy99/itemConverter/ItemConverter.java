package roboguy99.itemConverter;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import roboguy99.itemConverter.common.block.Blocks;
import roboguy99.itemConverter.common.tile.RegisterTileEntities;
import roboguy99.itemConverter.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ItemConverter.modID, version = ItemConverter.modVersion, name = ItemConverter.name)
public class ItemConverter
{
	//Mod data. Fallback if mc-mod.info fails to load.
	public static final String modID = "Roboguy99ItemConverter";
	public static final String modVersion = "0.0.1";
	public static final String name = "Item Converter";
	
	public static ItemConverter instance;
	
	@SidedProxy(clientSide = "roboguy99.itemConverter.proxies.ClientProxy", serverSide = "roboguy99.itemConverter.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		new Blocks();
		new RegisterTileEntities();
		proxy.registerProxies();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	public static final CreativeTabs TAB_FOODTECH = new CreativeTabs("tabFoodTech") 
	 {

		public Item getTabIconItem() 
		{
			return Item.getItemFromBlock(Blocks.blockDisassembler);
		}
	 };
	 
	 // your mum has no boobs
}
