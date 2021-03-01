package com.company;

import javax.swing.*;

public class Window extends JFrame
{
	private JMenuBar mMenuBar;
	private JPanel panel1;

	public Window()
	{
		this.setTitle("CarbCycling");
		this.setBounds(400, 400, 600, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel1 = new JPanel();
		this.getContentPane().add(panel1);
		panel1.add(mMenuBar);


	}

}
