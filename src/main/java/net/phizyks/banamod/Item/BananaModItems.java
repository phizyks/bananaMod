package net.phizyks.banamod.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.phizyks.banamod.BananaMod;
import net.phizyks.banamod.Item.Custom.Banana;

public class BananaModItems {

    public static final Item BANANA = registerItem("banana",
            new Banana(new FabricItemSettings().group(BananaModItemGroup.BANANA).food(BananaModFoodComponents.BANANA)));

    public static final Item BANANA_PEEL = registerItem("banana_peel",
            new Item(new FabricItemSettings().group(BananaModItemGroup.BANANA)));

    public static final Item BANANA_SEED = registerItem("banana_seed",
            new Item(new FabricItemSettings().group(BananaModItemGroup.BANANA)));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BananaMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BananaMod.LOGGER.debug("Registering Mod Items for" + BananaMod.MOD_ID);
    }
}
