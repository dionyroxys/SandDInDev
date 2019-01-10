package com.LittleNekoTerra.SurviveAndDiscover.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * NewProject - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelShroomalVillager extends ModelBase {
    public ModelRenderer Lleg;
    public ModelRenderer Rleg;
    public ModelRenderer uppertorso;
    public ModelRenderer Head;
    public ModelRenderer Larm1;
    public ModelRenderer Rarm1;
    public ModelRenderer torso;
    public ModelRenderer cap2;
    public ModelRenderer cap1;
    public ModelRenderer Larm2;
    public ModelRenderer Rarm2;

    public ModelShroomalVillager() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Rarm2 = new ModelRenderer(this, -5, 16);
        this.Rarm2.setRotationPoint(3.0F, 3.8F, 2.2F);
        this.Rarm2.addBox(-4.2F, 0.0F, -3.5F, 4, 9, 5, 0.0F);
        this.setRotateAngle(Rarm2, 0.0F, 0.0F, -0.2792526803190927F);
        this.uppertorso = new ModelRenderer(this, 0, 11);
        this.uppertorso.setRotationPoint(-1.8F, 8.2F, 0.4F);
        this.uppertorso.addBox(-2.0F, -4.4F, -2.5F, 6, 12, 6, 0.0F);
        this.setRotateAngle(uppertorso, 0.0F, 0.15707963267948966F, -1.5707963267948966F);
        this.Larm1 = new ModelRenderer(this, 48, 17);
        this.Larm1.setRotationPoint(3.8F, 6.5F, -0.6F);
        this.Larm1.addBox(-0.0F, -0.0F, -0.4F, 3, 6, 4, 0.0F);
        this.setRotateAngle(Larm1, 0.0F, 0.0F, -0.6108652381980153F);
        this.cap2 = new ModelRenderer(this, -8, 43);
        this.cap2.setRotationPoint(-3.6F, -7.7F, 4.3F);
        this.cap2.addBox(-6.0F, -2.0F, -12.5F, 19, 4, 17, 0.0F);
        this.Rarm1 = new ModelRenderer(this, 38, 20);
        this.Rarm1.setRotationPoint(-6.6F, 5.0F, -0.6F);
        this.Rarm1.addBox(0.0F, -0.1F, -0.8F, 3, 6, 4, 0.0F);
        this.setRotateAngle(Rarm1, 0.0F, 0.0F, 0.6108652381980153F);
        this.Lleg = new ModelRenderer(this, 32, 21);
        this.Lleg.setRotationPoint(3.9F, 18.9F, 0.6F);
        this.Lleg.addBox(-2.9F, 0.0F, -2.5F, 5, 5, 5, 0.0F);
        this.Rleg = new ModelRenderer(this, 35, 21);
        this.Rleg.setRotationPoint(-3.8F, 18.9F, 0.7F);
        this.Rleg.addBox(-2.9F, 0.0F, -2.5F, 5, 5, 5, 0.0F);
        this.Head = new ModelRenderer(this, 27, 7);
        this.Head.setRotationPoint(0.0F, 6.2F, -0.1F);
        this.Head.addBox(-3.0F, -6.0F, -3.0F, 6, 6, 6, 0.0F);
        this.torso = new ModelRenderer(this, -4, 8);
        this.torso.setRotationPoint(-5.4F, 2.5F, -0.5F);
        this.torso.addBox(-7.5F, -6.0F, -4.0F, 13, 12, 8, 0.0F);
        this.setRotateAngle(torso, -0.15707963267948966F, 0.0F, 1.5707963267948966F);
        this.Larm2 = new ModelRenderer(this, 0, 8);
        this.Larm2.setRotationPoint(0.2F, 4.0F, 0.5F);
        this.Larm2.addBox(0.0F, 0.1F, -1.4F, 4, 9, 5, 0.0F);
        this.setRotateAngle(Larm2, 0.0F, 0.0F, 0.2792526803190927F);
        this.cap1 = new ModelRenderer(this, 5, 48);
        this.cap1.setRotationPoint(-7.3F, -12.4F, -7.3F);
        this.cap1.addBox(0.0F, 0.0F, 1.0F, 15, 4, 13, 0.0F);
        this.Rarm1.addChild(this.Rarm2);
        this.Head.addChild(this.cap2);
        this.uppertorso.addChild(this.torso);
        this.Larm1.addChild(this.Larm2);
        this.Head.addChild(this.cap1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.uppertorso.render(f5);
        this.Larm1.render(f5);
        this.Rarm1.render(f5);
        this.Lleg.render(f5);
        this.Rleg.render(f5);
        this.Head.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.Lleg.rotateAngleX = MathHelper.cos(limbSwing * 0.662F) * 1.4F * limbSwingAmount;
    	this.Rleg.rotateAngleX = MathHelper.cos(limbSwing * 0.662F + (float) Math.PI) * 1.4F * limbSwingAmount;
    
    	this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.Head.rotateAngleX = headPitch * 0.017453292F;
    }
}
