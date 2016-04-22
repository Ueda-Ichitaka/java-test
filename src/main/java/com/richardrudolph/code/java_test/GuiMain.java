package com.richardrudolph.code.java_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

//TODO add junit tests
public class GuiMain extends JFrame
{
	JButton SadisticButton;
	JLabel PreyLabel;
	String[] Screams_Prey, Screams_Culprit;	
	
	GuiMain(String title)
	{
		super(title);
		
		SadisticButton = new JButton("Klick mich HART!");
		PreyLabel = new JLabel("Was mach ich hier?");
		
		Screams_Culprit = new String[] {"Klick mich HART!", "Gibs mir!", "JA!", "Mehr!", "OOH!", "YEAH!", "HÄRTER!", "SCHNELLER!"};
		Screams_Prey = new String[] {"NEIN!", "AUTSCH!", "AUA!", "ARGH!", "AU!", "AAAAH", "UFF!", "HILFE!", "...", "ALTER, HÖR AUF!", "BIST DU TAUB?", "BITTE HÖR AUF!"};
	
		setLayout(null);
		setLocationRelativeTo(null);
		
		add(SadisticButton);
		add(PreyLabel);
		
		Dimension size = SadisticButton.getPreferredSize();
		SadisticButton.setBounds(250 - size.width/2, 50, size.width, size.height);
		size = PreyLabel.getPreferredSize();
		PreyLabel.setBounds(250 - size.width/2, 100, size.width, size.height);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		SadisticButton.addActionListener(new ButtonListener());
	}
	
	class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Random rand = new Random();
			
			PreyLabel.setText(Screams_Prey[rand.nextInt(Screams_Prey.length)]);
			
			Dimension size = PreyLabel.getPreferredSize();
			PreyLabel.setBounds(250 - size.width/2, 100, size.width, size.height);
			
			SadisticButton.setText(Screams_Culprit[rand.nextInt(Screams_Culprit.length)]);
		}
	}
	
	public static void main(String[] args)
	{
		GuiMain testForm = new GuiMain("Label Mobbing");
		testForm.pack();
		testForm.setSize(500, 200);
		testForm.setVisible(true);
	}
	
}