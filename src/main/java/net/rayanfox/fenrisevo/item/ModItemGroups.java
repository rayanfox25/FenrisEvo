package net.rayanfox.fenrisevo.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rayanfox.fenrisevo.Fenrisevolution;
import net.rayanfox.fenrisevo.block.ModBlocks;

public class ModItemGroups {
public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(Fenrisevolution.MOD_ID, "ruby" ),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

                    //items
                    entries.add(ModItems.DEBUG);
                    entries.add(ModItems.RUBY);
                    entries.add(ModItems.RAW_RUBY);
                    entries.add(ModItems.FENITE);
                    entries.add(ModItems.PINK_POW);
                    entries.add(ModItems.FENITE_INGOT);
                    entries.add(ModItems.FENITE_NUGGET);



                    //blocks

                    entries.add(ModBlocks.RUBY_BLOCK);
                    entries.add(ModBlocks.FENITE_ORE);
                    entries.add(ModBlocks.RAW_RUBY_BLOCK);
                    entries.add(ModBlocks.FENITE_BlOCK);
                    entries.add(ModBlocks.PINK_BlOCK);
                    entries.add(ModBlocks.CRYSTAL_BlOCK);
                    entries.add(ModBlocks.FENITE_BlOCK_DECO);



                }).build());
    public static void registerItemGroups(){

    Fenrisevolution.LOGGER.info("registering Item Groups for " +Fenrisevolution.MOD_ID);
    }
}
