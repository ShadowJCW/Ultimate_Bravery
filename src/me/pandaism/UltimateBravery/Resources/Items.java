package me.pandaism.UltimateBravery.Resources;

/**
 * Created by Pandaism on 5/27/2016.
 */
public class Items {
    private String name;
    private boolean stackable;

    public Items(String name, boolean stackable) {
        this.name = name;
        this.stackable = stackable;
    }

    public boolean getStackable() {
        return stackable;
    }

    public String getName() {
        return name;
    }
}
