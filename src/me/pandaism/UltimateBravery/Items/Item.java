package me.pandaism.UltimateBravery.Items;

/**
 * Created by Pandaism on 5/27/2016.
 */
public class Item {
    private String name;
    private boolean stackable;
    private int cost;

    public Item(String name, boolean stackable, int cost) {
        this.name = name;
        this.stackable = stackable;
        this.cost = cost;
    }

    public boolean getStackable() {
        return stackable;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}
