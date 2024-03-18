package net.rayanfox.fenrisevo.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rayanfox.fenrisevo.Fenrisevolution;
import net.rayanfox.fenrisevo.block.ModBlocks;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    public static final Item FENITE = registerItem("fenite", new Item(new FabricItemSettings()));
    public static final Item FENITE_INGOT = registerItem("fenite_ingot", new Item(new FabricItemSettings()));
    public static final Item PINK_POW = registerItem("pink_pow", new Item(new FabricItemSettings()));
    public static final Item DEBUG = registerItem("debug", new Item(new FabricItemSettings()));
    public static final Item FENITE_NUGGET = registerItem("fenite_nugget", new Item(new FabricItemSettings()));


    private static void addItemsToIngrendientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(RUBY);
        entries.add(RAW_RUBY);
        entries.add(FENITE);
        entries.add(ModBlocks.RUBY_BLOCK);
        entries.add(ModBlocks.RAW_RUBY_BLOCK);

    }
    private static Item registerItem(String name, Item item){
return Registry.register(Registries.ITEM, new Identifier(Fenrisevolution.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Fenrisevolution.LOGGER.info("Registering Mod Items for " + Fenrisevolution.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngrendientTabItemGroup);
    }
}
