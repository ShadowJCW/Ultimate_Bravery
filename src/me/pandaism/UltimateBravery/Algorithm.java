package me.pandaism.UltimateBravery;

import me.pandaism.UltimateBravery.Items.InitItems;
import me.pandaism.UltimateBravery.Items.InitSummonSpells;
import me.pandaism.UltimateBravery.Items.Item;
import me.pandaism.UltimateBravery.Items.Spells.SummonerSpells;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Pandaism on 5/29/2016.
 */
public class Algorithm {
    private static InitItems items;
    private static InitSummonSpells summonerSpells;

    private static ArrayList<Item> inventory;
    private static ArrayList<SummonerSpells> spells;

    private static ArrayList<Item> allItems = new ArrayList<>();
    private static ArrayList<Item> boots = new ArrayList<>();
    private static ArrayList<Item> jungles = new ArrayList<>();
    private static ArrayList<Item> supports = new ArrayList<>();

    private static ArrayList<SummonerSpells> summonerSpellsArray = new ArrayList<>();

    private static void arrayItems() {
        allItems.add(items.abyssalS);
        allItems.add(items.ardentC);
        allItems.add(items.atheneU);
        allItems.add(items.bannerC);
        allItems.add(items.bansheeV);
        allItems.add(items.bork);
        allItems.add(items.deadMan);
        allItems.add(items.deathDance);
        allItems.add(items.duskblade);
        allItems.add(items.frozenH);
        allItems.add(items.frozenM);
        allItems.add(items.guardianA);
        allItems.add(items.guinsooR);
        allItems.add(items.hextechGLP);
        allItems.add(items.hextechGun);
        allItems.add(items.hextechProto);
        allItems.add(items.icebornG);
        allItems.add(items.infinityE);
        allItems.add(items.liandryT);
        allItems.add(items.lichB);
        allItems.add(items.locketIS);
        allItems.add(items.lordD);
        allItems.add(items.ludenE);
        allItems.add(items.mawM);
        allItems.add(items.mejaiS);
        allItems.add(items.mercurialS);
        allItems.add(items.mikaelC);
        allItems.add(items.morellonomicon);
        allItems.add(items.mortalR);
        allItems.add(items.muramana);
        allItems.add(items.nashorT);
        allItems.add(items.ohmwrecker);
        allItems.add(items.phantomD);
        allItems.add(items.rabadonD);
        allItems.add(items.randuinO);
        allItems.add(items.rapidF);
        allItems.add(items.ravenousH);
        allItems.add(items.righteousG);
        allItems.add(items.rodA);
        allItems.add(items.rubyS);
        allItems.add(items.runaanH);
        allItems.add(items.rylaiC);
        allItems.add(items.seraphE);
        allItems.add(items.spiritV);
        allItems.add(items.statikkS);
        allItems.add(items.sterakG);
        allItems.add(items.sunfireC);
        allItems.add(items.blackC);
        allItems.add(items.bloodthirster);
        allItems.add(items.thornmail);
        allItems.add(items.titanicH);
        allItems.add(items.trinityF);
        allItems.add(items.voidS);
        allItems.add(items.warmogsA);
        allItems.add(items.witE);
        allItems.add(items.youmuuG);
        allItems.add(items.zekeH);
        allItems.add(items.zhonyaH);
        allItems.add(items.zzrotP);
    }

    private static void arrayJungle() {
        jungles.add(items.skirmisherS);
        jungles.add(items.stalkerB);
        jungles.add(items.trackerK);

    }

    private static void arrayBoots() {
        boots.add(items.berserkerG);
        boots.add(items.mobilityB);
        boots.add(items.swiftnessB);
        boots.add(items.ionianB);
        boots.add(items.ninjaB);
        boots.add(items.mercuryB);
        boots.add(items.sorcererB);
    }

    private static void arraySupport() {
        supports.add(items.eyeofE);
        supports.add(items.eyeofO);
        supports.add(items.eyeofW);
        supports.add(items.faceM);
        supports.add(items.frostQ);
        supports.add(items.talismanA);
    }

    private static void arraySummonerSpell() {
        summonerSpellsArray.add(summonerSpells.barrier);
        summonerSpellsArray.add(summonerSpells.cleanse);
        summonerSpellsArray.add(summonerSpells.exhaust);
        summonerSpellsArray.add(summonerSpells.flash);
        summonerSpellsArray.add(summonerSpells.ghost);
        summonerSpellsArray.add(summonerSpells.heal);
        summonerSpellsArray.add(summonerSpells.ignite);
        summonerSpellsArray.add(summonerSpells.smite);
        summonerSpellsArray.add(summonerSpells.teleport);
    }


    public static void chooseChampion() {

    }

    public static void chooseSummonersSpell() {
        items = new InitItems();
        summonerSpells = new InitSummonSpells();

        spells = new ArrayList<>();

        arraySummonerSpell();

        if(inventory.contains(items.skirmisherS) || inventory.contains(items.stalkerB) || inventory.contains(items.trackerK)) {
            Random random = new Random();

            int i = random.nextInt(1);

            spells.set(i, summonerSpells.smite);
        }

    }

    public static String chooseMaxSpell() {
        Random random = new Random();
        int n = random.nextInt(3);
        String max;

        switch (n) {
            case 0:
                max = "Max Q";
                return max;
            case 1:
                max = "Max W";
                return max;
            case 2:
                max = "Max E";
                return max;
            default:
                max = "Max Q: D";
                return max;
        }
    }

    public static void chooseItem() {
        items = new InitItems();
        inventory = new ArrayList<>();

        Random rng = new Random();

        int slot;
        int boot = rng.nextInt(6);
        int support = rng.nextInt(5);
        int jungle = rng.nextInt(2);

        int supportSelection = rng.nextInt(2);
        int jungleSelection = rng.nextInt(5);

        boolean supportBoolean = false;
        boolean jungleBoolean = false;

        arrayItems();
        arrayBoots();
        arrayJungle();
        arraySupport();

        if(supportSelection == 0) {
            supportBoolean = true;
        }

        if(jungleSelection == 0) {
            jungleBoolean = true;
        }

        for(int i = 0; i < 6; i++) {
            Random random = new Random();
            int a = random.nextInt(57);

            do {
                inventory.add(allItems.get(a));
            } while (!inventory.contains(allItems.get(a)));

        }

        slot = rng.nextInt(6);
        inventory.set(slot, boots.get(boot));

        if(supportBoolean) {
            slot = rng.nextInt(6);
            inventory.set(slot, supports.get(support));
        }

        if(jungleBoolean) {
            slot = rng.nextInt(6);
            inventory.set(slot, jungles.get(jungle));
        }
    }
}
