package net.xtrafrancyz.mods.minidot.items.pet;

import java.util.List;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.MiniDotPlayer;
import net.xtrafrancyz.mods.minidot.items.MModelRenderer;
import net.xtrafrancyz.mods.minidot.util.MNaming;

public class JPlushie extends BasePet
{
    private final MModelRenderer bone;
    private final MModelRenderer bone2;
    private final MModelRenderer bone3;
    private final MModelRenderer bone8;
    private final MModelRenderer bone14;
    private final MModelRenderer bone15;
    private final MModelRenderer bone16;
    private final MModelRenderer bone9;
    private final MModelRenderer bone13;
    private final MModelRenderer bone10;
    private final MModelRenderer bone12;
    private final MModelRenderer bone11;
    private final MModelRenderer bone17;
    private final MModelRenderer bone20;
    private final MModelRenderer bone4;
    private final MModelRenderer bone5;
    private final MModelRenderer bone6;
    private final MModelRenderer bone7;
    private final MModelRenderer bone18;
    private final MModelRenderer bone19;

    public JPlushie()
    {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.bone = new MModelRenderer(this);
        this.bone.setRotationPoint(-1.55F, 0.0F, 0.0F);
        this.setRotation(this.bone, 0.0F, 0.48F, 0.0F);
        this.bone.cubeList.add(new ModelBox(this.bone, 11, 16, -1.0F, -1.9995F, -3.0F, 2, 2, 3, 0.0F, false));
        this.bone2 = new MModelRenderer(this);
        this.bone2.setRotationPoint(0.65F, 0.0F, 0.0F);
        this.setRotation(this.bone2, 0.0F, -0.48F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(this.bone2, 11, 16, -1.0F, -1.9995F, -3.0F, 2, 2, 3, 0.0F, true));
        this.bone3 = new MModelRenderer(this);
        this.bone3.cubeList.add(new ModelBox(this.bone3, 18, 18, -2.45F, -5.0F, -0.5F, 4, 5, 3, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(this.bone3, 0, 22, -2.95F, -10.0F, -1.5F, 5, 5, 5, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(this.bone3, 0, 25, 1.55F, -11.5F, 2.9F, 2, 2, 0, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(this.bone3, 0, 25, -4.3F, -11.5F, 2.9F, 2, 2, 0, 0.0F, true));
        this.bone3.cubeList.add(new ModelBox(this.bone3, -5, 3, 1.05F, -10.0F, 0.5F, 1, 0, 1, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(this.bone3, 21, 15, -3.3F, -10.45F, -1.05F, 1, 1, 1, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(this.bone3, 21, 15, 1.395F, -10.45F, -1.05F, 1, 1, 1, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(this.bone3, 21, 15, -0.95F, -10.6F, -1.05F, 1, 1, 1, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(this.bone3, 21, 15, 0.25F, -10.5F, -1.05F, 1, 1, 1, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(this.bone3, 21, 15, -2.15F, -10.5F, -1.05F, 1, 1, 1, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(this.bone3, 23, 12, -3.4F, -9.5F, -1.55F, 1, 0, 2, -0.3F, false));
        this.bone3.cubeList.add(new ModelBox(this.bone3, 24, 12, 1.5F, -9.5F, -1.55F, 1, 0, 2, -0.3F, false));
        this.bone3.cubeList.add(new ModelBox(this.bone3, 20, 12, -1.5F, -10.5F, -1.55F, 4, 1, 2, -0.3F, false));
        this.bone3.cubeList.add(new ModelBox(this.bone3, 22, 12, -3.4F, -10.5F, -1.55F, 3, 1, 2, -0.3F, false));
        this.bone8 = new MModelRenderer(this);
        this.bone3.addChild(this.bone8);
        this.bone8.cubeList.add(new ModelBox(this.bone8, 26, 15, -1.0F, -0.75F, 2.15F, 1, 1, 2, -0.3F, false));
        this.bone14 = new MModelRenderer(this);
        this.bone3.addChild(this.bone14);
        this.bone14.cubeList.add(new ModelBox(this.bone14, 26, 15, -1.0F, -5.5749F, 6.9749F, 1, 1, 2, -0.3F, false));
        this.bone15 = new MModelRenderer(this);
        this.setRotation(this.bone15, -0.5236F, 0.0F, 0.0F);
        this.bone3.addChild(this.bone15);
        this.bone15.cubeList.add(new ModelBox(this.bone15, 26, 15, -1.0F, -9.2056F, 4.5752F, 1, 1, 2, -0.3F, false));
        this.bone15.cubeList.add(new ModelBox(this.bone15, 20, 27, -1.0F, -10.2056F, 5.5752F, 1, 2, 1, -0.3F, false));
        this.bone15.cubeList.add(new ModelBox(this.bone15, 20, 12, -1.0F, -10.2056F, 5.9752F, 1, 1, 5, -0.3F, false));
        this.bone15.cubeList.add(new ModelBox(this.bone15, 20, 26, -1.5F, -9.8056F, 5.9752F, 2, 2, 4, -0.3F, false));
        this.bone16 = new MModelRenderer(this);
        this.setRotation(this.bone16, -0.3491F, 0.0F, 0.0F);
        this.bone15.addChild(this.bone16);
        this.bone16.cubeList.add(new ModelBox(this.bone16, 26, 15, -1.0F, -13.2594F, 4.9435F, 1, 1, 2, -0.3F, false));
        this.bone9 = new MModelRenderer(this);
        this.setRotation(this.bone9, 0.5236F, 0.0F, 0.0F);
        this.bone3.addChild(this.bone9);
        this.bone9.cubeList.add(new ModelBox(this.bone9, 26, 15, -1.0F, 1.1817F, 3.0592F, 1, 1, 2, -0.3F, false));
        this.bone13 = new MModelRenderer(this);
        this.setRotation(this.bone13, 0.5236F, 0.0F, 0.0F);
        this.bone3.addChild(this.bone13);
        this.bone13.cubeList.add(new ModelBox(this.bone13, 26, 15, -1.0F, -1.2307F, 7.2377F, 1, 1, 2, -0.3F, false));
        this.bone10 = new MModelRenderer(this);
        this.setRotation(this.bone10, 1.0472F, 0.0F, 0.0F);
        this.bone3.addChild(this.bone10);
        this.bone10.cubeList.add(new ModelBox(this.bone10, 26, 15, -1.0F, 3.3092F, 2.8807F, 1, 1, 2, -0.3F, false));
        this.bone12 = new MModelRenderer(this);
        this.setRotation(this.bone12, 1.0472F, 0.0F, 0.0F);
        this.bone3.addChild(this.bone12);
        this.bone12.cubeList.add(new ModelBox(this.bone12, 26, 15, -1.0F, 2.6628F, 5.2932F, 1, 1, 2, -0.3F, false));
        this.bone11 = new MModelRenderer(this);
        this.setRotation(this.bone11, 1.5708F, 0.0F, 0.0F);
        this.bone3.addChild(this.bone11);
        this.bone11.cubeList.add(new ModelBox(this.bone11, 26, 15, -1.0F, 5.0624F, 1.6624F, 1, 1, 2, -0.3F, false));
        this.bone17 = new MModelRenderer(this);
        this.bone17.setRotationPoint(0.0F, 0.0F, -0.2F);
        this.bone3.addChild(this.bone17);
        this.bone17.cubeList.add(new ModelBox(this.bone17, 5, 5, 1.55F, -10.5F, 3.1005F, 1, 1, 1, 0.0F, false));
        this.bone17.cubeList.add(new ModelBox(this.bone17, 5, 5, 3.8F, -6.85F, 5.3505F, 1, 1, 1, 0.0F, false));
        this.bone17.cubeList.add(new ModelBox(this.bone17, 1, 6, 2.05F, -11.2F, 3.6005F, 2, 1, 2, 0.0F, false));
        this.bone17.cubeList.add(new ModelBox(this.bone17, 2, 3, 2.35F, -10.3F, 4.0505F, 2, 4, 2, 0.0F, false));
        this.bone20 = new MModelRenderer(this);
        this.bone20.setRotationPoint(-0.9F, 0.0F, -0.2F);
        this.bone3.addChild(this.bone20);
        this.bone20.cubeList.add(new ModelBox(this.bone20, 5, 5, -2.55F, -10.5F, 3.1005F, 1, 1, 1, 0.0F, true));
        this.bone20.cubeList.add(new ModelBox(this.bone20, 5, 5, -4.8F, -6.85F, 5.3505F, 1, 1, 1, 0.0F, true));
        this.bone20.cubeList.add(new ModelBox(this.bone20, 1, 6, -4.05F, -11.2F, 3.6005F, 2, 1, 2, 0.0F, true));
        this.bone20.cubeList.add(new ModelBox(this.bone20, 2, 3, -4.35F, -10.3F, 4.0505F, 2, 4, 2, 0.0F, true));
        this.bone4 = new MModelRenderer(this);
        this.bone4.setRotationPoint(-1.9F, -4.15F, 1.0F);
        this.setRotation(this.bone4, 0.0F, 0.0F, -0.7418F);
        this.bone4.cubeList.add(new ModelBox(this.bone4, 0, 11, -2.75F, -1.0F, -1.0F, 3, 2, 2, -0.3F, false));
        this.bone4.cubeList.add(new ModelBox(this.bone4, 0, 15, -4.15F, 0.05F, -1.0F, 2, 0, 2, -0.3F, false));
        this.bone5 = new MModelRenderer(this);
        this.bone5.setRotationPoint(2.25F, 3.5F, -1.5F);
        this.setRotation(this.bone5, 0.0F, -0.9163F, 0.0F);
        this.bone4.addChild(this.bone5);
        this.bone5.cubeList.add(new ModelBox(this.bone5, 2, 17, -3.4265F, -3.45F, 4.5158F, 2, 0, 0, -0.3F, false));
        this.bone6 = new MModelRenderer(this);
        this.bone6.setRotationPoint(1.05F, -4.15F, 1.0F);
        this.setRotation(this.bone6, 0.0F, 0.0F, 0.7418F);
        this.bone6.cubeList.add(new ModelBox(this.bone6, 0, 18, -0.25F, -1.0F, -1.0F, 3, 2, 2, -0.3F, true));
        this.bone6.cubeList.add(new ModelBox(this.bone6, 0, 15, 2.15F, 0.05F, -1.0F, 2, 0, 2, -0.3F, true));
        this.bone7 = new MModelRenderer(this);
        this.bone7.setRotationPoint(-2.25F, 3.5F, -1.5F);
        this.setRotation(this.bone7, 0.0F, 0.9163F, 0.0F);
        this.bone6.addChild(this.bone7);
        this.bone7.cubeList.add(new ModelBox(this.bone7, 2, 17, 1.4265F, -3.45F, 4.5158F, 2, 0, 0, -0.3F, true));
        this.bone18 = new MModelRenderer(this);
        this.bone18.setRotationPoint(0.0F, -3.0F, 2.5F);
        this.setRotation(this.bone18, 0.0F, 0.5236F, 0.0F);
        this.bone18.cubeList.add(new ModelBox(this.bone18, 11, 9, 0.0F, -1.75F, 0.0F, 0, 3, 4, 0.0F, false));
        this.bone19 = new MModelRenderer(this);
        this.bone19.setRotationPoint(-1.0F, -3.0F, 2.5F);
        this.setRotation(this.bone19, 0.0F, -0.5236F, 0.0F);
        this.bone19.cubeList.add(new ModelBox(this.bone19, 11, 9, 0.0F, -1.75F, 0.0F, 0, 3, 4, 0.0F, true));
        super.setTexture(new ResourceLocation("minidot", "pets/jplushie.png"));
    }

    public void render(ModelPlayer modelPlayer, EntityPlayer player, float time, MiniDotPlayer pi)
    {
        GlStateManager.enableCull();
        super.render(modelPlayer, player, time, pi);
        GlStateManager.disableCull();
    }

    protected void preRender(ModelPlayer modelPlayer, EntityPlayer player, float time, MiniDotPlayer pi)
    {
        float f = MathHelper.sin(time * 0.16F) * 0.04F;
        GlStateManager.translate(0.7F, -0.3F + f, 0.2F);
        float f1 = 1.1F;
        GlStateManager.scale(f1, f1, f1);
        super.preRender(modelPlayer, player, time, pi);
    }

    public void renderAsItem(float time)
    {
        GlStateManager.translate(0.0F, 0.25F, 0.0F);
        float f = 1.25F;
        GlStateManager.scale(f, f, f);
        super.renderAsItem(time);
    }

    public String getName()
    {
        return "J-Plushie";
    }

    public String getCreator()
    {
        return "Serial_Desig_N";
    }

    public List<String> getDescription()
    {
        return MNaming.fromMult("\u0414\u0440\u043e\u043d\u044b-\u0443\u0431\u0438\u0439\u0446\u044b");
    }
}
