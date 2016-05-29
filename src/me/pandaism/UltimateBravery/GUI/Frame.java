package me.pandaism.UltimateBravery.GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Pandaism on 5/28/2016.
 */
public class Frame extends JFrame {
    private String version = "6.10";

    public Frame() {
        initSettings();
        initComponents();
    }

    private void initSettings() {
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("Ultimate Bravery for " + version);
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private void initComponents() {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        JPanel championPanel = new JPanel(new FlowLayout());
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;

            JLabel champPic = new JLabel("Picture");
            championPanel.add(champPic);

            JLabel champName = new JLabel("Name");
            championPanel.add(champName);
        this.add(championPanel, gridBagConstraints);

        JPanel spellsPanel = new JPanel(new GridBagLayout());
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;

            JPanel championSpellsPanel = new JPanel(new GridBagLayout());

                JLabel maxSpell = new JLabel("Q");
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                championSpellsPanel.add(maxSpell, gridBagConstraints);

                JLabel summonerSpell1 = new JLabel("S1");
                gridBagConstraints.gridx = 2;
                gridBagConstraints.gridy = 0;
                championSpellsPanel.add(summonerSpell1, gridBagConstraints);

                JLabel spellPic = new JLabel("Spell Picture");
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 1;
                championSpellsPanel.add(spellPic, gridBagConstraints);

                JLabel summonerSpell2 = new JLabel("S2");
                gridBagConstraints.gridx = 2;
                gridBagConstraints.gridy = 2;
                championSpellsPanel.add(summonerSpell2, gridBagConstraints);

            spellsPanel.add(championSpellsPanel);

            JLabel ferocity = new JLabel("Ferocity");
            spellsPanel.add(ferocity);

            JLabel cunning = new JLabel("Cunning");
            spellsPanel.add(cunning);

            JLabel resolve = new JLabel("Resolve");
            spellsPanel.add(resolve);

        this.add(spellsPanel, gridBagConstraints);

        JPanel itemPanel = new JPanel(new GridBagLayout());
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;

            JLabel item1 = new JLabel("Item 1");
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            itemPanel.add(item1, gridBagConstraints);

            JLabel item2 = new JLabel("Item 2");
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 0;
            itemPanel.add(item2, gridBagConstraints);

            JLabel item3 = new JLabel("Item 3");
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 0;
            itemPanel.add(item3, gridBagConstraints);

            JLabel item4 = new JLabel("Item 4");
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            itemPanel.add(item4, gridBagConstraints);

            JLabel item5 = new JLabel("Item 5");
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 1;
            itemPanel.add(item5, gridBagConstraints);

            JLabel item6 = new JLabel("Item 6");
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 1;
            itemPanel.add(item6, gridBagConstraints);

        this.add(itemPanel, gridBagConstraints);
    }
}
