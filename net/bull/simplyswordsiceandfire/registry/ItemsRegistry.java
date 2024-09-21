package net.bull.simplyswordsiceandfire.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Rarity;
import net.bull.simplyswordsiceandfire.SimplySwords;
import net.sweenus.simplyswords.config.Config;
import net.sweenus.simplyswords.config.ConfigDefaultValues;
import net.bull.simplyswordsiceandfire.item.*;

public class ItemsRegistry {
  
    static float dragonsteel_modifier = Config.getFloat("dragonsteel_damageModifier", "WeaponAttributes", ConfigDefaultValues.dragonsteel_damageModifier);
  
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(SimplySwordsIceandFire.MOD_ID, RegistryKeys.ITEM);
  
    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_FIRE_TWINBLADE = ITEM.register( "dragonsteel_fire_twinblade", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + twinblade_positive_modifier - twinblade_negative_modifier),
                    twinblade_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE).fireproof()));

    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_FIRE_RAPIER = ITEM.register( "dragonsteel_fire_rapier", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + rapier_positive_modifier - rapier_negative_modifier),
                    rapier_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE).fireproof()));

    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_FIRE_KATANA = ITEM.register( "dragonsteel_fire_katana", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + katana_positive_modifier - katana_negative_modifier),
                    katana_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE).fireproof()));

    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_FIRE_SPEAR = ITEM.register( "dragonsteel_fire_spear", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + spear_positive_modifier - spear_negative_modifier),
                    spear_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)));

    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_FIRE_GLAIVE = ITEM.register( "dragonsteel_fire_glaive", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + glaive_positive_modifier - glaive_negative_modifier),
                    glaive_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE).fireproof()));
  
    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_FIRE_CLAYMORE = ITEM.register( "dragonsteel_fire_claymore", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + claymore_positive_modifier - claymore_negative_modifier),
                    claymore_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE).fireproof()));

    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_FIRE_GREATAXE = ITEM.register( "dragonsteel_fire_greataxe", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + greataxe_positive_modifier - greataxe_negative_modifier),
                    greataxe_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE).fireproof()));

    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_FIRE_SCYTHE = ITEM.register( "dragonsteel_fire_scythe", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + scythe_positive_modifier - scythe_negative_modifier),
                    scythe_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE).fireproof()));

    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_FIRE_HALBERD = ITEM.register( "dragonsteel_fire_halberd", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + halberd_positive_modifier - halberd_negative_modifier),
                    halberd_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE).fireproof()));
  
    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_ICE_TWINBLADE = ITEM.register( "dragonsteel_ice_twinblade", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + twinblade_positive_modifier - twinblade_negative_modifier),
                    twinblade_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE).fireproof()));

    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_ICE_RAPIER = ITEM.register( "dragonsteel_ice_rapier", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + rapier_positive_modifier - rapier_negative_modifier),
                    rapier_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE).fireproof()));

    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_ICE_KATANA = ITEM.register( "dragonsteel_ice_katana", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + katana_positive_modifier - katana_negative_modifier),
                    katana_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE).fireproof()));

    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_ICE_SPEAR = ITEM.register( "dragonsteel_ice_spear", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + spear_positive_modifier - spear_negative_modifier),
                    spear_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE)));

    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_ICE_GLAIVE = ITEM.register( "dragonsteel_ice_glaive", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + glaive_positive_modifier - glaive_negative_modifier),
                    glaive_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE).fireproof()));
  
    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_ICE_CLAYMORE = ITEM.register( "dragonsteel_ice_claymore", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + claymore_positive_modifier - claymore_negative_modifier),
                    claymore_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE).fireproof()));

    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_ICE_GREATAXE = ITEM.register( "dragonsteel_ice_greataxe", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + greataxe_positive_modifier - greataxe_negative_modifier),
                    greataxe_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE).fireproof()));

    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_ICE_SCYTHE = ITEM.register( "dragonsteel_ice_scythe", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + scythe_positive_modifier - scythe_negative_modifier),
                    scythe_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE).fireproof()));

    public static final RegistrySupplier<DragonsteelSwordItem> DRAGONSTEEL_ICE_HALBERD = ITEM.register( "dragonsteel_ice_halberd", () ->
            new DragonsteelSwordItem(ModToolMaterial.RUNIC,
                    (int) (runic_modifier + halberd_positive_modifier - halberd_negative_modifier),
                    halberd_attackspeed,
                    new Item.Settings().arch$tab(SimplySwords.SIMPLYSWORDS).rarity(Rarity.RARE).fireproof()));


}
