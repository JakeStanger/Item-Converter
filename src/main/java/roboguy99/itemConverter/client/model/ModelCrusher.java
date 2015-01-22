package roboguy99.itemConverter.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCrusher - Robonics
 * Created using Tabula 4.1.1
 */
public class ModelCrusher extends ModelBase {
    public ModelRenderer Base;
    public ModelRenderer RightWall;
    public ModelRenderer LeftWall;
    public ModelRenderer Top;
    public ModelRenderer shape7;
    public ModelRenderer shape7_1;
    public ModelRenderer shape7_2;
    public ModelRenderer shape7_3;

    public ModelCrusher() {
        this.textureWidth = 512;
        this.textureHeight = 512;
        this.shape7_2 = new ModelRenderer(this, 0, 0);
        this.shape7_2.setRotationPoint(46.5F, -24.0F, 4.0F);
        this.shape7_2.addBox(0.0F, 0.0F, 0.0F, 1, 16, 2, 0.0F);
        this.shape7 = new ModelRenderer(this, 0, 0);
        this.shape7.setRotationPoint(0.5F, -24.0F, 4.0F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 1, 16, 2, 0.0F);
        this.RightWall = new ModelRenderer(this, 0, 0);
        this.RightWall.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.RightWall.addBox(0.0F, 0.0F, 0.0F, 48, -16, 4, 0.0F);
        this.shape7_1 = new ModelRenderer(this, 0, 0);
        this.shape7_1.setRotationPoint(0.5F, -24.0F, 26.0F);
        this.shape7_1.addBox(0.0F, 0.0F, 0.0F, 1, 16, 2, 0.0F);
        this.LeftWall = new ModelRenderer(this, 0, 0);
        this.LeftWall.setRotationPoint(0.0F, -24.0F, 28.0F);
        this.LeftWall.addBox(0.0F, 0.0F, 0.0F, 48, 16, 4, 0.0F);
        this.Top = new ModelRenderer(this, 0, 0);
        this.Top.setRotationPoint(0.0F, -29.0F, 0.0F);
        this.Top.addBox(0.0F, 0.0F, 0.0F, 48, 5, 32, 0.0F);
        this.shape7_3 = new ModelRenderer(this, 0, 0);
        this.shape7_3.setRotationPoint(46.5F, -24.0F, 26.0F);
        this.shape7_3.addBox(0.0F, 0.0F, 0.0F, 1, 16, 2, 0.0F);
        this.Base = new ModelRenderer(this, 0, 0);
        this.Base.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Base.addBox(0.0F, 0.0F, 0.0F, 48, 9, 32, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape7_2.render(f5);
        this.shape7.render(f5);
        this.RightWall.render(f5);
        this.shape7_1.render(f5);
        this.LeftWall.render(f5);
        this.Top.render(f5);
        this.shape7_3.render(f5);
        this.Base.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
