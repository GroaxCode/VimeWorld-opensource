package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.MiniDotPlayer;
import net.xtrafrancyz.mods.minidot.items.MModelRenderer;
import net.xtrafrancyz.mods.minidot.items.animation.BBAnimationLoader;
import net.xtrafrancyz.mods.minidot.items.animation.IAnimation;

public class SkeletonDragon extends BasePet
{
    private final MModelRenderer Dragon_skeleton;
    private final MModelRenderer bone;
    private final MModelRenderer bone2;
    private final MModelRenderer tail;
    private final MModelRenderer bone4;
    private final MModelRenderer bone3;
    private final MModelRenderer bone11;
    private final MModelRenderer paws;
    private final MModelRenderer paw1;
    private final MModelRenderer bone5;
    private final MModelRenderer bone6;
    private final MModelRenderer bone7;
    private final MModelRenderer paw2;
    private final MModelRenderer bone8;
    private final MModelRenderer bone9;
    private final MModelRenderer bone10;
    private final MModelRenderer skull;
    private final MModelRenderer bone13;
    private final MModelRenderer bone20;
    private final MModelRenderer bone21;
    private final MModelRenderer bone18;
    private final MModelRenderer bone23;
    private final MModelRenderer bone19;
    private final MModelRenderer bone22;
    private final MModelRenderer bone17;
    private final MModelRenderer bone14;
    private final MModelRenderer sd;
    private final MModelRenderer bone15;
    private final MModelRenderer bone16;
    private final MModelRenderer bone12;
    private final MModelRenderer horns;
    private final MModelRenderer horn2;
    private final MModelRenderer bone27;
    private final MModelRenderer bone28;
    private final MModelRenderer bone29;
    private final MModelRenderer horn3;
    private final MModelRenderer bone24;
    private final MModelRenderer bone25;
    private final MModelRenderer bone26;
    private final MModelRenderer vein;
    private final MModelRenderer bone31;
    private final MModelRenderer bone32;
    private final MModelRenderer bone33;
    private final MModelRenderer wings;
    private final MModelRenderer ONE;
    private final MModelRenderer bone40;
    private final MModelRenderer bone42;
    private final MModelRenderer bone41;
    private final MModelRenderer bone37;
    private final MModelRenderer bone38;
    private final MModelRenderer bone39;
    private final MModelRenderer bone35;
    private final MModelRenderer bone36;
    private final MModelRenderer bone30;
    private final MModelRenderer bone34;
    private final MModelRenderer TWO;
    private final MModelRenderer bone43;
    private final MModelRenderer bone44;
    private final MModelRenderer bone45;
    private final MModelRenderer bone46;
    private final MModelRenderer bone47;
    private final MModelRenderer bone48;
    private final MModelRenderer bone49;
    private final MModelRenderer bone50;
    private final MModelRenderer bone51;
    private final MModelRenderer bone52;
    private final IAnimation animation;

    public SkeletonDragon()
    {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Dragon_skeleton = new MModelRenderer(this);
        this.Dragon_skeleton.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.bone = new MModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -5.0F, 1.0F);
        this.Dragon_skeleton.addChild(this.bone);
        this.setRotation(this.bone, 0.4363F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(this.bone, 0, 11, -2.5F, -6.0F, -2.5F, 5, 4, 5, 0.0F));
        this.bone2 = new MModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 0.75F);
        this.bone.addChild(this.bone2);
        this.setRotation(this.bone2, 0.3054F, 0.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(this.bone2, 0, 20, -2.0F, -3.0F, -2.0F, 4, 3, 4, 0.0F));
        this.tail = new MModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -5.0F, 1.25F);
        this.Dragon_skeleton.addChild(this.tail);
        this.setRotation(this.tail, -0.2182F, 0.0F, 0.0F);
        this.bone4 = new MModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 4.3381F, -1.0868F);
        this.tail.addChild(this.bone4);
        this.bone4.cubeList.add(new ModelBox(this.bone4, 38, 18, -0.5F, -5.0F, 1.0F, 1, 1, 2, 0.0F));
        this.bone3 = new MModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 4.3381F, 3.9132F);
        this.tail.addChild(this.bone3);
        this.setRotation(this.bone3, 0.48F, 0.0F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(this.bone3, 36, 30, -0.5F, -5.4715F, 0.073F, 1, 1, 3, 0.0F));
        this.bone11 = new MModelRenderer(this);
        this.bone11.setRotationPoint(0.0F, 4.3381F, -1.0868F);
        this.tail.addChild(this.bone11);
        this.bone11.cubeList.add(new ModelBox(this.bone11, 12, 18, 0.0F, -7.25F, 5.0F, 0, 3, 3, 0.0F));
        this.paws = new MModelRenderer(this);
        this.paws.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.Dragon_skeleton.addChild(this.paws);
        this.setRotation(this.paws, -0.3927F, 0.0F, 0.0F);
        this.paw1 = new MModelRenderer(this);
        this.paw1.setRotationPoint(2.6F, -2.0F, -1.5F);
        this.paws.addChild(this.paw1);
        this.paw1.cubeList.add(new ModelBox(this.paw1, 33, 39, -0.6F, 0.0F, -0.5F, 2, 2, 1, 0.0F));
        this.bone5 = new MModelRenderer(this);
        this.bone5.setRotationPoint(1.4F, 0.0F, -0.5F);
        this.paw1.addChild(this.bone5);
        this.setRotation(this.bone5, -0.48F, 0.0F, 0.0F);
        this.bone5.cubeList.add(new ModelBox(this.bone5, 14, 33, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F));
        this.bone6 = new MModelRenderer(this);
        this.bone6.setRotationPoint(1.65F, 2.0F, -0.5F);
        this.paw1.addChild(this.bone6);
        this.setRotation(this.bone6, -0.9599F, 0.0F, 0.0F);
        this.bone6.cubeList.add(new ModelBox(this.bone6, 6, 33, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F));
        this.bone7 = new MModelRenderer(this);
        this.bone7.setRotationPoint(0.15F, 2.0F, -0.5F);
        this.paw1.addChild(this.bone7);
        this.setRotation(this.bone7, -0.9599F, 0.0F, 0.0F);
        this.bone7.cubeList.add(new ModelBox(this.bone7, 0, 29, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F));
        this.paw2 = new MModelRenderer(this);
        this.paw2.setRotationPoint(-2.5F, -2.0F, -1.5F);
        this.paws.addChild(this.paw2);
        this.paw2.cubeList.add(new ModelBox(this.paw2, 20, 39, -1.5F, 0.0F, -0.5F, 2, 2, 1, 0.0F));
        this.bone8 = new MModelRenderer(this);
        this.bone8.setRotationPoint(-1.5F, 0.0F, -0.5F);
        this.paw2.addChild(this.bone8);
        this.setRotation(this.bone8, -0.48F, 0.0F, 0.0F);
        this.bone8.cubeList.add(new ModelBox(this.bone8, 28, 23, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F));
        this.bone9 = new MModelRenderer(this);
        this.bone9.setRotationPoint(-1.75F, 2.0F, -0.5F);
        this.paw2.addChild(this.bone9);
        this.setRotation(this.bone9, -0.9599F, 0.0F, 0.0F);
        this.bone9.cubeList.add(new ModelBox(this.bone9, 0, 27, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F));
        this.bone10 = new MModelRenderer(this);
        this.bone10.setRotationPoint(-0.25F, 2.0F, -0.5F);
        this.paw2.addChild(this.bone10);
        this.setRotation(this.bone10, -0.9599F, 0.0F, 0.0F);
        this.bone10.cubeList.add(new ModelBox(this.bone10, 22, 23, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F));
        this.skull = new MModelRenderer(this);
        this.skull.setRotationPoint(0.0F, -11.0F, -2.0F);
        this.Dragon_skeleton.addChild(this.skull);
        this.skull.cubeList.add(new ModelBox(this.skull, 0, 0, -4.0F, -3.0F, -2.5F, 8, 1, 5, 0.0F));
        this.skull.cubeList.add(new ModelBox(this.skull, 0, 6, -4.0F, -5.8434F, -2.0373F, 8, 1, 4, 0.0F));
        this.skull.cubeList.add(new ModelBox(this.skull, 15, 11, -4.0F, -5.0F, 1.5F, 8, 2, 1, 0.0F));
        this.skull.cubeList.add(new ModelBox(this.skull, 22, 23, 2.0F, -5.0F, -2.5F, 1, 2, 4, 0.0F));
        this.skull.cubeList.add(new ModelBox(this.skull, 16, 21, -3.0F, -5.0F, -2.5F, 1, 2, 4, 0.0F));
        this.bone13 = new MModelRenderer(this);
        this.bone13.setRotationPoint(-1.0F, 11.0F, -2.5F);
        this.skull.addChild(this.bone13);
        this.bone20 = new MModelRenderer(this);
        this.bone20.setRotationPoint(3.5F, -3.0F, -2.5F);
        this.skull.addChild(this.bone20);
        this.setRotation(this.bone20, -0.48F, 0.0F, 0.0F);
        this.bone20.cubeList.add(new ModelBox(this.bone20, 14, 38, -0.5F, -0.6904F, -0.5755F, 1, 1, 2, 0.0F));
        this.bone21 = new MModelRenderer(this);
        this.bone21.setRotationPoint(-3.5F, -3.0F, -2.5F);
        this.skull.addChild(this.bone21);
        this.setRotation(this.bone21, -0.48F, 0.0F, 0.0F);
        this.bone21.cubeList.add(new ModelBox(this.bone21, 16, 27, -0.5F, -0.6904F, -0.5755F, 1, 1, 2, 0.0F));
        this.bone18 = new MModelRenderer(this);
        this.bone18.setRotationPoint(4.0F, -3.0F, 1.5F);
        this.skull.addChild(this.bone18);
        this.setRotation(this.bone18, 0.48F, 0.0F, 0.0F);
        this.bone18.cubeList.add(new ModelBox(this.bone18, 26, 36, -1.0F, -1.0F, -2.0F, 1, 1, 3, 0.0F));
        this.bone23 = new MModelRenderer(this);
        this.bone23.setRotationPoint(-4.0F, -3.0F, 1.5F);
        this.skull.addChild(this.bone23);
        this.setRotation(this.bone23, 0.48F, 0.0F, 0.0F);
        this.bone23.cubeList.add(new ModelBox(this.bone23, 21, 35, 0.0F, -1.0F, -2.0F, 1, 1, 3, 0.0F));
        this.bone19 = new MModelRenderer(this);
        this.bone19.setRotationPoint(4.0F, -4.85F, -2.5F);
        this.skull.addChild(this.bone19);
        this.setRotation(this.bone19, 0.8727F, 0.0F, 0.0F);
        this.bone19.cubeList.add(new ModelBox(this.bone19, 30, 11, -2.0F, -0.2841F, -1.9416F, 2, 1, 3, 0.0F));
        this.bone22 = new MModelRenderer(this);
        this.bone22.setRotationPoint(-4.0F, -4.85F, -2.5F);
        this.skull.addChild(this.bone22);
        this.setRotation(this.bone22, 0.8727F, 0.0F, 0.0F);
        this.bone22.cubeList.add(new ModelBox(this.bone22, 20, 29, 0.0F, -0.2841F, -1.9416F, 2, 1, 3, 0.0F));
        this.bone17 = new MModelRenderer(this);
        this.bone17.setRotationPoint(0.0F, -5.8434F, -2.0373F);
        this.skull.addChild(this.bone17);
        this.setRotation(this.bone17, ((float)Math.PI * 2F / 9F), 0.0F, 0.0F);
        this.bone17.cubeList.add(new ModelBox(this.bone17, 24, 8, -2.0F, 0.0F, -2.0F, 4, 1, 2, 0.0F));
        this.bone14 = new MModelRenderer(this);
        this.bone14.setRotationPoint(0.0F, -5.0F, 1.5F);
        this.skull.addChild(this.bone14);
        this.setRotation(this.bone14, 0.5672F, 0.0F, 0.0F);
        this.bone14.cubeList.add(new ModelBox(this.bone14, 20, 6, -4.0F, -0.4627F, -0.1566F, 8, 1, 1, 0.0F));
        this.sd = new MModelRenderer(this);
        this.sd.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.skull.addChild(this.sd);
        this.setRotation(this.sd, 0.2182F, 0.0F, 0.0F);
        this.sd.cubeList.add(new ModelBox(this.sd, 21, 0, -1.0746F, -2.6868F, -4.8959F, 3, 1, 4, 0.0F));
        this.sd.cubeList.add(new ModelBox(this.sd, 28, 26, -1.9254F, -2.6868F, -4.8959F, 1, 1, 4, 0.0F));
        this.sd.cubeList.add(new ModelBox(this.sd, 28, 21, -0.5F, -1.6868F, -4.6459F, 1, 1, 4, 0.0F));
        this.sd.cubeList.add(new ModelBox(this.sd, 15, 15, -3.0F, -1.0F, -4.8959F, 6, 1, 5, 0.0F));
        this.bone15 = new MModelRenderer(this);
        this.bone15.setRotationPoint(1.0F, 0.1566F, -1.5373F);
        this.sd.addChild(this.bone15);
        this.setRotation(this.bone15, 0.0F, 0.0F, -0.5672F);
        this.bone15.cubeList.add(new ModelBox(this.bone15, 10, 27, 1.3082F, -1.9009F, -2.8586F, 1, 2, 4, 0.0F));
        this.bone16 = new MModelRenderer(this);
        this.bone16.setRotationPoint(-1.0F, 0.1566F, -1.5373F);
        this.sd.addChild(this.bone16);
        this.setRotation(this.bone16, 0.0F, 0.0F, 0.5672F);
        this.bone16.cubeList.add(new ModelBox(this.bone16, 0, 27, -2.3082F, -1.9009F, -2.8586F, 1, 2, 4, 0.0F));
        this.bone12 = new MModelRenderer(this);
        this.bone12.setRotationPoint(-2.0F, 13.0F, 1.75F);
        this.sd.addChild(this.bone12);
        this.setRotation(this.bone12, 0.1745F, 0.0F, 0.0F);
        this.bone12.cubeList.add(new ModelBox(this.bone12, 0, 22, 3.0F, -13.8263F, -3.5489F, 1, 1, 1, 0.0F));
        this.bone12.cubeList.add(new ModelBox(this.bone12, 21, 2, 0.0F, -13.8263F, -3.5489F, 1, 1, 1, 0.0F));
        this.horns = new MModelRenderer(this);
        this.horns.setRotationPoint(0.0F, 10.0F, 2.0F);
        this.skull.addChild(this.horns);
        this.horn2 = new MModelRenderer(this);
        this.horn2.setRotationPoint(2.0F, -16.25F, -2.0F);
        this.horns.addChild(this.horn2);
        this.setRotation(this.horn2, -0.0436F, -0.1309F, 0.2618F);
        this.horn2.cubeList.add(new ModelBox(this.horn2, 34, 34, -1.0F, -2.25F, -1.0F, 2, 3, 2, 0.0F));
        this.bone27 = new MModelRenderer(this);
        this.bone27.setRotationPoint(0.0F, -1.85F, 0.0F);
        this.horn2.addChild(this.bone27);
        this.setRotation(this.bone27, -0.4363F, 0.0F, 0.0F);
        this.bone27.cubeList.add(new ModelBox(this.bone27, 34, 26, -1.0F, -1.8F, -1.0F, 2, 2, 2, -0.2F));
        this.bone28 = new MModelRenderer(this);
        this.bone28.setRotationPoint(0.0F, -2.85F, 0.4F);
        this.horn2.addChild(this.bone28);
        this.setRotation(this.bone28, -0.9599F, 0.0F, 0.0F);
        this.bone28.cubeList.add(new ModelBox(this.bone28, 16, 33, -1.0F, -2.8F, -1.0F, 2, 3, 2, -0.4F));
        this.bone29 = new MModelRenderer(this);
        this.bone29.setRotationPoint(0.0F, -3.6F, 0.9F);
        this.horn2.addChild(this.bone29);
        this.setRotation(this.bone29, -1.5272F, 0.0F, 0.0F);
        this.bone29.cubeList.add(new ModelBox(this.bone29, 8, 33, -1.0304F, -3.5605F, -1.483F, 2, 3, 2, -0.6F));
        this.horn3 = new MModelRenderer(this);
        this.horn3.setRotationPoint(-2.0F, -16.25F, -2.0F);
        this.horns.addChild(this.horn3);
        this.setRotation(this.horn3, -0.0436F, 0.1309F, -0.2618F);
        this.horn3.cubeList.add(new ModelBox(this.horn3, 0, 33, -1.0F, -2.25F, -1.0F, 2, 3, 2, 0.0F));
        this.bone24 = new MModelRenderer(this);
        this.bone24.setRotationPoint(0.0F, -1.85F, 0.0F);
        this.horn3.addChild(this.bone24);
        this.setRotation(this.bone24, -0.4363F, 0.0F, 0.0F);
        this.bone24.cubeList.add(new ModelBox(this.bone24, 6, 27, -1.0F, -1.8F, -1.0F, 2, 2, 2, -0.2F));
        this.bone25 = new MModelRenderer(this);
        this.bone25.setRotationPoint(0.0F, -2.85F, 0.4F);
        this.horn3.addChild(this.bone25);
        this.setRotation(this.bone25, -0.9599F, 0.0F, 0.0F);
        this.bone25.cubeList.add(new ModelBox(this.bone25, 32, 15, -1.0F, -2.8F, -1.0F, 2, 3, 2, -0.4F));
        this.bone26 = new MModelRenderer(this);
        this.bone26.setRotationPoint(0.0F, -3.6F, 0.9F);
        this.horn3.addChild(this.bone26);
        this.setRotation(this.bone26, -1.5272F, 0.0F, 0.0F);
        this.bone26.cubeList.add(new ModelBox(this.bone26, 28, 31, -0.9696F, -3.5605F, -1.483F, 2, 3, 2, -0.6F));
        this.vein = new MModelRenderer(this);
        this.vein.setRotationPoint(0.0F, -5.0F, 4.0F);
        this.Dragon_skeleton.addChild(this.vein);
        this.bone31 = new MModelRenderer(this);
        this.bone31.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.vein.addChild(this.bone31);
        this.setRotation(this.bone31, -0.3054F, 0.0F, 0.0F);
        this.bone31.cubeList.add(new ModelBox(this.bone31, 0, 11, -0.5F, -2.5F, -0.5F, 1, 3, 1, -0.2F));
        this.bone32 = new MModelRenderer(this);
        this.bone32.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.vein.addChild(this.bone32);
        this.setRotation(this.bone32, 0.4363F, 0.0F, 0.0F);
        this.bone32.cubeList.add(new ModelBox(this.bone32, 0, 6, -0.5F, -2.4804F, 0.1298F, 1, 3, 1, -0.2F));
        this.bone33 = new MModelRenderer(this);
        this.bone33.setRotationPoint(0.0F, -4.5F, -1.0F);
        this.vein.addChild(this.bone33);
        this.setRotation(this.bone33, 1.2654F, 0.0F, 0.0F);
        this.bone33.cubeList.add(new ModelBox(this.bone33, 0, 0, -0.5F, -3.1F, -0.0972F, 1, 4, 1, -0.2F));
        this.wings = new MModelRenderer(this);
        this.wings.setRotationPoint(0.0F, 2.0F, -1.0F);
        this.Dragon_skeleton.addChild(this.wings);
        this.ONE = new MModelRenderer(this);
        this.ONE.setRotationPoint(3.0F, -13.5F, 4.5F);
        this.wings.addChild(this.ONE);
        this.setRotation(this.ONE, 0.0F, -0.3927F, -0.1745F);
        this.ONE.cubeList.add(new ModelBox(this.ONE, 38, 15, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F));
        this.bone40 = new MModelRenderer(this);
        this.bone40.setRotationPoint(-4.5F, 12.15F, -4.5F);
        this.ONE.addChild(this.bone40);
        this.setRotation(this.bone40, 0.0F, 0.0F, 0.1309F);
        this.bone40.cubeList.add(new ModelBox(this.bone40, 21, 14, 5.9F, -13.6F, 4.5F, 3, 1, 0, 0.0F));
        this.bone40.cubeList.add(new ModelBox(this.bone40, 3, 11, 7.15F, -14.6F, 4.5F, 1, 1, 0, 0.0F));
        this.bone42 = new MModelRenderer(this);
        this.bone42.setRotationPoint(11.1F, -1.65F, 0.0F);
        this.ONE.addChild(this.bone42);
        this.setRotation(this.bone42, 0.0F, 0.0F, -1.0036F);
        this.bone42.cubeList.add(new ModelBox(this.bone42, 21, 0, -1.3073F, -1.9408F, 0.0F, 2, 2, 0, 0.0F));
        this.bone41 = new MModelRenderer(this);
        this.bone41.setRotationPoint(7.95F, -1.1F, -4.5F);
        this.ONE.addChild(this.bone41);
        this.setRotation(this.bone41, 0.0F, 0.0F, -0.3491F);
        this.bone41.cubeList.add(new ModelBox(this.bone41, 0, 38, -2.3176F, -1.506F, 4.5F, 4, 3, 0, 0.0F));
        this.bone37 = new MModelRenderer(this);
        this.bone37.setRotationPoint(5.5F, -2.0F, 0.0F);
        this.ONE.addChild(this.bone37);
        this.setRotation(this.bone37, 0.0F, 0.0F, 0.7418F);
        this.bone37.cubeList.add(new ModelBox(this.bone37, 40, 1, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F));
        this.bone38 = new MModelRenderer(this);
        this.bone38.setRotationPoint(11.0F, 0.0F, 0.0F);
        this.ONE.addChild(this.bone38);
        this.setRotation(this.bone38, 0.0F, 0.0F, 0.7418F);
        this.bone38.cubeList.add(new ModelBox(this.bone38, 34, 8, -4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F));
        this.bone39 = new MModelRenderer(this);
        this.bone39.setRotationPoint(6.5F, 2.0F, 0.0F);
        this.ONE.addChild(this.bone39);
        this.setRotation(this.bone39, 0.0F, 0.0F, 1.1781F);
        this.bone39.cubeList.add(new ModelBox(this.bone39, 34, 4, -4.25F, -0.75F, -0.5F, 4, 1, 1, 0.0F));
        this.bone35 = new MModelRenderer(this);
        this.bone35.setRotationPoint(5.0601F, -2.2119F, 0.0F);
        this.ONE.addChild(this.bone35);
        this.setRotation(this.bone35, 0.0F, 0.0F, -0.1745F);
        this.bone35.cubeList.add(new ModelBox(this.bone35, 34, 21, 0.0868F, -0.4924F, -0.5F, 4, 1, 1, 0.0F));
        this.bone36 = new MModelRenderer(this);
        this.bone36.setRotationPoint(12.6899F, -2.2119F, 0.0F);
        this.ONE.addChild(this.bone36);
        this.setRotation(this.bone36, 0.0F, 0.0F, 0.1745F);
        this.bone36.cubeList.add(new ModelBox(this.bone36, 8, 38, -3.842F, -0.5356F, -0.5F, 3, 1, 1, 0.0F));
        this.bone30 = new MModelRenderer(this);
        this.bone30.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.ONE.addChild(this.bone30);
        this.setRotation(this.bone30, 0.0F, 0.0F, -0.5236F);
        this.bone30.cubeList.add(new ModelBox(this.bone30, 40, 13, 0.616F, -0.067F, -0.5F, 2, 1, 1, 0.0F));
        this.bone34 = new MModelRenderer(this);
        this.bone34.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.ONE.addChild(this.bone34);
        this.setRotation(this.bone34, 0.0F, 0.0F, -0.9599F);
        this.bone34.cubeList.add(new ModelBox(this.bone34, 7, 40, 1.403F, 0.132F, -0.5F, 2, 1, 1, 0.0F));
        this.TWO = new MModelRenderer(this);
        this.TWO.setRotationPoint(-3.0F, -13.5F, 4.5F);
        this.wings.addChild(this.TWO);
        this.setRotation(this.TWO, 0.0F, 0.3927F, 0.1745F);
        this.TWO.cubeList.add(new ModelBox(this.TWO, 38, 6, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F));
        this.bone43 = new MModelRenderer(this);
        this.bone43.setRotationPoint(4.5F, 12.15F, -4.5F);
        this.TWO.addChild(this.bone43);
        this.setRotation(this.bone43, 0.0F, 0.0F, -0.1309F);
        this.bone43.cubeList.add(new ModelBox(this.bone43, 15, 14, -8.9F, -13.6F, 4.5F, 3, 1, 0, 0.0F));
        this.bone43.cubeList.add(new ModelBox(this.bone43, 3, 0, -8.15F, -14.6F, 4.5F, 1, 1, 0, 0.0F));
        this.bone44 = new MModelRenderer(this);
        this.bone44.setRotationPoint(-11.1F, -1.65F, 0.0F);
        this.TWO.addChild(this.bone44);
        this.setRotation(this.bone44, 0.0F, 0.0F, 1.0036F);
        this.bone44.cubeList.add(new ModelBox(this.bone44, 0, 20, -0.6927F, -1.9408F, 0.0F, 2, 2, 0, 0.0F));
        this.bone45 = new MModelRenderer(this);
        this.bone45.setRotationPoint(-7.95F, -1.1F, -4.5F);
        this.TWO.addChild(this.bone45);
        this.setRotation(this.bone45, 0.0F, 0.0F, 0.3491F);
        this.bone45.cubeList.add(new ModelBox(this.bone45, 37, 10, -1.6824F, -1.506F, 4.5F, 4, 3, 0, 0.0F));
        this.bone46 = new MModelRenderer(this);
        this.bone46.setRotationPoint(-5.5F, -2.0F, 0.0F);
        this.TWO.addChild(this.bone46);
        this.setRotation(this.bone46, 0.0F, 0.0F, -0.7418F);
        this.bone46.cubeList.add(new ModelBox(this.bone46, 39, 39, 0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F));
        this.bone47 = new MModelRenderer(this);
        this.bone47.setRotationPoint(-11.0F, 0.0F, 0.0F);
        this.TWO.addChild(this.bone47);
        this.setRotation(this.bone47, 0.0F, 0.0F, -0.7418F);
        this.bone47.cubeList.add(new ModelBox(this.bone47, 31, 2, 0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F));
        this.bone48 = new MModelRenderer(this);
        this.bone48.setRotationPoint(-6.5F, 2.0F, 0.0F);
        this.TWO.addChild(this.bone48);
        this.setRotation(this.bone48, 0.0F, 0.0F, -1.1781F);
        this.bone48.cubeList.add(new ModelBox(this.bone48, 31, 0, 0.25F, -0.75F, -0.5F, 4, 1, 1, 0.0F));
        this.bone49 = new MModelRenderer(this);
        this.bone49.setRotationPoint(-5.0601F, -2.2119F, 0.0F);
        this.TWO.addChild(this.bone49);
        this.setRotation(this.bone49, 0.0F, 0.0F, 0.1745F);
        this.bone49.cubeList.add(new ModelBox(this.bone49, 22, 21, -4.0868F, -0.4924F, -0.5F, 4, 1, 1, 0.0F));
        this.bone50 = new MModelRenderer(this);
        this.bone50.setRotationPoint(-12.6899F, -2.2119F, 0.0F);
        this.TWO.addChild(this.bone50);
        this.setRotation(this.bone50, 0.0F, 0.0F, -0.1745F);
        this.bone50.cubeList.add(new ModelBox(this.bone50, 34, 23, 0.842F, -0.5356F, -0.5F, 3, 1, 1, 0.0F));
        this.bone51 = new MModelRenderer(this);
        this.bone51.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.TWO.addChild(this.bone51);
        this.setRotation(this.bone51, 0.0F, 0.0F, 0.5236F);
        this.bone51.cubeList.add(new ModelBox(this.bone51, 22, 33, -2.616F, -0.067F, -0.5F, 2, 1, 1, 0.0F));
        this.bone52 = new MModelRenderer(this);
        this.bone52.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.TWO.addChild(this.bone52);
        this.setRotation(this.bone52, 0.0F, 0.0F, 0.9599F);
        this.bone52.cubeList.add(new ModelBox(this.bone52, 20, 8, -3.403F, 0.132F, -0.5F, 2, 1, 1, 0.0F));
        this.setTexture(new ResourceLocation("minidot", "pets/skeletondragon.png"));
        BBAnimationLoader bbanimationloader = new BBAnimationLoader(new ResourceLocation("minidot", "pets/skeletondragon_animation.json"));
        this.animation = bbanimationloader.mustGet("floating", this);
    }

    protected void processMotion(ModelPlayer modelPlayer, EntityPlayer player, float time)
    {
        float f = MathHelper.sin(time * 0.1F) * 0.05F;
        GlStateManager.translate(0.7D, -0.8D + (double)f, 0.6D);
        this.animation.tick(time);
    }

    protected void preRender(ModelPlayer modelPlayer, EntityPlayer player, float time, MiniDotPlayer pi)
    {
        super.preRender(modelPlayer, player, time, pi);
        GlStateManager.scale(0.8D, 0.8D, 0.8D);
    }

    public void renderAsItem(float time)
    {
        GlStateManager.translate(0.0D, -0.3D, 0.0D);
        GlStateManager.scale(0.9D, 0.9D, 0.9D);
        this.animation.tick(time);
        super.renderAsItem(time);
    }

    public void render(ModelPlayer modelPlayer, EntityPlayer player, float time, MiniDotPlayer pi)
    {
        GlStateManager.enableCull();
        super.render(modelPlayer, player, time, pi);
        GlStateManager.disableCull();
    }

    public String getName()
    {
        return "\u0421\u043a\u0435\u043b\u0435\u0442 \u0434\u0440\u0430\u043a\u043e\u043d\u0430";
    }

    public String getCreator()
    {
        return "xRolaaan";
    }
}
