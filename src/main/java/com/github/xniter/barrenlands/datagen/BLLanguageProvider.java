package com.github.xniter.barrenlands.datagen;

import com.github.xniter.barrenlands.Barrenlands;
import com.github.xniter.barrenlands.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class BLLanguageProvider extends LanguageProvider {

    public BLLanguageProvider(DataGenerator generator, String local) {
        super(generator, Barrenlands.MOD_ID, local);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + Barrenlands.BARREN_TAB, "Barren Lands");

        add(Registry.BARREN_LAND.get(), "Barren Land");
    }

}
