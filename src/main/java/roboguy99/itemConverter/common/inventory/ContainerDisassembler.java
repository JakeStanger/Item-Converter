package roboguy99.itemConverter.common.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import roboguy99.itemConverter.common.tile.TileDisassembler;

public class ContainerDisassembler extends Container
{
	public ContainerDisassembler(InventoryPlayer inventoryPlayer, TileDisassembler grindstone)
	{
		
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player)
	{
		return false;
	}
	
}
