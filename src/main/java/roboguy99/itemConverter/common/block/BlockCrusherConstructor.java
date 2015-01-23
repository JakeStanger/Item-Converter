package roboguy99.itemConverter.common.block;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import roboguy99.itemConverter.common.block.prefab.TileBlock;
import roboguy99.itemConverter.common.tile.TileCrusherConstructor;

public class BlockCrusherConstructor extends TileBlock
{
	protected BlockCrusherConstructor(Material material, String name)
	{
		super(material, name);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int var2)
	{
		return new TileCrusherConstructor();
	}
}
