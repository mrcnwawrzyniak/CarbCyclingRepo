package com.company.widowBuilded;

import com.company.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Window extends JFrame
{
	private JPanel rootPane;
	private JLabel lName, lAge, lHeigth, lWeigth, lPeriod;
	private JTextField textFieldName, textFieldAge, textFieldHeight, textFieldWeight, textFieldPeriod;
	private JMenuBar mainMenuBar;
	private JMenu mainMenu, menuItemUser;
	private JMenuItem menuItemLookAndFeel, menuHelp, menuSave, menuExit, menuItemUserPersonalData, menuItemUserTreiningData;
	private UserDataWindow userDataWindow;
	private HelpWindow helpWindow;
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

		menuItemUserPersonalData = new JMenuItem("Personal data");
		menuItemUser.add(menuItemUserPersonalData);

		menuItemLookAndFeel = new JMenuItem("Theme");
		menuItemLookAndFeel.addActionListener(e ->
		{

		});

		mainMenu.add(menuItemUser);
		mainMenu.add(menuItemLookAndFeel);

		menuItemUserPersonalData.addActionListener(e ->
				userDataWindow = new UserDataWindow(window));

		menuHelp = new JMenuItem("Help");
		mainMenu.add(menuHelp);
		menuHelp.addActionListener(e -> {
			helpWindow = new HelpWindow();
		});

		menuSave = new JMenuItem("Save");
		mainMenu.add(menuSave);
		menuSave.addActionListener(e -> {

				SaveUserData save = new SaveUserData(internalUser);

		});

		menuExit = new JMenuItem("Exit");
		mainMenu.add(menuExit);
		menuExit.addActionListener(e -> {
			this.dispose();
		});
	}

	void setUserInfoOnMainPage(User user)
	{
		internalUser = user;
		textFieldName.setText(user.getName());
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
