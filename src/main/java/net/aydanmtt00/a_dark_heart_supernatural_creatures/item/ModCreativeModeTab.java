package net.aydanmtt00.a_dark_heart_supernatural_creatures.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab A_DARK_HEART_SUPERNATURAL_CREATURES_TAB = new CreativeModeTab("adarkheartsupernaturalcreaturestab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SILVER.get());
        }
    };
}
