package com.github.xniter.barrenlands.datagen;

import com.github.xniter.barrenlands.Barrenlands;
import com.github.xniter.barrenlands.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BLBlockStates extends BlockStateProvider {

    public BLBlockStates(DataGenerator gen, ExistingFileHelper fileHelper) {
        super(gen, Barrenlands.MOD_ID, fileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registry.BARREN_LAND.get());
    }
}
