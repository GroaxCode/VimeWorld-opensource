package net.xtrafrancyz.mods.minidot.items.pet;

import java.util.List;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.MiniDotPlayer;
import net.xtrafrancyz.mods.minidot.items.MModelRenderer;
import net.xtrafrancyz.mods.minidot.util.MNaming;

public class HollowKnight extends BasePet
{
    private final MModelRenderer bone5;
    private final MModelRenderer bone4;
    private final MModelRenderer bone6;
    private final MModelRenderer bone7;
    private final MModelRenderer bone8;
    private final MModelRenderer bone3;
    private final MModelRenderer bone9;
    private final MModelRenderer bone10;
    private final MModelRenderer bone11;
    private final MModelRenderer bone12;
    private final MModelRenderer bone13;
    private final MModelRenderer bone14;
    private final MModelRenderer bone15;
    private final MModelRenderer bone16;
    private final MModelRenderer bone17;
    private final MModelRenderer bone18;
    private final MModelRenderer bone19;
    private final MModelRenderer bone20;
    private final MModelRenderer bone21;
    private final MModelRenderer bone22;
    private final MModelRenderer bone23;
    private final MModelRenderer bone24;
    private final MModelRenderer bone25;
    private final MModelRenderer bone26;
    private final MModelRenderer bone27;
    private final MModelRenderer bone28;
    private final MModelRenderer bone29;
    private final MModelRenderer bone30;
    private final MModelRenderer bone31;
    private final MModelRenderer bone32;
    private final MModelRenderer bone33;
    private final MModelRenderer bone34;
    private final MModelRenderer bone35;
    private final MModelRenderer bone36;
    private final MModelRenderer bone37;
    private final MModelRenderer bone2;
    private final MModelRenderer bone38;
    private final MModelRenderer bone39;
    private final MModelRenderer bone40;
    private final MModelRenderer bone41;
    private final MModelRenderer bone42;
    private final MModelRenderer bone43;
    private final MModelRenderer bone44;
    private final MModelRenderer bone45;
    private final MModelRenderer bone46;
    private final MModelRenderer bone;
    private final MModelRenderer bone47;
    private final MModelRenderer bone49;
    private final MModelRenderer bone50;
    private final MModelRenderer bone51;
    private final MModelRenderer bone52;
    private final MModelRenderer bone53;
    private final MModelRenderer bone48;

    public HollowKnight()
    {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.bone5 = new MModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, 0.0F, 0.275F);
        this.bone4 = new MModelRenderer(this);
        this.bone4.setRotationPoint(0.4572F, -5.4939F, 1.375F);
        this.setRotation(this.bone4, 0.0F, 0.0F, 1.0516F);
        this.bone5.addChild(this.bone4);
        this.bone4.cubeList.add(new ModelBox(this.bone4, 16, 9, 0.6428F, -2.9311F, -0.275F, 1, 3, 1, -0.275F, false));
        this.bone6 = new MModelRenderer(this);
        this.bone6.setRotationPoint(1.1428F, -1.9311F, 0.225F);
        this.setRotation(this.bone6, 0.0F, 0.0F, -1.5708F);
        this.bone4.addChild(this.bone6);
        this.bone6.cubeList.add(new ModelBox(this.bone6, 31, 8, -5.65F, -0.775F, -0.5F, 2, 1, 1, -0.425F, false));
        this.bone6.cubeList.add(new ModelBox(this.bone6, 16, 0, -4.55F, -0.975F, -0.5F, 4, 2, 1, -0.425F, false));
        this.bone6.cubeList.add(new ModelBox(this.bone6, 31, 8, -6.65F, -0.475F, -0.5F, 3, 1, 1, -0.425F, false));
        this.bone6.cubeList.add(new ModelBox(this.bone6, 31, 8, -6.65F, -0.325F, -0.5F, 3, 1, 1, -0.425F, false));
        this.bone6.cubeList.add(new ModelBox(this.bone6, 31, 8, -5.65F, -0.175F, -0.5F, 2, 1, 1, -0.425F, false));
        this.bone6.cubeList.add(new ModelBox(this.bone6, 31, 8, -6.65F, -0.625F, -0.5F, 3, 1, 1, -0.425F, false));
        this.bone7 = new MModelRenderer(this);
        this.bone7.setRotationPoint(0.701F, 1.5466F, 0.225F);
        this.setRotation(this.bone7, 0.0F, 0.0F, -0.1571F);
        this.bone4.addChild(this.bone7);
        this.bone7.cubeList.add(new ModelBox(this.bone7, 0, 24, -0.6F, -3.0F, -0.5F, 1, 6, 1, -0.3F, false));
        this.bone8 = new MModelRenderer(this);
        this.bone8.setRotationPoint(2.5846F, 1.5466F, 0.225F);
        this.setRotation(this.bone8, 0.0F, 0.0F, 0.1571F);
        this.bone4.addChild(this.bone8);
        this.bone8.cubeList.add(new ModelBox(this.bone8, 22, 21, -1.35F, -2.85F, -0.5F, 1, 6, 1, -0.3F, false));
        this.bone3 = new MModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.0F, -0.275F);
        this.bone5.addChild(this.bone3);
        this.bone9 = new MModelRenderer(this);
        this.bone9.setRotationPoint(0.0F, -4.875F, -0.575F);
        this.setRotation(this.bone9, -0.052F, -0.0064F, -0.122F);
        this.bone3.addChild(this.bone9);
        this.bone9.cubeList.add(new ModelBox(this.bone9, 26, 0, -1.0F, -2.0F, -0.5F, 2, 4, 1, -0.4F, false));
        this.bone10 = new MModelRenderer(this);
        this.bone10.setRotationPoint(0.0F, -4.875F, -0.575F);
        this.setRotation(this.bone10, -0.0521F, 0.0052F, 0.1002F);
        this.bone3.addChild(this.bone10);
        this.bone10.cubeList.add(new ModelBox(this.bone10, 4, 24, -1.725F, -2.0F, -0.2F, 2, 4, 1, -0.4F, false));
        this.bone11 = new MModelRenderer(this);
        this.bone11.setRotationPoint(-0.9568F, -2.5969F, -0.394F);
        this.setRotation(this.bone11, 0.0134F, 0.0052F, 0.1002F);
        this.bone3.addChild(this.bone11);
        this.bone11.cubeList.add(new ModelBox(this.bone11, 12, 29, -1.0F, -1.5F, -0.5F, 2, 3, 1, -0.475F, false));
        this.bone12 = new MModelRenderer(this);
        this.bone12.setRotationPoint(-1.5859F, -2.6863F, 0.2571F);
        this.setRotation(this.bone12, -0.0731F, 0.6696F, -0.0952F);
        this.bone3.addChild(this.bone12);
        this.bone12.cubeList.add(new ModelBox(this.bone12, 26, 25, -0.7414F, -1.4688F, -0.7255F, 2, 3, 1, -0.575F, false));
        this.bone13 = new MModelRenderer(this);
        this.bone13.setRotationPoint(-1.5859F, -2.6863F, 0.2571F);
        this.setRotation(this.bone13, -3.0512F, 1.1378F, -3.1314F);
        this.bone3.addChild(this.bone13);
        this.bone13.cubeList.add(new ModelBox(this.bone13, 26, 21, -1.2809F, -1.526F, -0.6977F, 2, 3, 1, -0.475F, false));
        this.bone14 = new MModelRenderer(this);
        this.bone14.setRotationPoint(0.8474F, -2.6448F, -0.4793F);
        this.setRotation(this.bone14, 0.1033F, 0.035F, -0.3254F);
        this.bone3.addChild(this.bone14);
        this.bone14.cubeList.add(new ModelBox(this.bone14, 31, 18, -1.378F, -1.569F, -0.5375F, 2, 3, 1, -0.45F, false));
        this.bone15 = new MModelRenderer(this);
        this.bone15.setRotationPoint(0.0F, -4.875F, -0.575F);
        this.setRotation(this.bone15, -0.052F, -0.0064F, -0.122F);
        this.bone3.addChild(this.bone15);
        this.bone15.cubeList.add(new ModelBox(this.bone15, 16, 24, -0.25F, -1.85F, -0.425F, 2, 4, 1, -0.4F, false));
        this.bone16 = new MModelRenderer(this);
        this.bone16.setRotationPoint(0.986F, -2.936F, -0.4735F);
        this.setRotation(this.bone16, 0.1203F, 0.0363F, -0.3385F);
        this.bone3.addChild(this.bone16);
        this.bone16.cubeList.add(new ModelBox(this.bone16, 0, 9, -0.5F, -1.5F, -0.5F, 1, 3, 1, -0.425F, false));
        this.bone17 = new MModelRenderer(this);
        this.bone17.setRotationPoint(0.986F, -2.936F, -0.4735F);
        this.setRotation(this.bone17, 0.1203F, 0.0363F, -0.3385F);
        this.bone3.addChild(this.bone17);
        this.bone17.cubeList.add(new ModelBox(this.bone17, 32, 10, -0.375F, -0.75F, -0.5F, 1, 2, 1, -0.425F, false));
        this.bone18 = new MModelRenderer(this);
        this.bone18.setRotationPoint(0.986F, -2.936F, -0.4735F);
        this.setRotation(this.bone18, 0.1203F, 0.0363F, -0.3385F);
        this.bone3.addChild(this.bone18);
        this.bone18.cubeList.add(new ModelBox(this.bone18, 0, 31, -0.225F, -0.975F, -0.5F, 1, 2, 1, -0.425F, false));
        this.bone19 = new MModelRenderer(this);
        this.bone19.setRotationPoint(0.986F, -2.936F, -0.4735F);
        this.setRotation(this.bone19, 0.1203F, 0.0363F, -0.3385F);
        this.bone3.addChild(this.bone19);
        this.bone19.cubeList.add(new ModelBox(this.bone19, 0, 34, -0.1F, -0.4F, -0.5F, 1, 1, 1, -0.425F, false));
        this.bone20 = new MModelRenderer(this);
        this.bone20.setRotationPoint(0.986F, -2.936F, -0.4735F);
        this.setRotation(this.bone20, 0.1203F, 0.0363F, -0.3385F);
        this.bone3.addChild(this.bone20);
        this.bone20.cubeList.add(new ModelBox(this.bone20, 28, 33, -0.1F, -0.55F, -0.5F, 1, 1, 1, -0.425F, false));
        this.bone21 = new MModelRenderer(this);
        this.bone21.setRotationPoint(0.986F, -2.936F, -0.4735F);
        this.setRotation(this.bone21, 0.1203F, 0.0363F, -0.3385F);
        this.bone3.addChild(this.bone21);
        this.bone21.cubeList.add(new ModelBox(this.bone21, 32, 16, -0.1F, -0.7F, -0.5F, 1, 1, 1, -0.425F, false));
        this.bone22 = new MModelRenderer(this);
        this.bone22.setRotationPoint(1.521F, -4.8942F, -0.2613F);
        this.setRotation(this.bone22, -0.1056F, -1.0556F, -0.0303F);
        this.bone3.addChild(this.bone22);
        this.bone22.cubeList.add(new ModelBox(this.bone22, 10, 24, -0.625F, -2.0F, -0.35F, 2, 4, 1, -0.4F, false));
        this.bone23 = new MModelRenderer(this);
        this.bone23.setRotationPoint(1.369F, -3.4587F, 0.9329F);
        this.setRotation(this.bone23, 3.1123F, -0.6448F, 2.9751F);
        this.bone3.addChild(this.bone23);
        this.bone23.cubeList.add(new ModelBox(this.bone23, 22, 15, -1.1165F, -4.3352F, -0.6415F, 2, 5, 1, -0.4F, false));
        this.bone24 = new MModelRenderer(this);
        this.bone24.setRotationPoint(1.369F, -3.4587F, 0.9329F);
        this.setRotation(this.bone24, -3.063F, -0.6516F, -3.133F);
        this.bone3.addChild(this.bone24);
        this.bone24.cubeList.add(new ModelBox(this.bone24, 32, 3, -1.0702F, 0.3484F, -0.6255F, 2, 2, 1, -0.45F, false));
        this.bone25 = new MModelRenderer(this);
        this.bone25.setRotationPoint(1.369F, -3.4587F, 0.9329F);
        this.setRotation(this.bone25, -3.063F, -0.6516F, -3.133F);
        this.bone3.addChild(this.bone25);
        this.bone25.cubeList.add(new ModelBox(this.bone25, 32, 0, -1.0702F, -0.5266F, -0.6255F, 2, 2, 1, -0.45F, false));
        this.bone26 = new MModelRenderer(this);
        this.bone26.setRotationPoint(0.3138F, -5.1644F, 1.3776F);
        this.setRotation(this.bone26, 3.018F, -0.0945F, 3.0275F);
        this.bone3.addChild(this.bone26);
        this.bone26.cubeList.add(new ModelBox(this.bone26, 20, 9, -1.0F, -2.7F, -0.375F, 2, 5, 1, -0.4F, false));
        this.bone27 = new MModelRenderer(this);
        this.bone27.setRotationPoint(0.6054F, -2.5968F, 1.3494F);
        this.setRotation(this.bone27, -3.0034F, -0.0945F, 3.0275F);
        this.bone3.addChild(this.bone27);
        this.bone27.cubeList.add(new ModelBox(this.bone27, 26, 9, -1.0F, -1.5F, -0.5F, 2, 3, 1, -0.45F, false));
        this.bone28 = new MModelRenderer(this);
        this.bone28.setRotationPoint(-0.5402F, -2.6259F, 1.3999F);
        this.setRotation(this.bone28, 0.043F, 0.1432F, 3.0606F);
        this.bone3.addChild(this.bone28);
        this.bone28.cubeList.add(new ModelBox(this.bone28, 26, 5, -1.025F, -1.5F, -0.5F, 2, 3, 1, -0.45F, false));
        this.bone29 = new MModelRenderer(this);
        this.bone29.setRotationPoint(-1.2308F, -2.5698F, 1.3F);
        this.setRotation(this.bone29, 0.054F, 0.6618F, 3.0877F);
        this.bone3.addChild(this.bone29);
        this.bone29.cubeList.add(new ModelBox(this.bone29, 31, 31, -0.9F, -1.5F, -0.8F, 2, 2, 1, -0.45F, false));
        this.bone30 = new MModelRenderer(this);
        this.bone30.setRotationPoint(-1.2308F, -2.5698F, 1.3F);
        this.setRotation(this.bone30, 0.054F, 0.6618F, 3.0877F);
        this.bone3.addChild(this.bone30);
        this.bone30.cubeList.add(new ModelBox(this.bone30, 31, 28, -0.9F, -0.45F, -0.8F, 2, 2, 1, -0.45F, false));
        this.bone31 = new MModelRenderer(this);
        this.bone31.setRotationPoint(-0.7217F, -5.2467F, 1.4844F);
        this.setRotation(this.bone31, 3.0719F, 0.2799F, 3.1242F);
        this.bone3.addChild(this.bone31);
        this.bone31.cubeList.add(new ModelBox(this.bone31, 20, 3, -0.975F, -2.5F, -0.4F, 2, 5, 1, -0.4F, false));
        this.bone32 = new MModelRenderer(this);
        this.bone32.setRotationPoint(-1.3787F, -5.264F, 0.8957F);
        this.setRotation(this.bone32, 3.1088F, 1.0225F, -3.0621F);
        this.bone3.addChild(this.bone32);
        this.bone32.cubeList.add(new ModelBox(this.bone32, 16, 18, -0.8F, -2.5F, -0.45F, 2, 5, 1, -0.4F, false));
        this.bone33 = new MModelRenderer(this);
        this.bone33.setRotationPoint(-1.4926F, -5.2434F, -1.0161F);
        this.setRotation(this.bone33, 0.0255F, 0.8358F, 0.1264F);
        this.bone3.addChild(this.bone33);
        this.bone33.cubeList.add(new ModelBox(this.bone33, 8, 29, -1.45F, -2.5F, 0.225F, 1, 5, 1, -0.4F, false));
        this.bone34 = new MModelRenderer(this);
        this.bone34.setRotationPoint(-1.4926F, -5.2434F, -1.0161F);
        this.setRotation(this.bone34, 0.0255F, 0.8358F, 0.1264F);
        this.bone3.addChild(this.bone34);
        this.bone34.cubeList.add(new ModelBox(this.bone34, 4, 29, -1.25F, -2.5F, 0.225F, 1, 5, 1, -0.4F, false));
        this.bone35 = new MModelRenderer(this);
        this.bone35.setRotationPoint(-1.4926F, -5.2434F, -1.0161F);
        this.setRotation(this.bone35, 0.0255F, 0.8358F, 0.1264F);
        this.bone3.addChild(this.bone35);
        this.bone35.cubeList.add(new ModelBox(this.bone35, 21, 28, -1.075F, -2.5F, 0.225F, 1, 5, 1, -0.4F, false));
        this.bone36 = new MModelRenderer(this);
        this.bone36.setRotationPoint(-1.4926F, -5.2434F, -1.0161F);
        this.setRotation(this.bone36, 0.0255F, 0.8358F, 0.1264F);
        this.bone3.addChild(this.bone36);
        this.bone36.cubeList.add(new ModelBox(this.bone36, 28, 13, -0.875F, -2.0F, 0.225F, 1, 5, 1, -0.4F, false));
        this.bone37 = new MModelRenderer(this);
        this.bone37.setRotationPoint(1.7863F, -2.8718F, -0.032F);
        this.setRotation(this.bone37, 0.0427F, -1.0556F, -0.0303F);
        this.bone3.addChild(this.bone37);
        this.bone37.cubeList.add(new ModelBox(this.bone37, 25, 29, -1.0F, -1.5F, -0.35F, 2, 3, 1, -0.45F, false));
        this.bone2 = new MModelRenderer(this);
        this.bone5.addChild(this.bone2);
        this.bone2.cubeList.add(new ModelBox(this.bone2, 0, 9, -3.0F, -11.425F, -1.8F, 6, 5, 4, -0.025F, false));
        this.bone2.cubeList.add(new ModelBox(this.bone2, 0, 0, -3.0F, -11.425F, -1.8F, 6, 5, 4, 0.025F, false));
        this.bone38 = new MModelRenderer(this);
        this.bone38.setRotationPoint(2.675F, -11.3F, 0.45F);
        this.setRotation(this.bone38, 0.0F, 0.0F, 0.3796F);
        this.bone2.addChild(this.bone38);
        this.bone38.cubeList.add(new ModelBox(this.bone38, 32, 25, -0.475F, -1.5F, -1.625F, 1, 2, 1, 0.05F, false));
        this.bone39 = new MModelRenderer(this);
        this.bone39.setRotationPoint(3.3796F, -13.6026F, -0.675F);
        this.setRotation(this.bone39, 0.0F, 0.0F, -0.1091F);
        this.bone2.addChild(this.bone39);
        this.bone39.cubeList.add(new ModelBox(this.bone39, 17, 32, -0.75F, -0.925F, -0.5F, 1, 2, 1, 0.025F, false));
        this.bone40 = new MModelRenderer(this);
        this.bone40.setRotationPoint(-3.3796F, -13.6026F, -0.675F);
        this.setRotation(this.bone40, 0.0F, 0.0F, 0.1091F);
        this.bone2.addChild(this.bone40);
        this.bone40.cubeList.add(new ModelBox(this.bone40, 32, 13, -0.25F, -0.925F, -0.5F, 1, 2, 1, 0.025F, false));
        this.bone41 = new MModelRenderer(this);
        this.bone41.setRotationPoint(-3.0386F, -14.4203F, -0.675F);
        this.setRotation(this.bone41, 0.0F, 0.0F, 0.8508F);
        this.bone2.addChild(this.bone41);
        this.bone41.cubeList.add(new ModelBox(this.bone41, 15, 35, -0.425F, -0.725F, -0.5F, 1, 1, 1, 0.0F, false));
        this.bone42 = new MModelRenderer(this);
        this.bone42.setRotationPoint(3.0386F, -14.4203F, -0.675F);
        this.setRotation(this.bone42, 0.0F, 0.0F, -0.8508F);
        this.bone2.addChild(this.bone42);
        this.bone42.cubeList.add(new ModelBox(this.bone42, 35, 12, -0.575F, -0.725F, -0.5F, 1, 1, 1, 0.0F, false));
        this.bone43 = new MModelRenderer(this);
        this.bone43.setRotationPoint(3.0386F, -14.4203F, -0.675F);
        this.setRotation(this.bone43, 0.0F, 0.0F, -0.8508F);
        this.bone2.addChild(this.bone43);
        this.bone43.cubeList.add(new ModelBox(this.bone43, 7, 35, -0.325F, -1.2F, -0.5F, 1, 1, 1, -0.2F, false));
        this.bone44 = new MModelRenderer(this);
        this.bone44.setRotationPoint(-3.0386F, -14.4203F, -0.675F);
        this.setRotation(this.bone44, 0.0F, 0.0F, 0.8508F);
        this.bone2.addChild(this.bone44);
        this.bone44.cubeList.add(new ModelBox(this.bone44, 3, 35, -0.675F, -1.2F, -0.5F, 1, 1, 1, -0.2F, false));
        this.bone44.cubeList.add(new ModelBox(this.bone44, 31, 34, -0.1F, -1.2F, -0.5F, 1, 1, 1, -0.3F, false));
        this.bone45 = new MModelRenderer(this);
        this.bone45.setRotationPoint(3.0386F, -14.4203F, -0.675F);
        this.setRotation(this.bone45, 0.0F, 0.0F, -0.8508F);
        this.bone2.addChild(this.bone45);
        this.bone45.cubeList.add(new ModelBox(this.bone45, 20, 34, -0.9F, -1.2F, -0.5F, 1, 1, 1, -0.3F, false));
        this.bone46 = new MModelRenderer(this);
        this.bone46.setRotationPoint(-2.7F, -11.3F, 0.45F);
        this.setRotation(this.bone46, 0.0F, 0.0F, -0.3796F);
        this.bone2.addChild(this.bone46);
        this.bone46.cubeList.add(new ModelBox(this.bone46, 32, 22, -0.5F, -1.5F, -1.625F, 1, 2, 1, 0.05F, false));
        this.bone = new MModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, -0.275F);
        this.bone5.addChild(this.bone);
        this.bone47 = new MModelRenderer(this);
        this.bone.addChild(this.bone47);
        this.bone47.cubeList.add(new ModelBox(this.bone47, 8, 18, -1.5F, -6.625F, 0.025F, 3, 5, 1, -0.25F, false));
        this.bone47.cubeList.add(new ModelBox(this.bone47, 0, 18, -1.5F, -6.625F, -0.475F, 3, 5, 1, -0.25F, false));
        this.bone49 = new MModelRenderer(this);
        this.bone49.setRotationPoint(-0.875F, -1.75F, 0.225F);
        this.setRotation(this.bone49, 0.0F, 0.0F, 0.3622F);
        this.bone.addChild(this.bone49);
        this.bone49.cubeList.add(new ModelBox(this.bone49, 0, 36, -0.375F, -0.65F, -0.5F, 1, 1, 1, -0.1F, false));
        this.bone50 = new MModelRenderer(this);
        this.bone50.setRotationPoint(-0.4648F, -1.9154F, 0.225F);
        this.setRotation(this.bone50, 0.0F, 0.0F, 0.8814F);
        this.bone.addChild(this.bone50);
        this.bone50.cubeList.add(new ModelBox(this.bone50, 27, 35, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.15F, false));
        this.bone51 = new MModelRenderer(this);
        this.bone51.setRotationPoint(-0.4648F, -1.9154F, 0.225F);
        this.setRotation(this.bone51, 0.0F, 0.0F, 1.5795F);
        this.bone.addChild(this.bone51);
        this.bone51.cubeList.add(new ModelBox(this.bone51, 35, 15, -0.65F, -0.975F, -0.5F, 1, 1, 1, -0.15F, false));
        this.bone52 = new MModelRenderer(this);
        this.bone52.setRotationPoint(0.4648F, -1.9154F, 0.225F);
        this.setRotation(this.bone52, 0.0F, 0.0F, -0.8814F);
        this.bone.addChild(this.bone52);
        this.bone52.cubeList.add(new ModelBox(this.bone52, 35, 24, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.15F, false));
        this.bone53 = new MModelRenderer(this);
        this.bone53.setRotationPoint(0.875F, -1.75F, 0.225F);
        this.setRotation(this.bone53, 0.0F, 0.0F, -0.3622F);
        this.bone.addChild(this.bone53);
        this.bone53.cubeList.add(new ModelBox(this.bone53, 34, 35, -0.625F, -0.65F, -0.5F, 1, 1, 1, -0.1F, false));
        this.bone48 = new MModelRenderer(this);
        this.bone.addChild(this.bone48);
        this.bone48.cubeList.add(new ModelBox(this.bone48, 12, 33, -1.375F, -2.4F, -0.275F, 1, 2, 1, -0.1F, false));
        this.bone48.cubeList.add(new ModelBox(this.bone48, 24, 33, 0.375F, -2.4F, -0.275F, 1, 2, 1, -0.1F, false));
        super.setTexture(new ResourceLocation("minidot", "pets/hollowknight.png"));
    }

    protected void preRender(ModelPlayer modelPlayer, EntityPlayer player, float time, MiniDotPlayer pi)
    {
        super.preRender(modelPlayer, player, time, pi);
        double d0 = Math.sin((double)(time * 0.05F)) * 0.10000000149011612D;
        GlStateManager.translate(1.25D, -0.125D + d0, 0.4D);
    }

    public void renderAsItem(float time)
    {
        GlStateManager.translate(0.0D, 0.36850000000000005D, 0.0D);
        double d0 = 1.5D;
        GlStateManager.scale(d0, d0, d0);
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
        return "\u041f\u043e\u043b\u044b\u0439 \u0420\u044b\u0446\u0430\u0440\u044c";
    }

    public List<String> getDescription()
    {
        return MNaming.fromGame("Hollow Knight");
    }

    public String getCreator()
    {
        return "GUllT";
    }
}
