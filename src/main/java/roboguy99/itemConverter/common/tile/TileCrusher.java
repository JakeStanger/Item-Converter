package roboguy99.itemConverter.common.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileCrusher extends TileEntity implements IInventory
{
    //Multiblock primary block co-ordinates
    public int primary_x;
    public int primary_y;
    public int primary_z;
    
	public void writeToNBT(NBTTagCompound par1NBTTagCompound)
	{
	    super.writeToNBT(par1NBTTagCompound);
	    par1NBTTagCompound.setInteger("px", primary_x);
	    par1NBTTagCompound.setInteger("py", primary_y);
	    par1NBTTagCompound.setInteger("pz", primary_z);
	}
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
	{
	    super.readFromNBT(par1NBTTagCompound);
	    this.primary_x = par1NBTTagCompound.getInteger("px");
	    this.primary_y = par1NBTTagCompound.getInteger("py");
	    this.primary_z = par1NBTTagCompound.getInteger("pz");
	}
	
	@Override
	public int getSizeInventory()
	{
		return 0;
	}

	@Override
	public ItemStack getStackInSlot(int p_70301_1_)
	{
		return null;
	}

	@Override
	public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_)
	{
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int p_70304_1_)
	{
		return null;
	}

	@Override
	public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_)
	{
		
	}

	@Override
	public String getInventoryName()
	{
		return null;
	}

	@Override
	public boolean hasCustomInventoryName()
	{
		return false;
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 0;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer p_70300_1_)
	{
		return false;
	}

	@Override
	public void openInventory()
	{
		
	}

	@Override
	public void closeInventory()
	{
		
	}

	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_)
	{
		return false;
	}
}
