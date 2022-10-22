package net.xtrafrancyz.mods.minidot.items.pet;

import java.util.Collections;
import java.util.List;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.MiniDotPlayer;
import net.xtrafrancyz.mods.minidot.items.MModelRenderer;
import net.xtrafrancyz.mods.minidot.items.animation.BBAnimationLoader;
import net.xtrafrancyz.mods.minidot.items.animation.IAnimation;

public class BedWars2021Bronze extends BasePet
{
    private final MModelRenderer Main;
    private final MModelRenderer Person;
    private final MModelRenderer Body;
    private final MModelRenderer Scarf;
    private final MModelRenderer bone10;
    private final MModelRenderer bone3;
    private final MModelRenderer bone11;
    private final MModelRenderer bone12;
    private final MModelRenderer bone13;
    private final MModelRenderer bone14;
    private final MModelRenderer bone15;
    private final MModelRenderer bone16;
    private final MModelRenderer Levyi;
    private final MModelRenderer Levyi2;
    private final MModelRenderer Levyi3;
    private final MModelRenderer Levyi4;
    private final MModelRenderer Levyi5;
    private final MModelRenderer Levyi6;
    private final MModelRenderer LeftHand;
    private final MModelRenderer bone4;
    private final MModelRenderer RightHand;
    private final MModelRenderer bone7;
    private final MModelRenderer LeftEar;
    private final MModelRenderer bone9;
    private final MModelRenderer RightEar;
    private final MModelRenderer bone8;
    private final MModelRenderer Sword;
    private final MModelRenderer LeftLeg;
    private final MModelRenderer bone;
    private final MModelRenderer bone2;
    private final MModelRenderer RightLeg;
    private final MModelRenderer bone5;
    private final MModelRenderer bone6;
    private final MModelRenderer Bed;
    private final MModelRenderer bone17;
    private final MModelRenderer Pedestal;
    private final IAnimation anim;

    public BedWars2021Bronze()
    {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Main = new MModelRenderer(this);
        this.Main.setRotationPoint(0.0F, 7.5F, 0.5F);
        this.Person = new MModelRenderer(this);
        this.Person.setRotationPoint(0.0F, -2.1F, -0.5F);
        this.Main.addChild(this.Person);
        this.Body = new MModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -20.0F, 0.5F);
        this.Person.addChild(this.Body);
        this.Body.cubeList.add(new ModelBox(this.Body, 0, 36, -5.0F, -5.5F, -2.5F, 10, 10, 5, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(this.Body, 30, 44, -4.0F, -4.5F, -3.2F, 8, 8, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(this.Body, 8, 51, 4.6F, -4.5F, -1.5F, 1, 8, 3, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(this.Body, 0, 51, -5.6F, -4.5F, -1.5F, 1, 8, 3, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(this.Body, 47, 41, -3.0F, -6.1F, -1.5F, 6, 1, 3, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(this.Body, 46, 25, -3.0F, 4.1F, -1.5F, 6, 1, 3, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(this.Body, 41, 15, -4.0F, -4.5F, 2.2F, 8, 8, 1, 0.0F, false));
        this.Scarf = new MModelRenderer(this);
        this.Scarf.setRotationPoint(-0.0108F, 4.2504F, -3.5095F);
        this.Body.addChild(this.Scarf);
        this.bone10 = new MModelRenderer(this);
        this.bone10.setRotationPoint(0.8007F, -4.1703F, 0.0493F);
        this.setRotation(this.bone10, 0.0F, -0.0436F, -0.0873F);
        this.Scarf.addChild(this.bone10);
        this.bone10.cubeList.add(new ModelBox(this.bone10, 50, 8, -2.8938F, -0.7792F, -1.34F, 6, 2, 2, 0.0F, false));
        this.bone3 = new MModelRenderer(this);
        this.bone3.setRotationPoint(-3.945F, -5.1966F, 0.2309F);
        this.setRotation(this.bone3, 0.0F, 0.3927F, 0.48F);
        this.Scarf.addChild(this.bone3);
        this.bone3.cubeList.add(new ModelBox(this.bone3, 16, 51, -1.9658F, -0.9044F, -0.4756F, 5, 2, 2, 0.0F, false));
        this.bone11 = new MModelRenderer(this);
        this.bone11.setRotationPoint(4.782F, -4.704F, 2.0329F);
        this.setRotation(this.bone11, 0.0F, -1.0472F, -0.2618F);
        this.Scarf.addChild(this.bone11);
        this.bone11.cubeList.add(new ModelBox(this.bone11, 50, 4, -3.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));
        this.bone12 = new MModelRenderer(this);
        this.bone12.setRotationPoint(4.1404F, -5.231F, 5.891F);
        this.setRotation(this.bone12, 0.1745F, -0.829F, -0.2182F);
        this.Scarf.addChild(this.bone12);
        this.bone12.cubeList.add(new ModelBox(this.bone12, 44, 33, -1.0F, -1.0F, -3.0F, 2, 2, 6, 0.0F, false));
        this.bone13 = new MModelRenderer(this);
        this.bone13.setRotationPoint(-1.3967F, -4.9695F, 7.402F);
        this.setRotation(this.bone13, 0.0F, 0.0F, -0.0873F);
        this.Scarf.addChild(this.bone13);
        this.bone13.cubeList.add(new ModelBox(this.bone13, 50, 0, -3.1992F, -1.0174F, -1.0F, 6, 2, 2, 0.0F, false));
        this.bone14 = new MModelRenderer(this);
        this.bone14.setRotationPoint(-4.7F, -5.6F, 4.9F);
        this.setRotation(this.bone14, -0.3927F, 0.3927F, 0.0F);
        this.Scarf.addChild(this.bone14);
        this.bone14.cubeList.add(new ModelBox(this.bone14, 36, 25, -1.0F, -1.0F, -3.0F, 2, 2, 6, 0.0F, false));
        this.bone15 = new MModelRenderer(this);
        this.bone15.setRotationPoint(-5.2F, -6.2F, 2.0F);
        this.setRotation(this.bone15, 0.2618F, -0.4363F, 0.0F);
        this.Scarf.addChild(this.bone15);
        this.bone15.cubeList.add(new ModelBox(this.bone15, 60, 37, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));
        this.bone16 = new MModelRenderer(this);
        this.bone16.setRotationPoint(1.8739F, -5.6914F, 7.9019F);
        this.setRotation(this.bone16, 0.0873F, 0.4363F, 0.0873F);
        this.Scarf.addChild(this.bone16);
        this.bone16.cubeList.add(new ModelBox(this.bone16, 24, 59, -1.0F, -1.0F, -1.0F, 2, 3, 2, 0.0F, false));
        this.Levyi = new MModelRenderer(this);
        this.Levyi.setRotationPoint(2.6F, -4.9F, 8.3F);
        this.setRotation(this.Levyi, -0.2504F, 0.7001F, 0.0943F);
        this.Scarf.addChild(this.Levyi);
        this.Levyi.cubeList.add(new ModelBox(this.Levyi, 34, 28, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));
        this.Levyi2 = new MModelRenderer(this);
        this.Levyi2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.setRotation(this.Levyi2, -0.3927F, 0.0F, 0.0F);
        this.Levyi.addChild(this.Levyi2);
        this.Levyi2.cubeList.add(new ModelBox(this.Levyi2, 33, 25, -1.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));
        this.Levyi3 = new MModelRenderer(this);
        this.Levyi3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.setRotation(this.Levyi3, 0.48F, 0.0F, 0.0F);
        this.Levyi2.addChild(this.Levyi3);
        this.Levyi3.cubeList.add(new ModelBox(this.Levyi3, 0, 15, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));
        this.Levyi4 = new MModelRenderer(this);
        this.Levyi4.setRotationPoint(1.7F, -4.9F, 8.3F);
        this.setRotation(this.Levyi4, -0.6556F, 0.218F, -0.0097F);
        this.Scarf.addChild(this.Levyi4);
        this.Levyi4.cubeList.add(new ModelBox(this.Levyi4, 0, 22, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));
        this.Levyi5 = new MModelRenderer(this);
        this.Levyi5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.setRotation(this.Levyi5, 0.1309F, 0.0F, 0.0F);
        this.Levyi4.addChild(this.Levyi5);
        this.Levyi5.cubeList.add(new ModelBox(this.Levyi5, 0, 19, -1.0F, 0.0F, 0.0F, 2, 0, 3, 0.0F, false));
        this.Levyi6 = new MModelRenderer(this);
        this.Levyi6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.setRotation(this.Levyi6, 0.2618F, 0.0F, 0.0F);
        this.Levyi5.addChild(this.Levyi6);
        this.Levyi6.cubeList.add(new ModelBox(this.Levyi6, 3, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));
        this.LeftHand = new MModelRenderer(this);
        this.LeftHand.setRotationPoint(-5.2F, -0.4F, -1.1F);
        this.setRotation(this.LeftHand, -0.6544F, -0.6706F, 0.6168F);
        this.Body.addChild(this.LeftHand);
        this.LeftHand.cubeList.add(new ModelBox(this.LeftHand, 32, 53, -4.7266F, -1.933F, -0.6057F, 6, 1, 1, 4.0E-4F, false));
        this.bone4 = new MModelRenderer(this);
        this.bone4.setRotationPoint(-3.0F, 0.9F, 0.0F);
        this.setRotation(this.bone4, 0.0F, 0.0F, 0.1745F);
        this.LeftHand.addChild(this.bone4);
        this.bone4.cubeList.add(new ModelBox(this.bone4, 48, 45, -2.1923F, -2.4902F, -0.6057F, 7, 2, 1, 0.0F, false));
        this.RightHand = new MModelRenderer(this);
        this.RightHand.setRotationPoint(4.5F, 0.8F, 0.4F);
        this.setRotation(this.RightHand, 1.8197F, -0.5953F, 0.6393F);
        this.Body.addChild(this.RightHand);
        this.RightHand.cubeList.add(new ModelBox(this.RightHand, 0, 10, -0.747F, -1.239F, -0.1523F, 5, 1, 1, 0.001F, false));
        this.bone7 = new MModelRenderer(this);
        this.bone7.setRotationPoint(3.0F, 0.9F, 0.0F);
        this.setRotation(this.bone7, 0.0F, 0.0F, -0.2182F);
        this.RightHand.addChild(this.bone7);
        this.bone7.cubeList.add(new ModelBox(this.bone7, 52, 29, -4.3137F, -1.8171F, -0.1523F, 6, 2, 1, 0.0F, false));
        this.LeftEar = new MModelRenderer(this);
        this.LeftEar.setRotationPoint(2.5F, -4.2F, 0.0F);
        this.setRotation(this.LeftEar, -0.1231F, 0.0447F, 0.3463F);
        this.Body.addChild(this.LeftEar);
        this.LeftEar.cubeList.add(new ModelBox(this.LeftEar, 44, 33, -0.8F, -4.8F, -0.5F, 2, 5, 1, 0.0F, false));
        this.bone9 = new MModelRenderer(this);
        this.bone9.setRotationPoint(-0.5175F, -1.944F, 0.0F);
        this.setRotation(this.bone9, 0.0F, 0.0F, -0.1745F);
        this.LeftEar.addChild(this.bone9);
        this.bone9.cubeList.add(new ModelBox(this.bone9, 66, 6, -0.7823F, -2.8616F, -0.5F, 1, 5, 1, 3.0E-4F, false));
        this.RightEar = new MModelRenderer(this);
        this.RightEar.setRotationPoint(-2.5F, -4.2F, 0.0F);
        this.setRotation(this.RightEar, -0.1231F, -0.0447F, -0.3463F);
        this.Body.addChild(this.RightEar);
        this.RightEar.cubeList.add(new ModelBox(this.RightEar, 32, 61, -1.2F, -4.8F, -0.5F, 2, 5, 1, 0.0F, false));
        this.bone8 = new MModelRenderer(this);
        this.bone8.setRotationPoint(0.5175F, -1.944F, 0.0F);
        this.setRotation(this.bone8, 0.0F, 0.0F, 0.1745F);
        this.RightEar.addChild(this.bone8);
        this.bone8.cubeList.add(new ModelBox(this.bone8, 70, 6, -0.2177F, -2.8616F, -0.5F, 1, 5, 1, 3.0E-4F, false));
        this.Sword = new MModelRenderer(this);
        this.Sword.setRotationPoint(-8.1F, -3.9F, -4.15F);
        this.setRotation(this.Sword, 0.3927F, 0.4363F, -0.1309F);
        this.Body.addChild(this.Sword);
        this.Sword.cubeList.add(new ModelBox(this.Sword, 25, 36, -0.4174F, -0.3854F, -1.9936F, 1, 1, 4, -0.1F, false));
        this.Sword.cubeList.add(new ModelBox(this.Sword, 0, 0, -0.4174F, 0.3146F, -0.4936F, 1, 3, 1, -0.15F, false));
        this.Sword.cubeList.add(new ModelBox(this.Sword, 48, 48, -0.4174F, -11.8854F, -1.4936F, 1, 12, 3, -0.4F, false));
        this.LeftLeg = new MModelRenderer(this);
        this.LeftLeg.setRotationPoint(2.6F, -15.8F, 1.2F);
        this.setRotation(this.LeftLeg, 0.2332F, -0.2377F, -0.3972F);
        this.Person.addChild(this.LeftLeg);
        this.bone = new MModelRenderer(this);
        this.bone.setRotationPoint(1.0845F, 1.1802F, 0.0F);
        this.setRotation(this.bone, 0.0F, 0.0F, 0.2618F);
        this.LeftLeg.addChild(this.bone);
        this.bone.cubeList.add(new ModelBox(this.bone, 37, 55, -1.2189F, -2.1714F, -0.9378F, 2, 5, 2, 0.0F, false));
        this.bone2 = new MModelRenderer(this);
        this.bone2.setRotationPoint(-1.3314F, 0.8839F, 0.0F);
        this.setRotation(this.bone2, 0.0F, 0.0F, -0.2182F);
        this.LeftLeg.addChild(this.bone2);
        this.bone2.cubeList.add(new ModelBox(this.bone2, 16, 55, -0.0928F, -2.2417F, -0.9377F, 2, 5, 2, 0.001F, false));
        this.RightLeg = new MModelRenderer(this);
        this.RightLeg.setRotationPoint(-2.3F, -16.5F, 0.0F);
        this.setRotation(this.RightLeg, -0.1075F, 0.2219F, 0.3972F);
        this.Person.addChild(this.RightLeg);
        this.bone5 = new MModelRenderer(this);
        this.bone5.setRotationPoint(-1.0845F, 1.1802F, 0.0F);
        this.setRotation(this.bone5, 0.0F, 0.0F, -0.2618F);
        this.RightLeg.addChild(this.bone5);
        this.bone5.cubeList.add(new ModelBox(this.bone5, 54, 32, -0.735F, -1.9744F, -1.0514F, 2, 5, 2, 0.0F, false));
        this.bone6 = new MModelRenderer(this);
        this.bone6.setRotationPoint(1.3314F, 0.8839F, 0.0F);
        this.setRotation(this.bone6, 0.0F, 0.0F, 0.2182F);
        this.RightLeg.addChild(this.bone6);
        this.bone6.cubeList.add(new ModelBox(this.bone6, 0, 25, -1.7754F, -2.0882F, -1.0513F, 2, 5, 2, 0.001F, false));
        this.Bed = new MModelRenderer(this);
        this.Bed.setRotationPoint(-0.5F, -11.5F, 0.5F);
        this.Main.addChild(this.Bed);
        this.Bed.cubeList.add(new ModelBox(this.Bed, 0, 62, 6.5F, -4.0F, -5.0F, 2, 3, 2, 0.0F, false));
        this.Bed.cubeList.add(new ModelBox(this.Bed, 59, 15, 6.5F, -4.0F, 2.0F, 2, 3, 2, 0.0F, false));
        this.Bed.cubeList.add(new ModelBox(this.Bed, 0, 25, -6.0F, -3.0F, -4.5F, 14, 3, 8, -5.0E-4F, false));
        this.Bed.cubeList.add(new ModelBox(this.Bed, 25, 53, 7.0F, -3.5F, -3.0F, 1, 1, 5, 0.001F, false));
        this.Bed.cubeList.add(new ModelBox(this.Bed, 0, 15, -7.5F, -1.0F, -5.0F, 16, 1, 9, 0.0F, false));
        this.Bed.cubeList.add(new ModelBox(this.Bed, 8, 62, 6.2F, 0.0F, -4.7F, 2, 1, 2, 0.0F, false));
        this.Bed.cubeList.add(new ModelBox(this.Bed, 61, 25, 6.2F, 0.0F, 1.7F, 2, 1, 2, 0.0F, false));
        this.Bed.cubeList.add(new ModelBox(this.Bed, 38, 62, -7.2F, 0.0F, -4.7F, 2, 1, 2, 0.0F, false));
        this.Bed.cubeList.add(new ModelBox(this.Bed, 16, 62, -7.2F, 0.0F, 1.7F, 2, 1, 2, 0.0F, false));
        this.Bed.cubeList.add(new ModelBox(this.Bed, 56, 48, -7.5F, -5.0F, -5.0F, 2, 4, 2, 8.0E-4F, false));
        this.Bed.cubeList.add(new ModelBox(this.Bed, 62, 62, -7.5F, -5.5F, -4.0F, 2, 1, 2, 0.0F, false));
        this.Bed.cubeList.add(new ModelBox(this.Bed, 56, 21, -7.5F, -6.0F, -2.0F, 2, 1, 3, 0.0F, false));
        this.Bed.cubeList.add(new ModelBox(this.Bed, 54, 62, -7.5F, -5.5F, 1.0F, 2, 1, 2, 0.0F, false));
        this.Bed.cubeList.add(new ModelBox(this.Bed, 56, 56, -7.5F, -5.0F, 2.0F, 2, 4, 2, 8.0E-4F, false));
        this.Bed.cubeList.add(new ModelBox(this.Bed, 0, 0, -7.0F, -5.0F, -3.0F, 1, 5, 5, 0.0F, false));
        this.bone17 = new MModelRenderer(this);
        this.bone17.setRotationPoint(-3.5F, -3.4F, -0.5F);
        this.setRotation(this.bone17, 0.0F, 0.0F, 0.2182F);
        this.Bed.addChild(this.bone17);
        this.bone17.cubeList.add(new ModelBox(this.bone17, 30, 36, -2.0F, -0.5F, -3.0F, 4, 2, 6, 0.0F, false));
        this.Pedestal = new MModelRenderer(this);
        this.Pedestal.setRotationPoint(0.0F, 2.0F, -0.5F);
        this.Main.addChild(this.Pedestal);
        this.Pedestal.cubeList.add(new ModelBox(this.Pedestal, 0, 0, -9.5F, -12.5F, -5.5F, 19, 3, 12, 0.0F, false));
        this.Pedestal.cubeList.add(new ModelBox(this.Pedestal, 66, 0, -4.0F, -13.0F, -6.0F, 8, 4, 1, 0.0F, false));
        this.Pedestal.cubeList.add(new ModelBox(this.Pedestal, 68, 15, -5.25F, -13.75F, -6.05F, 10, 5, 0, 0.0F, false));
        BBAnimationLoader bbanimationloader = new BBAnimationLoader(new ResourceLocation("minidot", "pets/BedWars2021Bronze.animation.json"));
        this.anim = bbanimationloader.mustGet("animation.tournament.scarf", this);
        this.setTexture(new ResourceLocation("minidot", "pets/BedWars2021Bronze.png"));
    }

    protected void processMotion(ModelPlayer modelPlayer, EntityPlayer player, float time)
    {
        float f = MathHelper.sin(time * 0.1F) * 0.05F;
        float f1 = time * 1.5F;
        GlStateManager.translate(0.7F, 0.0F + f, 0.5F);
        GlStateManager.rotate(90.0F + f1, 0.0F, 1.0F, 0.0F);
        float f2 = 0.8F;
        GlStateManager.scale(f2, f2, f2);
        this.anim.tick(time);
    }

    public void render(ModelPlayer modelPlayer, EntityPlayer player, float time, MiniDotPlayer pi)
    {
        GlStateManager.enableCull();
        super.render(modelPlayer, player, time, pi);
        GlStateManager.disableCull();
    }

    public void renderAsItem(float time)
    {
        GlStateManager.translate(0.0F, 0.32F, 0.0F);
        float f = 0.8F;
        GlStateManager.scale(f, f, f);
        this.anim.tick(time);
        super.renderAsItem(time);
    }

    public String getName()
    {
        return "\u0411\u0440\u043e\u043d\u0437\u043e\u0432\u0430\u044f \u043a\u0440\u043e\u0432\u0430\u0442\u043a\u0430 2021";
    }

    public List<String> getDescription()
    {
        return Collections.<String>singletonList("\u0417\u0430 \u0442\u0440\u0435\u0442\u044c\u0435 \u043c\u0435\u0441\u0442\u043e \u0432 \u0442\u0443\u0440\u043d\u0438\u0440\u0435 " + EnumChatFormatting.AQUA + "BedWars Hard [\u0417\u0438\u043c\u0430 2021]");
    }
}
