package ch.ngje;

import ch.ngje.core.init.Blockinit;
import ch.ngje.core.init.Iteminit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TutorialMod.modid)
public class TutorialMod {
    public static final String modid = "addons";

    public TutorialMod(){
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        Blockinit.BLOCKS.register(bus);
        Iteminit.items.register(bus);
    }

    public static final CreativeModeTab ADDONS_TAB = new CreativeModeTab(modid) {
        @Override
        public ItemStack makeIcon() {
            return Iteminit.EXAMPLE_BLOCK_ITEM.get().getDefaultInstance();
        }
    };
}
