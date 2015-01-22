package roboguy99.itemConverter.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
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
	
	public void breakBlock(World world, int i, int j, int k, int par5, int par6)
	{
		TileCrusher tileEntity = (TileCrusher)world.getTileEntity(i, j, k);
		
		if (tileEntity != null)
        {
                world.func_147480_a(tileEntity.primary_x, tileEntity.primary_y, tileEntity.primary_z, false);
                world.removeTileEntity(tileEntity.primary_x, tileEntity.primary_y, tileEntity.primary_z);
        }
        //Same as above, but for the gag block tile entity.
        world.removeTileEntity(i, j, k);
	}
	
    @Override
	public void onNeighborBlockChange(World world, int i, int j, int k, Block block)
	{
        TileCrusher tileEntity = (TileCrusher)world.getTileEntity(i, j, k);
        if (tileEntity != null)
        {
            if(world.getBlock(tileEntity.primary_x, tileEntity.primary_y, tileEntity.primary_z) == Blocks.air)
            {
                world.func_147480_a(i, j, k, false);
                world.removeTileEntity(i, j, k);
            }
        }
    }
}
