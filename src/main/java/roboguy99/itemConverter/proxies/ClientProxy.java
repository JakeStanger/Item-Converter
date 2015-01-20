package roboguy99.itemConverter.proxies;

import roboguy99.itemConverter.client.render.RenderDisassembler;
import roboguy99.itemConverter.common.tile.TileCrusher;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
	public void registerProxies()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileCrusher.class, new RenderDisassembler());
	}
}
