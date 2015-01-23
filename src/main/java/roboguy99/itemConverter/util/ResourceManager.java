package roboguy99.itemConverter.util;

import net.minecraft.util.ResourceLocation;

public class ResourceManager
{
	//Paths
	private static final String MODEL_TEXTURE_PATH = "roboguy99:textures/models/";
	private static final String GUI_TEXTURE_PATH = "roboguy99:textures/gui/";
	
	//Tile entity locations
	public static final ResourceLocation CRUSHER_CONTROLS = new ResourceLocation(ResourceManager.MODEL_TEXTURE_PATH + "modelCrusher.png");
	
	//GUI locations
	public static final ResourceLocation BLANK_GUI = new ResourceLocation(ResourceManager.GUI_TEXTURE_PATH + "blank.png");
}
