package com.github.xniter.barrenlands.datagen;

import com.github.xniter.barrenlands.Barrenlands;
import com.github.xniter.barrenlands.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Objects;

public class BLItemModels extends ItemModelProvider {

    public BLItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Barrenlands.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registry.BARREN_LAND_ITEM.get().getRegistryName().getPath(), modLoc("block/barren_land"));
    }
}
