package roboguy99.itemConverter.proxies;

import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import roboguy99.itemConverter.client.render.block.RenderCrusher;
import roboguy99.itemConverter.client.render.item.RenderItemCrusher;
import roboguy99.itemConverter.common.item.Items;
import roboguy99.itemConverter.common.tile.TileCrusher;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
	public void registerProxies()
	{
		//Render custom tile entities
		ClientRegistry.bindTileEntitySpecialRenderer(TileCrusher.class, new RenderCrusher());
		
		//Render 3D item models
		MinecraftForgeClient.registerItemRenderer(Items.itemBlockCrusher, (IItemRenderer)new RenderItemCrusher());
	}
}
