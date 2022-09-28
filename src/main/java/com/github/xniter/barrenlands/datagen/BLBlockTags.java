package com.github.xniter.barrenlands.datagen;

import com.github.xniter.barrenlands.Barrenlands;
import com.github.xniter.barrenlands.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class BLBlockTags extends BlockTagsProvider {

    public BLBlockTags(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, Barrenlands.MOD_ID, fileHelper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.DIRT)
                .add(Registry.BARREN_LAND.get());
    }

    @Override
    public String getName() {
        return "Barren Tags";
    }
}
