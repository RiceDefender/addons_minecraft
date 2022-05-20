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
<<<<<<< HEAD
                    new Item.Properties().tab(TutorialMod.ADDONS_TAB).fireResistant()));
=======
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS).fireResistant()));

    // this is the item for Remium the resource of remium ingots for the hammer.
    public static final RegistryObject<BlockItem> REMIUM_ORE_ITEM = items.register("remium_ore",
            () -> new BlockItem(Blockinit.REMIUM_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
>>>>>>> 6e1239700a11ce91b9b4e9f644ad9369a6fb174a
}
