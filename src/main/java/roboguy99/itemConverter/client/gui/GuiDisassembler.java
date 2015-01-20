package roboguy99.itemConverter.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import roboguy99.itemConverter.common.inventory.ContainerDisassembler;
import roboguy99.itemConverter.common.tile.TileDisassembler;

public class GuiDisassembler extends GuiContainer
{

	public GuiDisassembler(InventoryPlayer inventoryPlayer, TileDisassembler disassembler)
	{
		super(new ContainerDisassembler(inventoryPlayer, disassembler));
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
	{
		
	}
	
}
