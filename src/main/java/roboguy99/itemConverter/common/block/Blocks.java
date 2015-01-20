package roboguy99.itemConverter.common.block;

import net.minecraft.block.material.Material;
import roboguy99.itemConverter.common.block.prefab.TileBlock;

public class Blocks
{
	public static TileBlock blockDisassembler;
	
	public Blocks()
	{
		blockDisassembler = new BlockCrusher(Material.iron, "blockDisassembler");
	}
}
