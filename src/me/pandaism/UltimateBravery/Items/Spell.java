package me.pandaism.UltimateBravery.Items;

/**
 * Created by Pandaism on 5/31/2016.
 */
public class Spell {

    private String name;
    private String picture;

    public Spell(String name, String picture) {
        this.name = name;
        this.picture = picture;
    }

    public String getName() {
        return this.name;
    }

    public String getPicture() {
        return this.picture;
    }
}
