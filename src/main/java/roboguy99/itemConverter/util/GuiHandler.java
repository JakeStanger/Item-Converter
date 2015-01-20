package roboguy99.itemConverter.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import roboguy99.itemConverter.client.gui.GuiCrusher;
import roboguy99.itemConverter.common.inventory.ContainerDisassembler;
import roboguy99.itemConverter.common.tile.TileCrusher;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	public static final int GUIID_DISASSEMBLER = 0;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch(ID)
		{
			case GUIID_DISASSEMBLER:
				return new ContainerDisassembler(player.inventory, (TileCrusher) world.getTileEntity(x, y, z));
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch(ID)
		{
			case GUIID_DISASSEMBLER:
				return new GuiCrusher(player.inventory, (TileCrusher) world.getTileEntity(x, y, z));
		}
		
		return null;
	}
}
