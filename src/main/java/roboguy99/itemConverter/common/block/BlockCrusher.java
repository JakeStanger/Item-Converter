package roboguy99.itemConverter.common.block;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import roboguy99.itemConverter.ItemConverter;
import roboguy99.itemConverter.common.block.prefab.TileBlock;
import roboguy99.itemConverter.common.tile.TileCrusher;
import roboguy99.itemConverter.util.GuiHandler;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;

public class BlockCrusher extends TileBlock
{
	public BlockCrusher(Material material, String name)
	{
		super(material, name);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int var2)
	{
		return new TileCrusher();
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
	{
		FMLNetworkHandler.openGui(player, ItemConverter.instance, GuiHandler.GUIID_DISASSEMBLER, world, x, y, z);
		return true;
	}
}
