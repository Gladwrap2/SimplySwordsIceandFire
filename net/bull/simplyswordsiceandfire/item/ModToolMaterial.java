package net.bull.simplyswordsicrandfire.item;

import com.github.alexthe666.iceandfire.item;
import com.google.common.base.Suppliers;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.sweenus.simplyswords.registry.ItemsRegistry;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    DRAGONSTEEL_FIRE(MiningLevels.NETHERITE, 8000, 11.0f, 5.0f, 30, Items.DRAGONSTEEL_FIRE_INGOT),
    DRAGONSTEEL_ICE(MiningLevels.NETHERITE, 8000, 11.0f, 5.0f, 30, Items.DRAGONSTEEL_ICE_INGOT),
    //DRAGONSTEEL_LIGHTNING(MiningLevels.NETHERITE, 8000, 11.0f, 5.0f, 30, Items.DRAGONSTEEL_LIGHTNING_INGOT),
  
    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Item... repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(() -> Ingredient.ofItems(repairIngredient));
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
