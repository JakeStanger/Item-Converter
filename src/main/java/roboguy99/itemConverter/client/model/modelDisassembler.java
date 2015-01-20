package roboguy99.itemConverter.client.model;

import org.apache.commons.lang3.RandomUtils;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * modelDisassembler - Roboguy99
 * Created using Tabula 4.1.1
 */
public class modelDisassembler extends ModelBase 
{
    public ModelRenderer layer9;
    public ModelRenderer layer1;
    public ModelRenderer layer2;
    public ModelRenderer layer3;
    public ModelRenderer layer4;
    public ModelRenderer layer5;
    public ModelRenderer layer6;
    public ModelRenderer layer8;

    public modelDisassembler() 
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.layer4 = new ModelRenderer(this, 0, 0);
        this.layer4.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.layer4.addBox(-5.0F, 0.0F, -5.0F, 10, 1, 10, 0.0F);
        this.layer1 = new ModelRenderer(this, 0, 0);
        this.layer1.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.layer1.addBox(-8.0F, 0.0F, -8.0F, 16, 1, 16, 0.0F);
        this.layer5 = new ModelRenderer(this, 0, 0);
        this.layer5.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.layer5.addBox(-4.0F, 0.0F, -4.0F, 8, 1, 8, 0.0F);
        this.layer3 = new ModelRenderer(this, 0, 0);
        this.layer3.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.layer3.addBox(-6.0F, 0.0F, -6.0F, 12, 1, 12, 0.0F);
        this.layer9 = new ModelRenderer(this, 0, 0);
        this.layer9.setRotationPoint(-0.0F, 15.0F, -0.0F);
        this.layer9.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.layer6 = new ModelRenderer(this, 0, 0);
        this.layer6.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.layer6.addBox(-3.0F, 0.0F, -3.0F, 6, 1, 6, 0.0F);
        this.layer8 = new ModelRenderer(this, 0, 0);
        this.layer8.setRotationPoint(0.0F, 17.0F, 0.0F);
        this.layer8.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 4, 0.0F);
        this.layer2 = new ModelRenderer(this, 0, 0);
        this.layer2.setRotationPoint(0.0F, 22.0F, 0.0F);
        this.layer2.addBox(-7.0F, 0.0F, -7.0F, 14, 1, 14, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
        this.layer4.render(f5);
        this.layer1.render(f5);
        this.layer5.render(f5);
        this.layer3.render(f5);
        this.layer9.render(f5);
        this.layer6.render(f5);
        this.layer8.render(f5);
        this.layer2.render(f5);
        this.rotateProcess();
    }
    
    public void rotateIdle()
    {
    	this.layer1.rotateAngleY += RandomUtils.nextFloat(0.001F, 0.005F);
    	this.layer2.rotateAngleY += RandomUtils.nextFloat(0.001F, 0.005F);
    	this.layer3.rotateAngleY += RandomUtils.nextFloat(0.001F, 0.005F);
    	this.layer4.rotateAngleY += RandomUtils.nextFloat(0.001F, 0.005F);
    	this.layer5.rotateAngleY += RandomUtils.nextFloat(0.001F, 0.005F);
    	this.layer6.rotateAngleY += RandomUtils.nextFloat(0.001F, 0.005F);
    	this.layer8.rotateAngleY += RandomUtils.nextFloat(0.001F, 0.005F);
    	this.layer9.rotateAngleY += RandomUtils.nextFloat(0.001F, 0.005F);
    }
    
    public void rotateProcess()
    {
    	this.layer1.rotateAngleY += RandomUtils.nextFloat(0.1F, 0.15F);
    	this.layer2.rotateAngleY += RandomUtils.nextFloat(0.1F, 0.15F);
    	this.layer3.rotateAngleY += RandomUtils.nextFloat(0.1F, 0.15F);
    	this.layer4.rotateAngleY += RandomUtils.nextFloat(0.1F, 0.15F);
    	this.layer5.rotateAngleY += RandomUtils.nextFloat(0.1F, 0.15F);
    	this.layer6.rotateAngleY += RandomUtils.nextFloat(0.1F, 0.15F);
    	this.layer8.rotateAngleY += RandomUtils.nextFloat(0.1F, 0.15F);
    	this.layer9.rotateAngleY += RandomUtils.nextFloat(0.1F, 0.15F);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) 
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
