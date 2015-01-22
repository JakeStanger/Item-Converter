package roboguy99.itemConverter.common.item.block;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import roboguy99.itemConverter.common.item.prefab.ItemBlock;

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
		return false;
	}
}
