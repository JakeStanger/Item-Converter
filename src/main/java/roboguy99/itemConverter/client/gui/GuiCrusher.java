package roboguy99.itemConverter.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import roboguy99.itemConverter.common.inventory.ContainerCrusher;
import roboguy99.itemConverter.common.tile.TileCrusher;
import roboguy99.itemConverter.util.ResourceManager;

public class GuiCrusher extends GuiContainer
{
	private final ResourceLocation texture = ResourceManager.BLANK_GUI;
	
	//private TileDisassembler disassembler;
	
	public GuiCrusher(InventoryPlayer inventoryPlayer, TileCrusher disassembler)
	{
		super(new ContainerCrusher(inventoryPlayer, disassembler));
		
		// this.disassembler = disassembler; -- Used for progress bars later on
		
		this.xSize = 176;
		this.ySize = 166;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
	{
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		drawTexturedModalRect(this.guiLeft, this.guiTop,
				0, 0, 
				this.xSize, this.ySize);
	}
	
}
