package net.xtrafrancyz.mods.minidot.items.head;

import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.MiniDotPlayer;
import net.xtrafrancyz.mods.minidot.items.BaseItem;
import net.xtrafrancyz.mods.minidot.items.ItemType;
import net.xtrafrancyz.mods.minidot.items.MModelRenderer;

public class SunglassesRound extends BaseItem
{
    private final MModelRenderer main;
    private final MModelRenderer one2;
    private final MModelRenderer glass2;
    private final MModelRenderer one;
    private final MModelRenderer glass;

    public SunglassesRound()
    {
        super(ItemType.HEAD);
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.main = new MModelRenderer(this);
        this.main.setRotationPoint(-0.3F, 22.0F, -2.0F);
        this.main.setTextureOffset(3, 20).addBox(0.6F, -5.0F, -4.9F, 1, 1, 1, -0.3001F);
        this.main.setTextureOffset(14, 19).addBox(-1.2F, -5.0F, -4.9F, 1, 1, 1, -0.3001F);
        this.main.setTextureOffset(5, 11).addBox(-0.8F, -5.4F, -4.9F, 2, 1, 1, -0.3001F);
        this.main.setTextureOffset(10, 2).addBox(5.1F, -5.0F, -4.9F, 2, 1, 1, -0.2501F);
        this.main.setTextureOffset(4, 7).addBox(6.3F, -5.0F, -4.5F, 1, 1, 2, -0.2501F);
        this.main.setTextureOffset(0, 6).addBox(6.1F, -4.8F, -3.1F, 1, 1, 2, -0.2501F);
        this.main.setTextureOffset(4, 4).addBox(6.0F, -4.5F, -1.7F, 1, 1, 2, -0.2501F);
        this.main.setTextureOffset(0, 0).addBox(-6.3F, -4.5F, -1.7F, 1, 1, 2, -0.2501F);
        this.main.setTextureOffset(0, 10).addBox(-6.5F, -5.0F, -4.9F, 2, 1, 1, -0.2501F);
        this.main.setTextureOffset(4, 1).addBox(-6.7F, -5.0F, -4.5F, 1, 1, 2, -0.2501F);
        this.main.setTextureOffset(0, 3).addBox(-6.5F, -4.8F, -3.1F, 1, 1, 2, -0.2501F);
        this.one2 = new MModelRenderer(this);
        this.one2.setRotationPoint(-0.9F, 0.0F, -0.5F);
        this.main.addChild(this.one2);
        this.one2.setTextureOffset(0, 12).addBox(-4.4F, -5.55F, -4.5F, 1, 2, 1, -0.2F);
        this.one2.setTextureOffset(11, 11).addBox(-0.8F, -5.55F, -4.5F, 1, 2, 1, -0.2F);
        this.one2.setTextureOffset(8, 4).addBox(-3.1F, -6.75F, -4.5F, 2, 1, 1, -0.2F);
        this.one2.setTextureOffset(8, 0).addBox(-3.1F, -3.35F, -4.5F, 2, 1, 1, -0.2F);
        this.one2.setTextureOffset(17, 5).addBox(-3.8F, -3.85F, -4.5F, 1, 1, 1, -0.2F);
        this.one2.setTextureOffset(0, 17).addBox(-3.8F, -6.35F, -4.5F, 1, 1, 1, -0.2F);
        this.one2.setTextureOffset(11, 16).addBox(-4.2F, -6.15F, -4.5F, 1, 1, 1, -0.2003F);
        this.one2.setTextureOffset(7, 16).addBox(-3.5F, -6.65F, -4.5F, 1, 1, 1, -0.2003F);
        this.one2.setTextureOffset(3, 16).addBox(-1.1F, -6.15F, -4.5F, 1, 1, 1, -0.2003F);
        this.one2.setTextureOffset(15, 15).addBox(-1.7F, -6.65F, -4.5F, 1, 1, 1, -0.2003F);
        this.one2.setTextureOffset(15, 12).addBox(-1.0F, -4.15F, -4.5F, 1, 1, 1, -0.2003F);
        this.one2.setTextureOffset(15, 1).addBox(-3.5F, -3.55F, -4.5F, 1, 1, 1, -0.2003F);
        this.one2.setTextureOffset(0, 15).addBox(-4.2F, -4.15F, -4.5F, 1, 1, 1, -0.2003F);
        this.one2.setTextureOffset(12, 14).addBox(-1.7F, -3.55F, -4.5F, 1, 1, 1, -0.2003F);
        this.one2.setTextureOffset(14, 10).addBox(-1.4F, -3.85F, -4.5F, 1, 1, 1, -0.2F);
        this.one2.setTextureOffset(14, 7).addBox(-1.4F, -6.35F, -4.5F, 1, 1, 1, -0.2F);
        this.glass2 = new MModelRenderer(this);
        this.glass2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.one2.addChild(this.glass2);
        this.glass2.setTextureOffset(14, 4).addBox(-2.6F, -5.15F, -4.1F, 2, 2, 0, 0.0F);
        this.glass2.setTextureOffset(0, 0).addBox(-3.6F, -5.15F, -4.1F, 1, 2, 0, 0.0F);
        this.glass2.setTextureOffset(10, 6).addBox(-3.6F, -6.15F, -4.1F, 3, 1, 0, 0.0F);
        this.one = new MModelRenderer(this);
        this.one.setRotationPoint(5.5F, 0.0F, -0.5F);
        this.main.addChild(this.one);
        this.one.setTextureOffset(8, 13).addBox(-4.4F, -5.55F, -4.5F, 1, 2, 1, -0.2F);
        this.one.setTextureOffset(4, 13).addBox(-0.8F, -5.55F, -4.5F, 1, 2, 1, -0.2F);
        this.one.setTextureOffset(9, 9).addBox(-3.1F, -6.75F, -4.5F, 2, 1, 1, -0.2F);
        this.one.setTextureOffset(8, 7).addBox(-3.1F, -3.35F, -4.5F, 2, 1, 1, -0.2F);
        this.one.setTextureOffset(0, 19).addBox(-3.8F, -3.85F, -4.5F, 1, 1, 1, -0.2F);
        this.one.setTextureOffset(19, 12).addBox(-3.8F, -6.35F, -4.5F, 1, 1, 1, -0.2F);
        this.one.setTextureOffset(11, 18).addBox(-4.2F, -6.15F, -4.5F, 1, 1, 1, -0.2003F);
        this.one.setTextureOffset(18, 10).addBox(-3.5F, -6.65F, -4.5F, 1, 1, 1, -0.2003F);
        this.one.setTextureOffset(3, 18).addBox(-1.1F, -6.15F, -4.5F, 1, 1, 1, -0.2003F);
        this.one.setTextureOffset(7, 18).addBox(-1.7F, -6.65F, -4.5F, 1, 1, 1, -0.2003F);
        this.one.setTextureOffset(17, 8).addBox(-1.0F, -4.15F, -4.5F, 1, 1, 1, -0.2003F);
        this.one.setTextureOffset(14, 17).addBox(-3.5F, -3.55F, -4.5F, 1, 1, 1, -0.2003F);
        this.one.setTextureOffset(18, 0).addBox(-4.2F, -4.15F, -4.5F, 1, 1, 1, -0.2003F);
        this.one.setTextureOffset(18, 2).addBox(-1.7F, -3.55F, -4.5F, 1, 1, 1, -0.2003F);
        this.one.setTextureOffset(18, 16).addBox(-1.4F, -3.85F, -4.5F, 1, 1, 1, -0.2F);
        this.one.setTextureOffset(17, 18).addBox(-1.4F, -6.35F, -4.5F, 1, 1, 1, -0.2F);
        this.glass = new MModelRenderer(this);
        this.glass.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.one.addChild(this.glass);
        this.glass.setTextureOffset(18, 14).addBox(-2.6F, -5.15F, -4.1F, 2, 2, 0, 0.0F);
        this.glass.setTextureOffset(0, 3).addBox(-3.6F, -5.15F, -4.1F, 1, 2, 0, 0.0F);
        this.glass.setTextureOffset(13, 0).addBox(-3.6F, -6.15F, -4.1F, 3, 1, 0, 0.0F);
        this.setTexture(new ResourceLocation("minidot", "head/sunglasses_round.png"));
    }

    protected void preRender(ModelPlayer modelPlayer, EntityPlayer player, float time, MiniDotPlayer pi)
    {
        super.preRender(modelPlayer, player, time, pi);
        GlStateManager.scale(0.7F, 0.7F, 0.8F);
        GlStateManager.translate(0.0F, -1.4F, 0.05F);
    }

    public void itemMotion(float rotation, int number)
    {
        GlStateManager.rotate(180.0F + MathHelper.sin(rotation * 0.04F + (float)number) * 30.0F, 0.0F, 0.2F, 0.0F);
        GlStateManager.translate(0.0F, -1.5F, 0.2F);
    }

    public void render(ModelPlayer modelPlayer, EntityPlayer player, float time, MiniDotPlayer pi)
    {
        GlStateManager.enableCull();
        super.render(modelPlayer, player, time, pi);
        GlStateManager.disableCull();
    }

    public String getName()
    {
        return "\u041a\u0440\u0443\u0433\u043b\u044b\u0435 \u043e\u0447\u043a\u0438";
    }
}
