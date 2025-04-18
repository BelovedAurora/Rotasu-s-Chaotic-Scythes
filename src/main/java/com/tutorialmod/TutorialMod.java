package com.tutorialmod;

import com.tutorialmod.init.BlockInit;
import com.tutorialmod.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("tutorialmod")
public class TutorialMod{

    public static final String MOD_ID = "tutorialmod";
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab(MOD_ID) {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.SCYTHE.get());
        }
    };

    public TutorialMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}


