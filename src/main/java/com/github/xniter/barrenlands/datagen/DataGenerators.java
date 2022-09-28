package com.github.xniter.barrenlands.datagen;

import com.github.xniter.barrenlands.Barrenlands;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Barrenlands.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            //generator.addProvider(new BLRecipes(generator));
            //generator.addProvider(new BLLootTables(generator));
            BLBlockTags blockTags = new BLBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(new BLItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new BLBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new BLItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new BLLanguageProvider(generator, "en_us"));
        }
    }
}
