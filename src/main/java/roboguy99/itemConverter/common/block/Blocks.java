package roboguy99.itemConverter.common.block;

import net.minecraft.block.material.Material;
import roboguy99.itemConverter.common.block.prefab.TileBlock;

public class Blocks
{
	public static TileBlock blockCrusherControls;
	public static TileBlock blockCrusherConstructor;
	
	public Blocks()
	{
		blockCrusherControls = new BlockCrusherControls(Material.iron, "blockCrusherControls");
		blockCrusherConstructor = new BlockCrusherConstructor(Material.iron, "blockCrusherConstructor");
	}
}
