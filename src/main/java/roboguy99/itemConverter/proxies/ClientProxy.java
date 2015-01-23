package roboguy99.itemConverter.proxies;

import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import roboguy99.itemConverter.client.render.block.RenderCrusherConstructor;
import roboguy99.itemConverter.client.render.block.RenderCrusherControls;
import roboguy99.itemConverter.client.render.item.RenderItemCrusherConstructor;
import roboguy99.itemConverter.client.render.item.RenderItemCrusherControls;
import roboguy99.itemConverter.common.item.Items;
import roboguy99.itemConverter.common.tile.TileCrusherConstructor;
import roboguy99.itemConverter.common.tile.TileCrusherControls;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
	public void registerProxies()
	{
		//Render custom tile entities
		ClientRegistry.bindTileEntitySpecialRenderer(TileCrusherControls.class, new RenderCrusherControls());
		ClientRegistry.bindTileEntitySpecialRenderer(TileCrusherConstructor.class, new RenderCrusherConstructor());
		
		//Render 3D item models
		MinecraftForgeClient.registerItemRenderer(Items.itemBlockCrusherControls, (IItemRenderer)new RenderItemCrusherControls());
		MinecraftForgeClient.registerItemRenderer(Items.itemBlockCrusherConstructor, (IItemRenderer)new RenderItemCrusherConstructor());
	}
}
