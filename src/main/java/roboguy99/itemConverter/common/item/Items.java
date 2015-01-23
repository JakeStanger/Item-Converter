package roboguy99.itemConverter.common.item;

import roboguy99.itemConverter.common.block.Blocks;
import roboguy99.itemConverter.common.item.block.ItemBlockCrusher;
import roboguy99.itemConverter.common.item.prefab.ItemBlock;

public class Items
{
	//Items
	public static ItemBlock itemBlockCrusher;
	
	//Item descriptions
	private static final String CRUSHER_DESC = "The main block of the crusher multiblock structure";
	
	public Items()
	{
		itemBlockCrusher = new ItemBlockCrusher("itemBlockCrusher", "diamond", Blocks.blockCrusher, Items.CRUSHER_DESC);
	}
}
