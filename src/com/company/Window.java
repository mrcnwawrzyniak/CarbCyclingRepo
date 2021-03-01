package com.company;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame
{
	private JPanel rootPane;
	private JMenuBar mainMenuBar;
	private JMenu mainMenu;
	private JMenuItem menuItemPersonalSettings, menuItemLookAndFeel;
	public Window()
	{
		initWindow();
		initMenuBar();

	}
	private void initWindow()
	{

		setContentPane(rootPane);
		this.setTitle("CarbCycling");
		this.setBounds(300, 100, 600, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void initMenuBar()
	{
		mainMenuBar = new JMenuBar();
		this.setJMenuBar(mainMenuBar);

		mainMenu = new JMenu();
		mainMenuBar.add(mainMenu);
		mainMenu.setText("Settings");

		menuItemPersonalSettings = new JMenuItem();
		menuItemPersonalSettings.setText("User");

		menuItemLookAndFeel = new JMenuItem();
		menuItemLookAndFeel.setText("Theme");

		mainMenu.add(menuItemPersonalSettings);
		mainMenu.add(menuItemLookAndFeel);
	}
}
