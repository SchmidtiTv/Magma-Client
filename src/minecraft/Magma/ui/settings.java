package Magma.ui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;

public class settings extends GuiScreen {
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
	
		mc.getTextureManager().bindTexture(new ResourceLocation("pf/Gui/back.jpg"));
		
	}

	
	
}
