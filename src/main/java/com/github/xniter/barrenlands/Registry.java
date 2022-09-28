package com.github.xniter.barrenlands;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Barrenlands.MOD_ID);

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Barrenlands.MOD_ID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
        BLOCKS.register(bus);
    }

    // CREATIVE TAB
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(Barrenlands.BARREN_TAB);

    public static final RegistryObject<Block> BARREN_LAND = BLOCKS.register("barren_land",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_BROWN).strength(1)
                    .sound(SoundType.GRASS)));

    public static final RegistryObject<Item> BARREN_LAND_ITEM = fromBlock(BARREN_LAND);

    public static final ResourceLocation BARRENLANDS_DIMENSION_SET = new ResourceLocation(Barrenlands.MOD_ID, "barrenlands_dimension_structure_set");

    public static <T extends  Block> RegistryObject<Item> fromBlock(RegistryObject<T> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
