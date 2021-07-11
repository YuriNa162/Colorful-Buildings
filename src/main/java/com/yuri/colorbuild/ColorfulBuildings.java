package com.yuri.colorbuild;

import com.yuri.colorbuild.core.init.BlockInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;
import java.util.stream.Collectors;

@Mod(ColorfulBuildings.MOD_ID)

public class ColorfulBuildings {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "colorbuild";
    public static final ItemGroup TAB_CB = new CBGroup("cbtab");


    public ColorfulBuildings() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    public static class CBGroup extends ItemGroup
    {
        public CBGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return BlockInit.BLACK_STONE.get().asItem().getDefaultInstance();
        }
    }

}
