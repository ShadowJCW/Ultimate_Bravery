package me.pandaism.UltimateBravery.Items.Equipments;

import me.pandaism.UltimateBravery.Items.Item;

/**
 * Created by Pandaism on 5/28/2016.
 */
public class Jungle extends Item {

    private int enchantment;

    public Jungle(String name, boolean stackable, int cost, int enchantment) {
        super(name, stackable, cost);
        this.enchantment = enchantment;
    }

    public String getEnchantment() {
        switch (enchantment) {
            case 1:
                return "Warrior";
            case 2:
                return "Cinderhulk";
            case 3:
                return "Runic Echoes";
            case 4:
                return "Bloodrazor";
            default:
                return "Invalid";

        }
    }
}
