package me.pandaism.UltimateBravery.Items;

import me.pandaism.UltimateBravery.Items.Spells.SummonerSpells;

/**
 * Created by Pandaism on 5/31/2016.
 */
public class InitSummonSpells {

    public SummonerSpells barrier;
    public SummonerSpells cleanse;
    public SummonerSpells exhaust;
    public SummonerSpells flash;
    public SummonerSpells ghost;
    public SummonerSpells heal;
    public SummonerSpells ignite;
    public SummonerSpells smite;
    public SummonerSpells teleport;

    public InitSummonSpells() {
        barrier = new SummonerSpells("Barrier", "");
        cleanse = new SummonerSpells("Cleanse", "");
        exhaust = new SummonerSpells("Exhaust", "");
        flash = new SummonerSpells("Flash", "");
        ghost = new SummonerSpells("Ghost", "");
        heal = new SummonerSpells("Heal", "");
        ignite = new SummonerSpells("Ignite", "");
        smite = new SummonerSpells("Smite", "");
        teleport = new SummonerSpells("Teleport", "");
    }
}
