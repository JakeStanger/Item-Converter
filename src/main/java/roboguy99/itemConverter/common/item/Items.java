package roboguy99.itemConverter.common.item;

import roboguy99.itemConverter.common.block.Blocks;
import roboguy99.itemConverter.common.item.block.ItemBlockCrusher;
import roboguy99.itemConverter.common.item.prefab.ItemBlock;

public class Items
{
	public static ItemBlock itemBlockCrusher;
	
	public Items()
	{
		itemBlockCrusher = new ItemBlockCrusher("itemBlockCrusher", "diamond", Blocks.blockCrusher);
	}
}
