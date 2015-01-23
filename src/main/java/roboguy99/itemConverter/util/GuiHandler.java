package roboguy99.itemConverter.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import roboguy99.itemConverter.client.gui.GuiCrusher;
import roboguy99.itemConverter.common.inventory.ContainerCrusher;
import roboguy99.itemConverter.common.tile.TileCrusherControls;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	public static final int GUIID_CRUSHER_CONTROLS = 0;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch(ID)
		{
			case GUIID_CRUSHER_CONTROLS:
				return new ContainerCrusher(player.inventory, (TileCrusherControls) world.getTileEntity(x, y, z));
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch(ID)
		{
			case GUIID_CRUSHER_CONTROLS:
				return new GuiCrusher(player.inventory, (TileCrusherControls) world.getTileEntity(x, y, z));
		}
		
		return null;
	}
}
