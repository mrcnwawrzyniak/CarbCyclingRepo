package com.company.widowBuilded;

import com.company.implementation.User;

import javax.swing.*;
import java.io.*;

public class Window extends JFrame
{
	private JPanel rootPane;
	private JLabel lName, lAge, lHeigth, lWeigth, lPeriod;
	private JTextField textFieldGender, textFieldAge, textFieldHeight, textFieldWeight, textFieldPeriod;
	private JMenuBar mainMenuBar;
	private JMenu mainMenu, menuItemUser;
	private JMenuItem menuItemLookAndFeel, menuHelp, menuSave, menuExit, menuItemUserPersonalData, menuItemUserTreiningData;
	private UserDataWindow userDataWindow;
	private HelpWindow helpWindow;
	private TreiningDataWindow treiningDataWindow;
	private Window window = this;
	private User internalUser;

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

		menuItemUser = new JMenu("User");
		mainMenu.add(menuItemUser);

		menuItemUserPersonalData = new JMenuItem("Personal data");
		menuItemUser.add(menuItemUserPersonalData);
		menuItemUserPersonalData.addActionListener(e -> userDataWindow = new UserDataWindow(window));

		menuItemUserTreiningData = new JMenuItem("Treining Data");
		menuItemUser.add(menuItemUserTreiningData);
		menuItemUserTreiningData.addActionListener(e -> { treiningDataWindow = new TreiningDataWindow(); });

		menuItemLookAndFeel = new JMenuItem("Theme");
		mainMenu.add(menuItemLookAndFeel);
		menuItemLookAndFeel.addActionListener(e -> {   });

		menuHelp = new JMenuItem("Help");
		mainMenu.add(menuHelp);
		menuHelp.addActionListener(e -> {
			helpWindow = new HelpWindow();
		});

		menuSave = new JMenuItem("Save");
		mainMenu.add(menuSave);
		menuSave.addActionListener(e -> { SaveUserData save = new SaveUserData(internalUser); });

		menuExit = new JMenuItem("Exit");
		mainMenu.add(menuExit);
		menuExit.addActionListener(e -> { this.dispose(); });
	}

	void setUserInfoOnMainPage(User user)
	{
		internalUser = user;

		textFieldGender.setText(user.getGender());
		textFieldAge.setText(String.valueOf(user.getAge()));
		textFieldHeight.setText(String.valueOf(user.getHeigth()));
		textFieldWeight.setText(String.valueOf(user.getWeigth()));
		textFieldPeriod.setText(String.valueOf(user.dietPeriodInMonths()));
	}

	class SaveUserData
	{
		PrintWriter writer;
		SaveUserData(User user)
		{
			try
			{
				if(user != null)
				{
					writer = new PrintWriter("userData.txt");
					writer.write(user.toString());
					writer.close();
				}
			}
			catch (FileNotFoundException e)
			{

			}
		}
	}
}
