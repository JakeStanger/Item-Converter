package roboguy99.itemConverter.common.item;

import roboguy99.itemConverter.common.block.Blocks;
import roboguy99.itemConverter.common.item.block.ItemBlockCrusherConstructor;
import roboguy99.itemConverter.common.item.block.ItemBlockCrusherControls;
import roboguy99.itemConverter.common.item.prefab.ItemBlock;

public class Items
{
	//Items
	public static ItemBlock itemBlockCrusherControls;
	public static ItemBlock itemBlockCrusherConstructor;
	
	//Item descriptions
	private static final String CRUSHER_CONTROLS_DESC = "The main block of the crusher multiblock structure";
	private static final String CRUSHER_CONSTRUCTOR_DESC = "The main construction block of the crusher multiblock structure";
	
	public Items()
	{
		itemBlockCrusherControls = new ItemBlockCrusherControls("itemBlockCrusher", "diamond", Blocks.blockCrusherControls, Items.CRUSHER_CONTROLS_DESC);
		itemBlockCrusherConstructor = new ItemBlockCrusherConstructor("itemBlockCrusherConstructor", "diamond", Blocks.blockCrusherConstructor, Items.CRUSHER_CONSTRUCTOR_DESC);
	}
}
