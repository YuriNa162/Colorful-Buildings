package com.yuri.colorbuild.core.event;

import com.yuri.colorbuild.ColorfulBuildings;
import com.yuri.colorbuild.core.init.BlockInit;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = ColorfulBuildings.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusSubscriber {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)
                .forEach(block -> {
                    final Item.Properties properties = new Item.Properties().tab(ColorfulBuildings.TAB_CB);
                    final BlockItem blockItem = new BlockItem(block, properties);
                    blockItem.setRegistryName(block.getRegistryName());
                    registry.register(blockItem);
                });
    }
}