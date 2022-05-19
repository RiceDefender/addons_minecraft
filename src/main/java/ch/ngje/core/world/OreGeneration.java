package ch.ngje.core.world;

import ch.ngje.TutorialMod;
import ch.ngje.core.init.Blockinit;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.ArrayList;
import java.util.List;

public class OreGeneration {
/*
    public static final List<ConfiguredFeature<?,?>> OVERWORLD_ORES = new ArrayList<>();
    public static final List<ConfiguredFeature<?,?>> NETHER_ORES = new ArrayList<>();
    public static final List<ConfiguredFeature<?,?>> END_ORES = new ArrayList<>();

    public static final RuleTest END_TEST = new BlockMatchTest(Blocks.END_STONE);

    public static void registerOres(){
        ConfiguredFeature<?,?> copiumOre = Feature.ORE
                .configured(new OreConfiguration(List.of
                (OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES,
                        Blockinit.EXAMPLE_BLOCK.get().defaultBlockState())),11))
                .rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(40).squared().count(100));

        OVERWORLD_ORES.add(register("copium_ore",copiumOre));
    }

    private static <Config extends FeatureConfiguration> ConfiguredFeature<Config, ?> register(String name, ConfiguredFeature<Config, ?> configuredFeature){
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(TutorialMod.modid, name),
                configuredFeature);
    }

 */
}

//public static class()
