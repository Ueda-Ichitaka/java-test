package com.uedaichitaka.code.java_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

//TODO add junit tests
public class GuiMain extends JFrame implements ActionListener
{
	JButton mobbingButton;
	
	GuiMain(String title)
	{
		super(title);
		
		mobbingButton = new JButton("Label Mobbing");

		setLayout(null);
		setLocationRelativeTo(null);
		
		add(mobbingButton);
		
		Dimension size = mobbingButton.getPreferredSize();
		mobbingButton.setBounds(250 - size.width/2, 50, size.width, size.height);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		mobbingButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	  if(e.getSource() == this.mobbingButton)
	  {
	    GuiLabelMobbing mobbingForm = new GuiLabelMobbing("Label Mobbing");
	    mobbingForm.pack();
	    mobbingForm.setSize(500, 200);
	    mobbingForm.setVisible(true);  
	  }
	}
}