package com.richardrudolph.code.java_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

//TODO add junit tests
public class GuiLabelMobbing extends JFrame implements ActionListener
{
  JButton sadisticButton;
  JLabel preyLabel;
  String[] screamsPrey, screamsCulprit; 
  
  GuiLabelMobbing(String title)
  {
    super(title);
    
    sadisticButton = new JButton("Klick mich HART!");
    preyLabel = new JLabel("Was mach ich hier?");
    
    screamsCulprit = new String[] {"Klick mich HART!", "Gibs mir!", "JA!", "Mehr!", "OOH!", "YEAH!", "HÄRTER!", "SCHNELLER!"};
    screamsPrey = new String[] {"NEIN!", "AUTSCH!", "AUA!", "ARGH!", "AU!", "AAAAH", "UFF!", "HILFE!", "...", "ALTER, HÖR AUF!", "BIST DU TAUB?", "BITTE HÖR AUF!"};
  
    setLayout(null);
    setLocationRelativeTo(null);
    
    add(sadisticButton);
    add(preyLabel);
    
    Dimension size = sadisticButton.getPreferredSize();
    sadisticButton.setBounds(250 - size.width/2, 50, size.width, size.height);
    size = preyLabel.getPreferredSize();
    preyLabel.setBounds(250 - size.width/2, 100, size.width, size.height);
    
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
    sadisticButton.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e)
  {
      Random rand = new Random();
      
      preyLabel.setText(screamsPrey[rand.nextInt(screamsPrey.length)]);
      
      Dimension size = preyLabel.getPreferredSize();
      preyLabel.setBounds(rand.nextInt(this.getContentPane().getWidth() - size.width - 1), rand.nextInt(this.getContentPane().getHeight() - size.height - 1), size.width, size.height);
      
      sadisticButton.setText(screamsCulprit[rand.nextInt(screamsCulprit.length)]);
  }
}