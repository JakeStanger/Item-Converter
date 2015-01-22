package roboguy99.itemConverter.common.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import roboguy99.itemConverter.common.tile.TileCrusher;

public class ContainerCrusher extends Container
{
	public ContainerCrusher(InventoryPlayer inventoryPlayer, TileCrusher grindstone)
	{
		for(int i = 0; i < 3; i++) //Create the inventory slots
		{
			for(int j = 0; j < 9; j++)
			{
				this.addSlotToContainer(new Slot(inventoryPlayer, 9+j+i*9, 8+j*18, 84+18*i));
			}
		}
		
		for(int i = 0; i < 9; i++) //Create the hotbar slots
		{
			this.addSlotToContainer(new Slot(inventoryPlayer, i, 8+18*i, 142));
		}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player)
	{
		return true;
	}
}
