package roboguy99.itemConverter;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import roboguy99.itemConverter.common.block.Blocks;
import roboguy99.itemConverter.common.item.Items;
import roboguy99.itemConverter.common.tile.RegisterTileEntities;
import roboguy99.itemConverter.proxies.CommonProxy;
import roboguy99.itemConverter.util.GuiHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

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
		instance = this;
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerProxies();
		
		new Blocks();
		new Items();
		new RegisterTileEntities();
		
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler()); //Load the GUI handler
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	public static final CreativeTabs TAB_FOODTECH = new CreativeTabs("tabFoodTech") 
	 {

		public Item getTabIconItem() 
		{
			return Item.getItemFromBlock(Blocks.blockCrusher);
		}
	 };
}
