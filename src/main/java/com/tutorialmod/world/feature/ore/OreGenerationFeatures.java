package com.tutorialmod.world.feature.ore;


import com.tutorialmod.init.BlockInit;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class OreGenerationFeatures {
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_UNSTABLE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.UNSTABLE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,BlockInit.UNSTABLE_ORE.get().defaultBlockState()));



    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> UNSTABLE_ORE = FeatureUtils.register("unstable_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_UNSTABLE_ORES, 3));
}
