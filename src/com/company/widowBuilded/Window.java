package com.company.widowBuilded;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame
{
	private JPanel rootPane;
	private JMenuBar mainMenuBar;
	private JMenu mainMenu;
	private JMenuItem menuItemPersonalInfo, menuItemLookAndFeel;
	private UserDataWindow userDataWindow;

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

		menuItemPersonalInfo = new JMenuItem();
		menuItemPersonalInfo.setText("User");

		menuItemLookAndFeel = new JMenuItem();
		menuItemLookAndFeel.setText("Theme");

		mainMenu.add(menuItemPersonalInfo);
		mainMenu.add(menuItemLookAndFeel);

		menuItemPersonalInfo.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				userDataWindow = new UserDataWindow();
			}
		});
	}
}
