package roboguy99.itemConverter.common.block.prefab;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public abstract class TileBlock extends BlockContainer
{

	protected TileBlock(Material material, String name)
	{
		super(material);
		this.setBlockName(name);
		GameRegistry.registerBlock(this, name);
	}
	
	public int getRenderType()
	{
		return -1;
	}
	
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
	public abstract TileEntity createNewTileEntity(World world, int var2);
} 
