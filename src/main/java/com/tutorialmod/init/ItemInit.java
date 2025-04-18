package com.tutorialmod.init;

import com.tutorialmod.TutorialMod;
import com.tutorialmod.init.custom.Scythe_Item;
import com.tutorialmod.init.custom.Scythe_of_strength_Item;
import com.tutorialmod.init.custom.Scythe_of_decay_Item;
import com.tutorialmod.init.custom.Scythe_of_slowing_Item;
import com.tutorialmod.init.custom.Scythe_of_the_hearty;
import com.tutorialmod.init.custom.*;
import com.tutorialmod.util.Tiers;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SCYTHE = ITEMS.register("scythe",
            () -> new Scythe_Item(Tiers.unstable, 4, -2.4f,
                    new Item.Properties().tab(TutorialMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> SCYTHE_OF_THE_HEARTY = ITEMS.register("scythe_of_the_hearty",
            () -> new Scythe_of_the_hearty(Tiers.unstable, 4, -2.4f,
                    new Item.Properties().tab(TutorialMod.TUTORIAL_TAB)));


    public static final RegistryObject<Item> SCYTHE_OF_STRENGTH = ITEMS.register("scythe_of_strength",
            () -> new Scythe_of_strength_Item(Tiers.unstable, 4, -2.4f,
                    new Item.Properties().tab(TutorialMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> SCYTHE_OF_SLOWING = ITEMS.register("scythe_of_slowing",
            () -> new Scythe_of_slowing_Item(Tiers.unstable, 4, -2.4f,
                    new Item.Properties().tab(TutorialMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> SCYTHE_OF_DECAY = ITEMS.register("scythe_of_decay",
            () -> new Scythe_of_decay_Item(Tiers.unstable, 4, -2.4f,
                    new Item.Properties().tab(TutorialMod.TUTORIAL_TAB)));

public static final RegistryObject<Item> UNSTABLE_INGOT = ITEMS.register("unstable_ingot", () ->
        new Item(new Item.Properties().tab(TutorialMod.TUTORIAL_TAB)));
    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
        return ITEMS.register(name, item);
    }




}

