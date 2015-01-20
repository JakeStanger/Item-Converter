package roboguy99.itemConverter.common.tile;

import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterTileEntities
{
	public RegisterTileEntities()
	{
		GameRegistry.registerTileEntity(TileDisassembler.class, "r99_disassembler");
	}
}
