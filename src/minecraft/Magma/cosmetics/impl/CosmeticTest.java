package Magma.cosmetics.impl;

import org.lwjgl.opengl.GL11;

import Magma.cosmetics.CosmeticController;
import Magma.cosmetics.CosmeticModelBase;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class CosmeticTest {
	
	private static final ResourceLocation TEXTURE = new ResourceLocation("pf/hat.png");
	
	private class ModelTopHat extends CosmeticModelBase {
		
		private ModelRenderer rim;
		private ModelRenderer pointy;

		public ModelTopHat(RenderPlayer player) {
			super(player);
			rim = new ModelRenderer(playerModel, 0, 0);
			rim.addBox(-5.5F, -9F, -5.5F, 11, 2, 11);
			pointy = new ModelRenderer(playerModel, 0, 13);
			pointy.addBox(-3.5F, -17F, -3.5F, 7, 8, 7);
		}
		
		@Override
		public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float headYaw, float headPitch, float scale) {
			
			rim.rotateAngleX = playerModel.bipedBody.rotateAngleX;
			rim.rotateAngleY = playerModel.bipedBody.rotateAngleY;
			rim.rotationPointX = 0.0F;
			rim.rotationPointY = 0.0F;
			rim.render(scale);
			
			pointy.rotateAngleX = playerModel.bipedBody.rotateAngleX;
			pointy.rotateAngleY = playerModel.bipedBody.rotateAngleY;
			pointy.rotationPointX = 0.0F;
			pointy.rotationPointY = 0.0F;
			pointy.render(scale);
			
					
		}
		
	}
	
	

}
