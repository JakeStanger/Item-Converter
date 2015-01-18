package roboguy99.itemConverter.common.block.prefab;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileBlock extends BlockContainer
{

	protected TileBlock(Material material, String name)
	{
		super(material);
		this.setBlockName(name);
		GameRegistry.registerBlock(this, name);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int var1)
	{
		return null;
	}
	
} 
