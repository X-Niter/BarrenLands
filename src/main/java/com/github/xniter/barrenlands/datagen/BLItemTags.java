package com.github.xniter.barrenlands.datagen;

import com.github.xniter.barrenlands.Barrenlands;
import com.github.xniter.barrenlands.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class BLItemTags extends ItemTagsProvider {

    public BLItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper fileHelper) {
        super(generator, blockTags, Barrenlands.MOD_ID, fileHelper);
    }

    @Override
    protected void addTags() {
        tag(ItemTags.DIRT)
                .add(Registry.BARREN_LAND_ITEM.get());
    }

    @Override
    public String getName() {
        return "Barren Tags";
    }
}
