package Magma.ui;

import java.io.IOException;

import org.lwjgl.util.Color;

import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSelectWorld;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class Mainmenu extends GuiScreen {
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		mc.getTextureManager().bindTexture(new ResourceLocation("pf/Gui/back.jpg"));
		this.drawModalRectWithCustomSizedTexture(0, 0, 0, 0, this.width, this.height, this.width, this.height);
		
		
		GlStateManager.pushMatrix();
		GlStateManager.translate(width/2f, height/2f, 0);
		GlStateManager.scale(3, 3, 1);
		GlStateManager.translate(-(width/2f), -(height/2f), 0);
		mc.fontRendererObj.drawStringWithShadow("Magma", this.width/2f,height/2f - mc.fontRendererObj.FONT_HEIGHT/2f, -1);
		mc.fontRendererObj.drawStringWithShadow("Client", this.width/2f,height/2f - mc.fontRendererObj.FONT_HEIGHT/2f + 10, -1);
		
		GlStateManager.popMatrix();
		
		Gui.drawRect(0, 0, 10, this.height, new Color(0, 0, 0, 170).getRed());
		
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
	
	@Override
	public void initGui() {
		this.buttonList.add(new GuiButton(1, 10, height / 2 - 40, "Singleplayer"));
		this.buttonList.add(new GuiButton(2, 10, height / 2 - 15, "Multiplayer"));
		this.buttonList.add(new GuiButton(3, 10, height / 2 + 10, "Settings"));
		this.buttonList.add(new GuiButton(4, 10, height / 2 + 35, "Magma-Settings (coming soon)"));
		this.buttonList.add(new GuiButton(5, 10, height / 2 + 60, "Quit"));
		
		this.buttonList.get(3).enabled = false;
		super.initGui();
	}
	
	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		if(button.id == 1) {
			mc.displayGuiScreen(new GuiSelectWorld(this) {
			});
		}
		if(button.id == 2) {
			mc.displayGuiScreen(new GuiMultiplayer(this) {
			});
		}
		if(button.id == 3) {
			mc.displayGuiScreen(new GuiOptions(this, mc.gameSettings) {
			});
		}
		if(button.id == 4) {
			mc.displayGuiScreen(new GuiOptions(this, mc.gameSettings) {
			});
		}
		if(button.id == 5) {
			mc.shutdown();
		}
		
	}

}
