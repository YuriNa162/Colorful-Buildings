package com.yuri.colorbuild.core.init;

import com.yuri.colorbuild.ColorfulBuildings;
import net.minecraft.block.*;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ColorfulBuildings.MOD_ID);

    //Colored Stone
    public static final RegistryObject<Block> BLACK_STONE = BLOCKS.register("black_stone",() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> RED_STONE = BLOCKS.register("red_stone",() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GREEN_STONE = BLOCKS.register("green_stone",() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> BROWN_STONE = BLOCKS.register("brown_stone",() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> BLUE_STONE = BLOCKS.register("blue_stone",() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PURPLE_STONE = BLOCKS.register("purple_stone",() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CYAN_STONE = BLOCKS.register("cyan_stone",() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIGHT_GRAY_STONE = BLOCKS.register("light_gray_stone",() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GRAY_STONE = BLOCKS.register("gray_stone",() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PINK_STONE = BLOCKS.register("pink_stone",() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIME_STONE = BLOCKS.register("lime_stone",() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> YELLOW_STONE = BLOCKS.register("yellow_stone",() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIGHT_BLUE_STONE = BLOCKS.register("light_blue_stone",() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MAGENTA_STONE = BLOCKS.register("magenta_stone",() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> ORANGE_STONE = BLOCKS.register("orange_stone",() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> WHITE_STONE = BLOCKS.register("white_stone",() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));

    //Colored Stone Slab
    public static final RegistryObject<SlabBlock> BLACK_STONE_SLAB = BLOCKS.register("black_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.BLACK_STONE.get())));
    public static final RegistryObject<SlabBlock> RED_STONE_SLAB = BLOCKS.register("red_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.RED_STONE.get())));
    public static final RegistryObject<SlabBlock> GREEN_STONE_SLAB = BLOCKS.register("green_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.GREEN_STONE.get())));
    public static final RegistryObject<SlabBlock> BROWN_STONE_SLAB = BLOCKS.register("brown_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.BROWN_STONE.get())));
    public static final RegistryObject<SlabBlock> BLUE_STONE_SLAB = BLOCKS.register("blue_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.BLUE_STONE.get())));
    public static final RegistryObject<SlabBlock> PURPLE_STONE_SLAB = BLOCKS.register("purple_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.PURPLE_STONE.get())));
    public static final RegistryObject<SlabBlock> CYAN_STONE_SLAB = BLOCKS.register("cyan_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.CYAN_STONE.get())));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_STONE_SLAB = BLOCKS.register("light_gray_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.LIGHT_GRAY_STONE.get())));
    public static final RegistryObject<SlabBlock> GRAY_STONE_SLAB = BLOCKS.register("gray_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.GRAY_STONE.get())));
    public static final RegistryObject<SlabBlock> PINK_STONE_SLAB = BLOCKS.register("pink_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.PINK_STONE.get())));
    public static final RegistryObject<SlabBlock> LIME_STONE_SLAB = BLOCKS.register("lime_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.LIME_STONE.get())));
    public static final RegistryObject<SlabBlock> YELLOW_STONE_SLAB = BLOCKS.register("yellow_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.YELLOW_STONE.get())));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_STONE_SLAB = BLOCKS.register("light_blue_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.LIGHT_BLUE_STONE.get())));
    public static final RegistryObject<SlabBlock> MAGENTA_STONE_SLAB = BLOCKS.register("magenta_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.MAGENTA_STONE.get())));
    public static final RegistryObject<SlabBlock> ORANGE_STONE_SLAB = BLOCKS.register("orange_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.ORANGE_STONE.get())));
    public static final RegistryObject<SlabBlock> WHITE_STONE_SLAB = BLOCKS.register("white_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.WHITE_STONE.get())));

    //Colored Stone Stairs
    public static final RegistryObject<StairsBlock> BLACK_STONE_STAIRS = BLOCKS.register("black_stone_stairs",() -> new StairsBlock(() -> BlockInit.BLACK_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.BLACK_STONE.get())));
    public static final RegistryObject<StairsBlock> RED_STONE_STAIRS = BLOCKS.register("red_stone_stairs",() -> new StairsBlock(() -> BlockInit.RED_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.RED_STONE.get())));
    public static final RegistryObject<StairsBlock> GREEN_STONE_STAIRS = BLOCKS.register("green_stone_stairs",() -> new StairsBlock(() -> BlockInit.GREEN_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.GREEN_STONE.get())));
    public static final RegistryObject<StairsBlock> BROWN_STONE_STAIRS = BLOCKS.register("brown_stone_stairs",() -> new StairsBlock(() -> BlockInit.BROWN_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.BROWN_STONE.get())));
    public static final RegistryObject<StairsBlock> BLUE_STONE_STAIRS = BLOCKS.register("blue_stone_stairs",() -> new StairsBlock(() -> BlockInit.BLUE_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.BLUE_STONE.get())));
    public static final RegistryObject<StairsBlock> PURPLE_STONE_STAIRS = BLOCKS.register("purple_stone_stairs",() -> new StairsBlock(() -> BlockInit.PURPLE_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.PURPLE_STONE.get())));
    public static final RegistryObject<StairsBlock> CYAN_STONE_STAIRS = BLOCKS.register("cyan_stone_stairs",() -> new StairsBlock(() -> BlockInit.CYAN_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.CYAN_STONE.get())));
    public static final RegistryObject<StairsBlock> LIGHT_GRAY_STONE_STAIRS = BLOCKS.register("light_gray_stone_stairs",() -> new StairsBlock(() -> BlockInit.LIGHT_GRAY_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.LIGHT_GRAY_STONE.get())));
    public static final RegistryObject<StairsBlock> GRAY_STONE_STAIRS = BLOCKS.register("gray_stone_stairs",() -> new StairsBlock(() -> BlockInit.GRAY_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.GRAY_STONE.get())));
    public static final RegistryObject<StairsBlock> PINK_STONE_STAIRS = BLOCKS.register("pink_stone_stairs",() -> new StairsBlock(() -> BlockInit.PINK_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.PINK_STONE.get())));
    public static final RegistryObject<StairsBlock> LIME_STONE_STAIRS = BLOCKS.register("lime_stone_stairs",() -> new StairsBlock(() -> BlockInit.LIME_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.LIME_STONE.get())));
    public static final RegistryObject<StairsBlock> YELLOW_STONE_STAIRS = BLOCKS.register("yellow_stone_stairs",() -> new StairsBlock(() -> BlockInit.YELLOW_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.YELLOW_STONE.get())));
    public static final RegistryObject<StairsBlock> LIGHT_BLUE_STONE_STAIRS = BLOCKS.register("light_blue_stone_stairs",() -> new StairsBlock(() -> BlockInit.LIGHT_BLUE_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.LIGHT_BLUE_STONE.get())));
    public static final RegistryObject<StairsBlock> MAGENTA_STONE_STAIRS = BLOCKS.register("magenta_stone_stairs",() -> new StairsBlock(() -> BlockInit.MAGENTA_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.MAGENTA_STONE.get())));
    public static final RegistryObject<StairsBlock> ORANGE_STONE_STAIRS = BLOCKS.register("orange_stone_stairs",() -> new StairsBlock(() -> BlockInit.ORANGE_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.ORANGE_STONE.get())));
    public static final RegistryObject<StairsBlock> WHITE_STONE_STAIRS = BLOCKS.register("white_stone_stairs",() -> new StairsBlock(() -> BlockInit.WHITE_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.WHITE_STONE.get())));

    //Colored Stone Pressure Plate

    //Colored Stone Button

    //Colored Cobblestone
    public static final RegistryObject<Block> BLACK_COBBLESTONE = BLOCKS.register("black_cobblestone",() -> new Block(AbstractBlock.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> RED_COBBLESTONE = BLOCKS.register("red_cobblestone",() -> new Block(AbstractBlock.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> GREEN_COBBLESTONE = BLOCKS.register("green_cobblestone",() -> new Block(AbstractBlock.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> BROWN_COBBLESTONE = BLOCKS.register("brown_cobblestone",() -> new Block(AbstractBlock.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> BLUE_COBBLESTONE = BLOCKS.register("blue_cobblestone",() -> new Block(AbstractBlock.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> PURPLE_COBBLESTONE = BLOCKS.register("purple_cobblestone",() -> new Block(AbstractBlock.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> CYAN_COBBLESTONE = BLOCKS.register("cyan_cobblestone",() -> new Block(AbstractBlock.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIGHT_GRAY_COBBLESTONE = BLOCKS.register("light_gray_cobblestone",() -> new Block(AbstractBlock.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> GRAY_COBBLESTONE = BLOCKS.register("gray_cobblestone",() -> new Block(AbstractBlock.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> PINK_COBBLESTONE = BLOCKS.register("pink_cobblestone",() -> new Block(AbstractBlock.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIME_COBBLESTONE = BLOCKS.register("lime_cobblestone",() -> new Block(AbstractBlock.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> YELLOW_COBBLESTONE = BLOCKS.register("yellow_cobblestone",() -> new Block(AbstractBlock.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIGHT_BLUE_COBBLESTONE = BLOCKS.register("light_blue_cobblestone",() -> new Block(AbstractBlock.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> MAGENTA_COBBLESTONE = BLOCKS.register("magenta_cobblestone",() -> new Block(AbstractBlock.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> ORANGE_COBBLESTONE = BLOCKS.register("orange_cobblestone",() -> new Block(AbstractBlock.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> WHITE_COBBLESTONE = BLOCKS.register("white_cobblestone",() -> new Block(AbstractBlock.Properties.copy(Blocks.COBBLESTONE)));

    //Colored Cobblestone Slab
    public static final RegistryObject<SlabBlock> BLACK_COBBLESTONE_SLAB = BLOCKS.register("black_cobblestone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.BLACK_COBBLESTONE.get())));
    public static final RegistryObject<SlabBlock> RED_COBBLESTONE_SLAB = BLOCKS.register("red_cobblestone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.RED_COBBLESTONE.get())));
    public static final RegistryObject<SlabBlock> GREEN_COBBLESTONE_SLAB = BLOCKS.register("green_cobblestone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.GREEN_COBBLESTONE.get())));
    public static final RegistryObject<SlabBlock> BROWN_COBBLESTONE_SLAB = BLOCKS.register("brown_cobblestone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.BROWN_COBBLESTONE.get())));
    public static final RegistryObject<SlabBlock> BLUE_COBBLESTONE_SLAB = BLOCKS.register("blue_cobblestone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.BLUE_COBBLESTONE.get())));
    public static final RegistryObject<SlabBlock> PURPLE_COBBLESTONE_SLAB = BLOCKS.register("purple_cobblestone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.PURPLE_COBBLESTONE.get())));
    public static final RegistryObject<SlabBlock> CYAN_COBBLESTONE_SLAB = BLOCKS.register("cyan_cobblestone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.CYAN_COBBLESTONE.get())));
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_COBBLESTONE_SLAB = BLOCKS.register("light_gray_cobblestone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.LIGHT_GRAY_COBBLESTONE.get())));
    public static final RegistryObject<SlabBlock> GRAY_COBBLESTONE_SLAB = BLOCKS.register("gray_cobblestone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.GRAY_COBBLESTONE.get())));
    public static final RegistryObject<SlabBlock> PINK_COBBLESTONE_SLAB = BLOCKS.register("pink_cobblestone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.PINK_COBBLESTONE.get())));
    public static final RegistryObject<SlabBlock> LIME_COBBLESTONE_SLAB = BLOCKS.register("lime_cobblestone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.LIME_COBBLESTONE.get())));
    public static final RegistryObject<SlabBlock> YELLOW_COBBLESTONE_SLAB = BLOCKS.register("yellow_cobblestone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.YELLOW_COBBLESTONE.get())));
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_COBBLESTONE_SLAB = BLOCKS.register("light_blue_cobblestone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.LIGHT_BLUE_COBBLESTONE.get())));
    public static final RegistryObject<SlabBlock> MAGENTA_COBBLESTONE_SLAB = BLOCKS.register("magenta_cobblestone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.MAGENTA_COBBLESTONE.get())));
    public static final RegistryObject<SlabBlock> ORANGE_COBBLESTONE_SLAB = BLOCKS.register("orange_cobblestone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.ORANGE_COBBLESTONE.get())));
    public static final RegistryObject<SlabBlock> WHITE_COBBLESTONE_SLAB = BLOCKS.register("white_cobblestone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.WHITE_COBBLESTONE.get())));

    //Colored Cobblestone Stairs
    public static final RegistryObject<StairsBlock> BLACK_COBBLESTONE_STAIRS = BLOCKS.register("black_cobblestone_stairs",() -> new StairsBlock(() -> BlockInit.BLACK_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.BLACK_COBBLESTONE.get())));
    public static final RegistryObject<StairsBlock> RED_COBBLESTONE_STAIRS = BLOCKS.register("red_cobblestone_stairs",() -> new StairsBlock(() -> BlockInit.RED_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.RED_COBBLESTONE.get())));
    public static final RegistryObject<StairsBlock> GREEN_COBBLESTONE_STAIRS = BLOCKS.register("green_cobblestone_stairs",() -> new StairsBlock(() -> BlockInit.GREEN_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.GREEN_COBBLESTONE.get())));
    public static final RegistryObject<StairsBlock> BROWN_COBBLESTONE_STAIRS = BLOCKS.register("brown_cobblestone_stairs",() -> new StairsBlock(() -> BlockInit.BROWN_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.BROWN_COBBLESTONE.get())));
    public static final RegistryObject<StairsBlock> BLUE_COBBLESTONE_STAIRS = BLOCKS.register("blue_cobblestone_stairs",() -> new StairsBlock(() -> BlockInit.BLUE_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.BLUE_COBBLESTONE.get())));
    public static final RegistryObject<StairsBlock> PURPLE_COBBLESTONE_STAIRS = BLOCKS.register("purple_cobblestone_stairs",() -> new StairsBlock(() -> BlockInit.PURPLE_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.PURPLE_COBBLESTONE.get())));
    public static final RegistryObject<StairsBlock> CYAN_COBBLESTONE_STAIRS = BLOCKS.register("cyan_cobblestone_stairs",() -> new StairsBlock(() -> BlockInit.CYAN_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.CYAN_COBBLESTONE.get())));
    public static final RegistryObject<StairsBlock> LIGHT_GRAY_COBBLESTONE_STAIRS = BLOCKS.register("light_gray_cobblestone_stairs",() -> new StairsBlock(() -> BlockInit.LIGHT_GRAY_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.LIGHT_GRAY_COBBLESTONE.get())));
    public static final RegistryObject<StairsBlock> GRAY_COBBLESTONE_STAIRS = BLOCKS.register("gray_cobblestone_stairs",() -> new StairsBlock(() -> BlockInit.GRAY_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.GRAY_COBBLESTONE.get())));
    public static final RegistryObject<StairsBlock> PINK_COBBLESTONE_STAIRS = BLOCKS.register("pink_cobblestone_stairs",() -> new StairsBlock(() -> BlockInit.PINK_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.PINK_COBBLESTONE.get())));
    public static final RegistryObject<StairsBlock> LIME_COBBLESTONE_STAIRS = BLOCKS.register("lime_cobblestone_stairs",() -> new StairsBlock(() -> BlockInit.LIME_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.LIME_COBBLESTONE.get())));
    public static final RegistryObject<StairsBlock> YELLOW_COBBLESTONE_STAIRS = BLOCKS.register("yellow_cobblestone_stairs",() -> new StairsBlock(() -> BlockInit.YELLOW_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.YELLOW_COBBLESTONE.get())));
    public static final RegistryObject<StairsBlock> LIGHT_BLUE_COBBLESTONE_STAIRS = BLOCKS.register("light_blue_cobblestone_stairs",() -> new StairsBlock(() -> BlockInit.LIGHT_BLUE_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.LIGHT_BLUE_COBBLESTONE.get())));
    public static final RegistryObject<StairsBlock> MAGENTA_COBBLESTONE_STAIRS = BLOCKS.register("magenta_cobblestone_stairs",() -> new StairsBlock(() -> BlockInit.MAGENTA_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.MAGENTA_COBBLESTONE.get())));
    public static final RegistryObject<StairsBlock> ORANGE_COBBLESTONE_STAIRS = BLOCKS.register("orange_cobblestone_stairs",() -> new StairsBlock(() -> BlockInit.ORANGE_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.ORANGE_COBBLESTONE.get())));
    public static final RegistryObject<StairsBlock> WHITE_COBBLESTONE_STAIRS = BLOCKS.register("white_cobblestone_stairs",() -> new StairsBlock(() -> BlockInit.WHITE_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.WHITE_COBBLESTONE.get())));

    //Colored Cobblestone Wall

    //Test Objects
    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block",() -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<StairsBlock> TEST_STAIRS = BLOCKS.register("test_stairs",() -> new StairsBlock(() -> BlockInit.TEST_BLOCK.get().defaultBlockState(), AbstractBlock.Properties.copy(BlockInit.TEST_BLOCK.get())));
    public static final RegistryObject<SlabBlock> TEST_SLAB = BLOCKS.register("test_slab",() -> new SlabBlock(AbstractBlock.Properties.copy(BlockInit.TEST_BLOCK.get())));
}
