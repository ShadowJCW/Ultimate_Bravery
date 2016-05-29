package me.pandaism.UltimateBravery.Base;

import me.pandaism.UltimateBravery.Resources.Items;

/**
 * Created by Pandaism on 5/28/2016.
 */
public class Jungle extends Items{

    private int enchantment;

    public Jungle(String name, boolean stackable, int enchantment) {
        super(name, stackable);
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
