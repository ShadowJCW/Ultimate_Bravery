package me.pandaism.UltimateBravery.Items;

import me.pandaism.UltimateBravery.Items.Equipments.Boots;
import me.pandaism.UltimateBravery.Items.Equipments.Jungle;

/**
 * Created by Pandaism on 5/29/2016.
 */
public class InitItems {
    public Boots berserkerG;
    public Boots mobilityB;
    public Boots swiftnessB;
    public Boots ionianB;
    public Boots ninjaB;
    public Boots mercuryB;
    public Boots sorcererB;

    public Jungle skirmisherS;
    public Jungle stalkerB;
    public Jungle trackerK;

    public Item abyssalS;
    public Item ardentC;
    public Item atheneU;
    public Item bannerC;
    public Item bansheeV;
    public Item bork;
    public Item deadMan;
    public Item deathDance;
    public Item duskblade;
    public Item essenceR;
    public Item eyeofE;
    public Item eyeofO;
    public Item eyeofW;
    public Item faceM;
    public Item frostQ;
    public Item frozenH;
    public Item frozenM;
    public Item guardianA;
    public Item guinsooR;
    public Item hextechGLP;
    public Item hextechGun;
    public Item hextechProto;
    public Item icebornG;
    public Item infinityE;
    public Item liandryT;
    public Item lichB;
    public Item locketIS;
    public Item lordD;
    public Item ludenE;
    public Item mawM;
    public Item mejaiS;
    public Item mercurialS;
    public Item mikaelC;
    public Item morellonomicon;
    public Item mortalR;
    public Item muramana;
    public Item nashorT;
    public Item ohmwrecker;
    public Item phantomD;
    public Item rabadonD;
    public Item randuinO;
    public Item rapidF;
    public Item ravenousH;
    public Item righteousG;
    public Item rodA;
    public Item rubyS;
    public Item runaanH;
    public Item rylaiC;
    public Item seraphE;
    public Item spiritV;
    public Item statikkS;
    public Item sterakG;
    public Item sunfireC;
    public Item talismanA;
    public Item blackC;
    public Item bloodthirster;
    public Item thornmail;
    public Item titanicH;
    public Item trinityF;
    public Item voidS;
    public Item warmogsA;
    public Item witE;
    public Item youmuuG;
    public Item zekeH;
    public Item zhonyaH;
    public Item zzrotP;

    public InitItems() {
        berserkerG = new Boots("Berserker's Greaves", false, 1100);
        mobilityB = new Boots("Boots of Mobility", false, 900);
        swiftnessB = new Boots("Boots of Swiftness", false, 900);
        ionianB = new Boots("Ionian Boots of Lucidity", false, 900);
        ninjaB = new Boots("Ninja Tabi", false, 1100);
        mercuryB = new Boots("Mercury's Threads", false, 1100);
        sorcererB = new Boots("Sorcerer's Shoe", false, 1100);

        skirmisherS = new Jungle("Skirmisher's Sabre", false, 2625, 5);
        stalkerB = new Jungle("Stalker's Blade", false, 2625, 5);
        trackerK = new Jungle("Tracker's Knife", false, 2625, 5);

        abyssalS = new Item("Abssal Scepter", true, 2750);
        ardentC = new Item("Ardent Censer", true, 2200);
        atheneU = new Item("Athene's Unholy Grail", true, 2250);
        bannerC = new Item("Banner of Command", true, 3000);
        bansheeV = new Item("Banshee's Veil", true, 2450);
        bork = new Item("Blade of the Ruined King", true, 3400);
        deadMan = new Item("Dead Man's Plate", true, 2900);
        deathDance = new Item("Death's Dance", true, 3500);
        duskblade = new Item("Duskblade of Draktharr", true, 3250);
        essenceR = new Item("Essence Reaver", true, 3600);
        eyeofE = new Item("Eye of the Equinox", false, 2200);
        eyeofO = new Item("Eye of the Oasis", false, 2200);
        eyeofW = new Item("Eye of the Watchers", false, 2200);
        faceM = new Item("Face of the Mountain", false, 2200);
        frostQ = new Item("Frost Queen's Claim", false, 2200);
        frozenH = new Item("Frozen Heart", true, 2800);
        frozenM = new Item("Frozen Mallet", true, 3100);
        guardianA = new Item("Guardian Angel", true, 2400);
        guinsooR = new Item("Guinsoo's Rageblade", true, 3600);
        hextechGLP = new Item("Hextech GLP-800", true, 3000);
        hextechGun = new Item("Hextech Gunblade", true, 3400);
        hextechProto = new Item("Hextech Protobelt-01", true, 2500);
        icebornG = new Item("Iceborn Gauntlet", true, 2700);
        infinityE = new Item("Infinity Edge", true, 3600);
        liandryT = new Item("Liandry's Torment", true, 3200);
        lichB = new Item("Lich Bane", true, 3200);
        locketIS = new Item("Locket of the Iron Solari", true, 2500);
        lordD = new Item("Lord Dominik's Regards", true, 2700);
        ludenE = new Item("Luden's Echo", true, 3200);
        mawM = new Item("Maw of Malmortius", true, 3250);
        mejaiS = new Item("Mejai's Soulstealer", true, 1400);
        mercurialS = new Item("Mercurial Scimitar", true, 3600);
        mikaelC = new Item("Mikael's Crucible", true, 2300);
        morellonomicon = new Item("Morellonomicon", true, 2900);
        mortalR = new Item("Mortal Reminder", true, 2700);
        muramana = new Item("Muramana", true, 2400);
        nashorT = new Item("Nashor's Tooth", true, 3000);
        ohmwrecker = new Item("Ohmwrecker", true, 2650);
        phantomD = new Item("Phantom Dancer", true, 2550);
        rabadonD = new Item("Rabadon's Deathcap", true, 3800);
        randuinO = new Item("Randuin's Omen", true, 2900);
    }
}
