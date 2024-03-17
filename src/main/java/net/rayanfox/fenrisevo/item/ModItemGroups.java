package net.rayanfox.fenrisevo.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rayanfox.fenrisevo.Fenrisevolution;

public class ModItemGroups {
public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(Fenrisevolution.MOD_ID, "ruby" ),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                    entries.add(ModItems.RUBY);
                    entries.add(ModItems.RAW_RUBY);

                }).build());
    public static void registerItemGroups(){

    Fenrisevolution.LOGGER.info("registering Item Groups for " +Fenrisevolution.MOD_ID);
    }
}
