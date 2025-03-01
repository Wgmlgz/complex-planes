package xyz.przemyk.simpleplanes.client.render.models;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import xyz.przemyk.simpleplanes.entities.PlaneEntity;

public class PlaneModel extends EntityModel<PlaneEntity> {

    private final ModelPart bone;
    private final ModelPart wing;
    private final ModelPart stab;
    private final ModelPart bone2;
    private final ModelPart wing2;
    private final ModelPart bb_main;

    public PlaneModel(ModelPart root) {
        this.bone = root.getChild("bone");
        this.wing = root.getChild("wing");
        this.stab = root.getChild("stab");
        this.bone2 = root.getChild("bone2");
        this.wing2 = root.getChild("wing2");
        this.bb_main = root.getChild("bb_main");
    }


    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(193, 329).addBox(8.05F, -87.0F, 103.0F, 3.0F, 46.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(182, 318).addBox(7.98F, -75.0F, 92.0F, 3.0F, 21.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 64.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

        PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(193, 329).addBox(8.0F, -17.0F, -6.0F, 3.0F, 40.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -69.0F, 114.0F, 0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(193, 329).addBox(7.97F, -17.0F, -6.0F, 3.0F, 47.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -71.0F, 96.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition wing = partdefinition.addOrReplaceChild("wing", CubeListBuilder.create().texOffs(220, 325).addBox(-45.8764F, -9483.9F, 112.0201F, 65.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(154, 278).addBox(-64.8764F, -9483.91F, 57.0201F, 32.0F, 2.0F, 63.0F, new CubeDeformation(0.0F)), PartPose.offset(94.0F, 9501.0F, -41.0F));

        PartDefinition cube_r3 = wing.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(236, 328).addBox(-85.8764F, -9483.95F, 94.0201F, 14.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7418F, 0.0F));

        PartDefinition cube_r4 = wing.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(264, 327).addBox(-56.8764F, -9483.97F, 122.0201F, 42.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

        PartDefinition cube_r5 = wing.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(166, 298).addBox(-125.8764F, -43.1F, 55.0201F, 39.0F, 2.0F, 43.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -9441.0F, -14.0F, 0.0F, 0.7418F, 0.0F));

        PartDefinition cube_r6 = wing.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 220).addBox(-96.8764F, -9484.0F, 6.0201F, 23.0F, 2.0F, 121.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, 0.0F, -31.0F, 0.0F, 0.7418F, 0.0F));

        PartDefinition stab = partdefinition.addOrReplaceChild("stab", CubeListBuilder.create(), PartPose.offset(94.0F, 9501.0F, -41.0F));

        PartDefinition cube_r7 = stab.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(453, 324).addBox(135.1236F, -9484.0F, 90.0201F, 27.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.2654F, 0.0F));

        PartDefinition cube_r8 = stab.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(456, 330).addBox(132.1236F, -9484.0F, 92.0201F, 12.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(457, 321).addBox(142.1236F, -9484.2F, 83.0201F, 20.0F, 2.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(451, 336).addBox(121.1236F, -9484.1F, 102.0201F, 41.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(46.0F, 0.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r9 = stab.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(379, 334).addBox(51.1236F, -9483.9F, 122.0201F, 65.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.829F, 0.0F));

        PartDefinition cube_r10 = stab.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(452, 321).addBox(137.1236F, -9484.1F, 87.0201F, 25.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(60.0F, 0.0F, 14.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r11 = stab.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(229, 321).addBox(-85.8764F, -9483.93F, 155.0201F, 40.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

        PartDefinition cube_r12 = stab.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(345, 329).addBox(22.1236F, -9484.0F, 164.0201F, 18.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

        PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(193, 329).mirror().addBox(-11.05F, -87.0F, 103.0F, 3.0F, 46.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(182, 318).mirror().addBox(-10.98F, -75.0F, 92.0F, 3.0F, 21.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(10.0F, 64.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

        PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(193, 329).mirror().addBox(-11.0F, -17.0F, -6.0F, 3.0F, 40.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -69.0F, 114.0F, 0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(193, 329).mirror().addBox(-10.97F, -17.0F, -6.0F, 3.0F, 47.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -71.0F, 96.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition wing2 = partdefinition.addOrReplaceChild("wing2", CubeListBuilder.create().texOffs(220, 325).mirror().addBox(-19.1236F, -9483.9F, 112.0201F, 65.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(154, 278).mirror().addBox(32.8764F, -9483.91F, 57.0201F, 32.0F, 2.0F, 63.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-94.0F, 9501.0F, -41.0F));

        PartDefinition cube_r15 = wing2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(453, 324).mirror().addBox(-162.1236F, -9484.0F, 90.0201F, 27.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.2654F, 0.0F));

        PartDefinition cube_r16 = wing2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(456, 330).mirror().addBox(-144.1236F, -9484.0F, 92.0201F, 12.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(457, 321).mirror().addBox(-162.1236F, -9484.2F, 83.0201F, 20.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(451, 336).mirror().addBox(-162.1236F, -9484.1F, 102.0201F, 41.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-46.0F, 0.0F, -1.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r17 = wing2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(379, 334).mirror().addBox(-116.1236F, -9483.9F, 122.0201F, 65.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.829F, 0.0F));

        PartDefinition cube_r18 = wing2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(452, 321).mirror().addBox(-162.1236F, -9484.1F, 87.0201F, 25.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-60.0F, 0.0F, 14.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r19 = wing2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(229, 321).mirror().addBox(45.8764F, -9483.93F, 155.0201F, 40.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(264, 327).mirror().addBox(14.8764F, -9483.97F, 122.0201F, 42.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

        PartDefinition cube_r20 = wing2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(345, 329).mirror().addBox(-40.1236F, -9484.0F, 164.0201F, 18.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3054F, 0.0F));

        PartDefinition cube_r21 = wing2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(236, 328).mirror().addBox(71.8764F, -9483.95F, 94.0201F, 14.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7418F, 0.0F));

        PartDefinition cube_r22 = wing2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(166, 298).mirror().addBox(86.8764F, -43.1F, 55.0201F, 39.0F, 2.0F, 43.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.0F, -9441.0F, -14.0F, 0.0F, -0.7418F, 0.0F));

        PartDefinition cube_r23 = wing2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(64, 220).mirror().addBox(73.8764F, -9484.0F, 6.0201F, 23.0F, 2.0F, 121.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(12.0F, 0.0F, -31.0F, 0.0F, -0.7418F, 0.0F));

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(67, 200).addBox(11.0F, -4.0F, -26.0F, 26.0F, 20.0F, 141.0F, new CubeDeformation(0.0F))
                .texOffs(176, 326).addBox(-6.0F, -9.0F, 139.0F, 12.0F, 8.0F, 15.0F, new CubeDeformation(0.0F))
                .texOffs(173, 320).addBox(-3.0F, -8.0F, 139.0F, 6.0F, 5.0F, 21.0F, new CubeDeformation(0.0F))
                .texOffs(189, 336).addBox(-2.9F, -7.0F, -158.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(155, 300).addBox(-0.9F, -6.0F, -165.0F, 2.0F, 3.0F, 41.0F, new CubeDeformation(0.0F))
                .texOffs(188, 336).addBox(-4.0F, -8.0F, -153.0F, 8.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(165, 318).addBox(-7.0F, -20.0F, -112.0F, 16.0F, 10.0F, 23.0F, new CubeDeformation(0.0F))
                .texOffs(67, 200).mirror().addBox(-37.0F, -4.0F, -26.0F, 26.0F, 20.0F, 141.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(168, 321).addBox(-9.0F, -10.0F, 126.0F, 18.0F, 11.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(0, 156).mirror().addBox(-11.0F, -11.0F, -56.0F, 23.0F, 16.0F, 185.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(108, 262).addBox(-10.0F, -10.0F, -135.0F, 19.0F, 15.0F, 79.0F, new CubeDeformation(0.0F))
                .texOffs(176, 327).addBox(-7.0F, -9.0F, -149.0F, 14.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition cube_r24 = bb_main.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(174, 325).addBox(-6.9F, -4.9208F, -15.8019F, 12.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -19.0F, -92.0F, -0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r25 = bb_main.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(176, 327).addBox(-7.0F, 0.0F, -9.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -140.0F, -0.1309F, 0.0F, 0.0F));

        PartDefinition cube_r26 = bb_main.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(159, 310).addBox(-7.0F, -9.0F, -37.0F, 12.0F, 11.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -19.0F, -98.0F, 0.48F, 0.0F, 0.0F));

        PartDefinition cube_r27 = bb_main.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(81, 223).mirror().addBox(-6.0F, -13.0F, 9.0F, 14.0F, 13.0F, 132.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -10.0F, -97.0F, -0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r28 = bb_main.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(175, 326).mirror().addBox(-5.0F, -4.9208F, -14.8019F, 12.0F, 13.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -15.0F, -80.0F, -0.3054F, 0.0F, 0.0F));

        PartDefinition cube_r29 = bb_main.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(187, 327).mirror().addBox(-7.0F, -6.0F, -6.0F, 3.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -2.0F, -142.0F, 0.0F, -0.1745F, 0.0F));

        PartDefinition cube_r30 = bb_main.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(126, 262).mirror().addBox(-4.0F, -4.0F, -41.0F, 8.0F, 6.0F, 79.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.0F, -4.0F, -94.0F, 0.0F, -0.0873F, 0.0F));

        PartDefinition cube_r31 = bb_main.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(163, 308).mirror().addBox(-12.9057F, -0.631F, -15.9799F, 25.0F, 2.0F, 33.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-22.0F, -6.0F, 102.0F, -0.1309F, 0.0F, -0.1745F));

        PartDefinition cube_r32 = bb_main.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(186, 315).mirror().addBox(-11.0F, -49.0F, -14.0F, 18.0F, 18.0F, 26.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-22.0F, 46.0F, 129.0F, 0.0F, -0.0436F, 0.0F));

        PartDefinition cube_r33 = bb_main.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(166, 303).mirror().addBox(-8.0F, -1.0F, -7.0F, 25.0F, 3.0F, 38.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-14.0F, -4.0F, -57.0F, 0.0F, -0.7854F, 0.0436F));

        PartDefinition cube_r34 = bb_main.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-18.0F, -1.0F, -40.0F, 35.0F, 3.0F, 126.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-24.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

        PartDefinition cube_r35 = bb_main.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(202, 330).mirror().addBox(-7.2212F, -4.0F, -2.0636F, 9.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(172, 313).mirror().addBox(-7.2212F, -4.0F, -30.0636F, 22.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-30.0F, -4.0F, -41.0F, 0.1578F, -0.7279F, -0.2348F));

        PartDefinition cube_r36 = bb_main.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(162, 322).mirror().addBox(-16.0866F, -1.9F, -17.9332F, 38.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-35.0F, -5.0F, 25.0F, -0.0679F, -0.2173F, -0.0894F));

        PartDefinition cube_r37 = bb_main.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(136, 296).mirror().addBox(-16.0866F, -2.0F, -17.9332F, 38.0F, 2.0F, 45.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-30.0F, -6.0F, -19.0F, 0.0193F, -0.2173F, -0.0894F));

        PartDefinition cube_r38 = bb_main.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(67, 212).mirror().addBox(-14.1236F, -11.0F, -41.9799F, 25.0F, 2.0F, 129.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-19.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

        PartDefinition cube_r39 = bb_main.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(187, 327).addBox(4.0F, -6.0F, -6.0F, 3.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, -142.0F, 0.0F, 0.1745F, 0.0F));

        PartDefinition cube_r40 = bb_main.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(184, 331).addBox(-3.0F, 1.0F, -2.0F, 6.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -155.0F, -0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r41 = bb_main.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(188, 333).addBox(-1.0F, 1.0F, -2.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -162.0F, -0.3491F, 0.0F, 0.0F));

        PartDefinition cube_r42 = bb_main.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(126, 262).addBox(-4.0F, -4.0F, -41.0F, 8.0F, 6.0F, 79.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -4.0F, -94.0F, 0.0F, 0.0873F, 0.0F));

        PartDefinition cube_r43 = bb_main.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(163, 308).addBox(-12.0943F, -0.631F, -15.9799F, 25.0F, 2.0F, 33.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(22.0F, -6.0F, 102.0F, -0.1309F, 0.0F, 0.1745F));

        PartDefinition cube_r44 = bb_main.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(186, 315).addBox(-7.0F, -49.0F, -14.0F, 18.0F, 18.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(22.0F, 46.0F, 129.0F, 0.0F, 0.0436F, 0.0F));

        PartDefinition cube_r45 = bb_main.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(166, 303).addBox(-17.0F, -1.0F, -7.0F, 25.0F, 3.0F, 38.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, -4.0F, -57.0F, 0.0F, 0.7854F, -0.0436F));

        PartDefinition cube_r46 = bb_main.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 0).addBox(-17.0F, -1.0F, -40.0F, 35.0F, 3.0F, 126.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

        PartDefinition cube_r47 = bb_main.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(202, 330).addBox(-1.7788F, -4.0F, -2.0636F, 9.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(172, 313).addBox(-14.7788F, -4.0F, -30.0636F, 22.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(30.0F, -4.0F, -41.0F, 0.1578F, 0.7279F, 0.2348F));

        PartDefinition cube_r48 = bb_main.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(162, 322).addBox(-21.9134F, -1.9F, -17.9332F, 38.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(35.0F, -5.0F, 25.0F, -0.0679F, 0.2173F, 0.0894F));

        PartDefinition cube_r49 = bb_main.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(136, 296).addBox(-21.9134F, -2.0F, -17.9332F, 38.0F, 2.0F, 45.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(30.0F, -6.0F, -19.0F, 0.0193F, 0.2173F, 0.0894F));

        PartDefinition cube_r50 = bb_main.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(67, 212).addBox(-10.8764F, -11.0F, -41.9799F, 25.0F, 2.0F, 129.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

        return LayerDefinition.create(meshdefinition, 512, 512);
    }
    @Override
    public void setupAnim(PlaneEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        stab.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        wing2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }
}