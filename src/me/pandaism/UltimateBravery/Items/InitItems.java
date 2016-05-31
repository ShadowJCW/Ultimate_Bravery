package me.pandaism.UltimateBravery.Items;

import me.pandaism.UltimateBravery.Items.Equipments.Boots;
import me.pandaism.UltimateBravery.Items.Equipments.Jungle;
import me.pandaism.UltimateBravery.Items.Equipments.Support;

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

    public Support eyeofE;
    public Support eyeofO;
    public Support eyeofW;
    public Support faceM;
    public Support frostQ;
    public Support talismanA;

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
        //7
        berserkerG = new Boots("Berserker's Greaves", false, 1100);
        mobilityB = new Boots("Boots of Mobility", false, 900);
        swiftnessB = new Boots("Boots of Swiftness", false, 900);
        ionianB = new Boots("Ionian Boots of Lucidity", false, 900);
        ninjaB = new Boots("Ninja Tabi", false, 1100);
        mercuryB = new Boots("Mercury's Threads", false, 1100);
        sorcererB = new Boots("Sorcerer's Shoe", false, 1100);

        //3
        skirmisherS = new Jungle("Skirmisher's Sabre", false, 2625, 5);
        stalkerB = new Jungle("Stalker's Blade", false, 2625, 5);
        trackerK = new Jungle("Tracker's Knife", false, 2625, 5);

        //6
        eyeofE = new Support("Eye of the Equinox", false, 2200);
        eyeofO = new Support("Eye of the Oasis", false, 2200);
        eyeofW = new Support("Eye of the Watchers", false, 2200);
        faceM = new Support("Face of the Mountain", false, 2200);
        frostQ = new Support("Frost Queen's Claim", false, 2200);
        talismanA = new Support("Talisman of Ascension", false, 2200);

        //60
        abyssalS = new Item("Abyssal Scepter", true, 2750);
        ardentC = new Item("Ardent Censer", true, 2200);
        atheneU = new Item("Athene's Unholy Grail", true, 2250);
        bannerC = new Item("Banner of Command", true, 3000);
        bansheeV = new Item("Banshee's Veil", true, 2450);
        bork = new Item("Blade of the Ruined King", true, 3400);
        deadMan = new Item("Dead Man's Plate", true, 2900);
        deathDance = new Item("Death's Dance", true, 3500);
        duskblade = new Item("Duskblade of Draktharr", true, 3250);
        essenceR = new Item("Essence Reaver", true, 3600);
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
        rapidF = new Item("Rapid Firecannon", true, 2600);
        ravenousH = new Item("Ravenous Hydra", true, 3500);
        righteousG = new Item("Righteous Glory", true, 2500);
        rodA = new Item("Rod of Ages", true, 2600);
        rubyS = new Item("Ruby Sightstone", true, 1800);
        runaanH = new Item("Runaan's Hurricane", true, 2600);
        rylaiC = new Item("Rylai's Crystal Scepter", true, 3200);
        seraphE = new Item("Seraph's Embrace", true, 3100);
        spiritV = new Item("Spirit Visage", true, 2800);
        statikkS = new Item("Statikk Shiv", true, 2600);
        sterakG = new Item("Sterak's Gage", true, 2700);
        sunfireC = new Item("Sunfire Cape", true, 2900);
        blackC = new Item("The Black Cleaver", true, 3100);
        bloodthirster = new Item("The Bloodthirster", true, 3700);
        thornmail = new Item("Thornmail", true, 2350);
        titanicH = new Item("Titanic Hydra", true, 3500);
        trinityF = new Item("Trinity Force", true, 3800);
        voidS = new Item("Void Staff", true, 2650);
        warmogsA = new Item("Warmog's Armor", true, 2850);
        witE = new Item("Wit's End", true, 2800);
        youmuuG = new Item("Youmuu's Ghostblade", true, 3200);
        zekeH = new Item("Zeke's Harbinger", true, 2350);
        zhonyaH = new Item("Zhonya's Hourglass", true, 2900);
        zzrotP = new Item("Zz'Rot Portal", true, 2700);
    }
}
