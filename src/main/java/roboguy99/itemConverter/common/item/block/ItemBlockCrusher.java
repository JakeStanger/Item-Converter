package roboguy99.itemConverter.common.item.block;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import roboguy99.itemConverter.common.item.prefab.ItemBlock;
import roboguy99.itemConverter.common.tile.TileCrusher;

public class ItemBlockCrusher extends ItemBlock
{
	public ItemBlockCrusher(String name, String textureName, Block block)
	{
		super(name, textureName, block);
	}

	@Override
	public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float xOff, float yOff, float zOff)
	{
		if(!player.capabilities.isCreativeMode)
		{
			item.stackSize--;
		}
		
		if(!world.isRemote)
		{
			y++;
			
			int dir = MathHelper.floor_double((double)((player.rotationYaw * 4F) / 360F) + 0.5D) & 3;
			
			int[][] blockShift = {{-1, 0, -1}, {-1, 0, 0}, {-1, 0, 1}};
			int[] shift;
			
			boolean canPlace = true;
			for(int i = 0; i < blockShift.length; i++)
			{
				shift = rotXZByDir(blockShift[i][0], y, blockShift[i][1], dir);
				if(!world.isAirBlock(x + shift[0], y + shift[1], z + shift[2])) canPlace = false;
			}
			
			if(canPlace)
			{
				world.setBlock(x, y, z, roboguy99.itemConverter.common.block.Blocks.blockCrusher, dir, 0x02);
				
				for(int i = 0; i < blockShift.length; i++)
				{
					shift = rotXZByDir(blockShift[i][0], y, blockShift[i][1], dir);
					world.setBlock(x + shift[0], y + shift[1], z + shift[2], roboguy99.itemConverter.common.block.Blocks.blockCrusher, dir, 0x02);
					
					TileCrusher tileEntity = (TileCrusher)world.getTileEntity(x + shift[0], y, z + shift[1]);
					
					if(tileEntity != null)
					{
						tileEntity.primary_x = x;
						tileEntity.primary_y = y;
						tileEntity.primary_z = z;
					}
				}
				
				return true;
			}
		}
		
		return false;
	}
	
	public int[] rotXZByDir(int x, int y, int z, int dir)
	{
		if(dir == 0) return new int[] {x, y, z};
		else if(dir == 1) return new int[] {-z, y, x};
		else if(dir == 1) return new int[] {-x, y, -z};
		else return new int[] {z, y, -x};
	}
}
