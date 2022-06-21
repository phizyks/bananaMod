package net.phizyks.banamod.Item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.phizyks.banamod.BananaMod;

public class BananaModItemGroup {
    public static final ItemGroup BANANA = FabricItemGroupBuilder.build(new Identifier(BananaMod.MOD_ID, "banana"), ()-> new ItemStack(BananaModItems.BANANA));
}
