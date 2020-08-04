package com.infiniteleagues.titanium.util;

import com.infiniteleagues.titanium.armour.ModArmorMaterial;
import com.infiniteleagues.titanium.items.Biryani;
import com.infiniteleagues.titanium.items.ItemBase;
import com.infiniteleagues.titanium.titanium;
import com.infiniteleagues.titanium.tools.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, titanium.MOD_ID);

    public static void Init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //THIS IS FOR ITEMS ONLY
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register( "titanium_ingot", ItemBase::new);
    public static final RegistryObject<Biryani> BIRYANI = ITEMS.register("biryani", Biryani::new);

    //TOOLS ONLY

    public static final RegistryObject<SwordItem> TITANIUM_SWORD = ITEMS.register("titanium_sword", () ->
            new SwordItem(ModItemTier.TITANIUM_INGOT, 2, -1F, new Item.Properties().group(titanium.TAB)));
    public static final RegistryObject<PickaxeItem> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe", () ->
            new PickaxeItem(ModItemTier.TITANIUM_INGOT, 2, -1F, new Item.Properties().group(titanium.TAB)));
    public static final RegistryObject<AxeItem> TITANIUM_AXE = ITEMS.register("titanium_axe", () ->
            new AxeItem(ModItemTier.TITANIUM_INGOT, 4, -1F, new Item.Properties().group(titanium.TAB)));
    public static final RegistryObject<ShovelItem> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel", () ->
            new ShovelItem(ModItemTier.TITANIUM_INGOT, 2, -1F, new Item.Properties().group(titanium.TAB)));

    //Armor Only
    public static final RegistryObject<ArmorItem> TITANIUM_HELMET = ITEMS.register("titanium_helmet", () ->
            new ArmorItem(ModArmorMaterial.TITANIUM_INGOT, EquipmentSlotType.HEAD, new Item.Properties().group(titanium.TAB)));
    public static final RegistryObject<ArmorItem> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate", () ->
            new ArmorItem(ModArmorMaterial.TITANIUM_INGOT, EquipmentSlotType.CHEST, new Item.Properties().group(titanium.TAB)));
    public static final RegistryObject<ArmorItem> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings", () ->
            new ArmorItem(ModArmorMaterial.TITANIUM_INGOT, EquipmentSlotType.LEGS, new Item.Properties().group(titanium.TAB)));
    public static final RegistryObject<ArmorItem> TITANIUM_BOOTS = ITEMS.register("titanium_boots", () ->
            new ArmorItem(ModArmorMaterial.TITANIUM_INGOT, EquipmentSlotType.FEET, new Item.Properties().group(titanium.TAB)));













}    


