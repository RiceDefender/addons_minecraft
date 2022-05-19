package ch.ngje.core.init;

import ch.ngje.TutorialMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class Blockinit {
    public Blockinit() {
    }

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.modid);

    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.TERRACOTTA_BLUE)
                    .strength(5.0F, 3.0F).requiresCorrectToolForDrops().friction(0.5f)));

    // this is the block for Remium the resource of remium ingots for the hammer.
    public static final RegistryObject<Block> REMIUM_ORE = BLOCKS.register("remium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().destroyTime(10f).friction(0.5f)));
}
