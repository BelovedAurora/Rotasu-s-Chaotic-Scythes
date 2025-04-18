package com.tutorialmod.util;

import com.tutorialmod.init.BlockInit;
import com.tutorialmod.init.ItemInit;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class Tiers {
    public static final ForgeTier unstable = new ForgeTier(5, 1500, 9f,
            6f, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(BlockInit.UNSTABLE_ORE.get()));
}
