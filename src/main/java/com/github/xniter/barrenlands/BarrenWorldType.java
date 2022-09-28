package com.github.xniter.barrenlands;

//@Mod("barrenlands")
public class BarrenWorldType {

//    @ObjectHolder("forge_world_type_barren:barren_world_type")
//    public static ForgeWorldPreset barrenWorldType;
//
//    public BarrenWorldType() {
//        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(ForgeWorldPreset.class, this::registerWorldTypes);
//    }
//
//    private void registerWorldTypes(RegistryEvent.Register<ForgeWorldPreset> event)
//    {
//        event.getRegistry().registerAll(
//                new ForgeWorldPreset(WorldGenSettings::makeDefaultOverworld).setRegistryName("barren_world_type")
//        );
//        event.getRegistry().registerAll(
//                new ForgeWorldPreset(this::createChunkGenerator).setRegistryName("barren_world_type2")
//        );
//    }
//
//    private ChunkGenerator createChunkGenerator(RegistryAccess registry, long seed, String settings)
//    {
//        return WorldGenSettings.makeDefaultOverworld(registry, seed);
//    }
//
//    @Mod.EventBusSubscriber(modid = Barrenlands.MOD_ID, value=Dist.CLIENT, bus= Mod.EventBusSubscriber.Bus.MOD)
//    public static class ForgeWorldTypeTestClientModEvents
//    {
//        @SubscribeEvent
//        public static void registerWorldTypeScreenFactories(FMLClientSetupEvent event)
//        {
//            ForgeWorldPresetScreens.registerPresetEditor(barrenWorldType, (returnTo, dimensionGeneratorSettings) -> new Screen(barrenWorldType.getDisplayName())
//            {
//                @Override
//                protected void init()
//                {
//                    super.init();
//
//                    addRenderableWidget(new Button(0, 0, 120, 20, new TextComponent("close"), btn -> {
//                        Minecraft.getInstance().setScreen(returnTo);
//                    }));
//                }
//            });
//        }
//    }
}
