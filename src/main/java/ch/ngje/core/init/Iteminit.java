package ch.ngje.core.init;

import ch.ngje.TutorialMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class Iteminit {
    public Iteminit() {
    }
    public static final DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.modid);

    public static final RegistryObject<Item> example_item = items.register("example_item",
            () -> new Item(new Item.Properties().tab(TutorialMod.ADDONS_TAB).fireResistant()));

    //Block Items
    public static final RegistryObject<BlockItem> EXAMPLE_BLOCK_ITEM = items.register("example_block",
            () -> new BlockItem(Blockinit.EXAMPLE_BLOCK.get(),
                    new Item.Properties().tab(TutorialMod.ADDONS_TAB).fireResistant()));
}
