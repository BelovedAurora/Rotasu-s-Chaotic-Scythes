package com.tutorialmod.world.feature.ore;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class OrePlacement {
    public static final Holder<PlacedFeature> UNSTABLE_ORE_PLACED = PlacementUtils.register("unstable_ore_placed",
            OreGenerationFeatures.UNSTABLE_ORE,OrePlacedFeatures.commonOrePlacement(5, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-50), VerticalAnchor.aboveBottom(50))));
}
