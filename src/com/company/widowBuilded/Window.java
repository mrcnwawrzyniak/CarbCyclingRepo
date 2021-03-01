package com.company.widowBuilded;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame
{
	private JPanel rootPane;
	private JMenuBar mainMenuBar;
	private JMenu mainMenu;
	private JMenuItem menuItemPersonalInfo, menuItemLookAndFeel, menuHelp, menuSave, menuExit;
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
		setFeel();
	}
	private void setFeel()
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
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
		menuItemLookAndFeel.addActionListener(e ->
		{

		});

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

		menuHelp = new JMenuItem();
		menuExit = new JMenuItem();
		menuSave = new JMenuItem();

		mainMenu.add(menuHelp);
		menuHelp.setText("Help");

		mainMenu.add(menuSave);
		menuSave.setText("Save");

		mainMenu.add(menuExit);
		menuExit.setText("Exit");
		menuExit.addActionListener(e -> {
			this.dispose();
		});
	}
}
