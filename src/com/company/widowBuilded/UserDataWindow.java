package com.company.widowBuilded;

import com.company.implementation.User;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class UserDataWindow extends JFrame
{
	private JPanel rootPaneUserDataInfo;
	private JButton applyButton;
	private JTextField textFieldAge, textFieldheigth, textFieldWeigth, textFieldPeriod;

	private JRadioButton rbMale = new JRadioButton();
	private JRadioButton rbFemale = new JRadioButton();
	private final ButtonGroup buttonGroup = new ButtonGroup();

	User user;
	private String gender;
	private int age, heigth, weigth, dietPeriod;
	Window mainWindow;

	KeyAdapter keyAdapter = new KeyAdapter()
	{
		@Override
		public void keyTyped(KeyEvent e)
		{
			char character = e.getKeyChar();
			if ((character < '0' || character > '9') && character != '\b')
			{
				e.consume();
			}
		}
	};

	public UserDataWindow(Window window)
	{
		initWindow();
		mainWindow = window;
		textFieldAge.addKeyListener(keyAdapter);
		textFieldheigth.addKeyListener(keyAdapter);
		textFieldWeigth.addKeyListener(keyAdapter);
		textFieldPeriod.addKeyListener(keyAdapter);

		applyButton.addActionListener(e ->
		{
			try
			{
				age = Integer.parseInt(textFieldAge.getText());
				heigth = Integer.parseInt(textFieldheigth.getText());
				weigth = Integer.parseInt(textFieldWeigth.getText());
				dietPeriod = Integer.parseInt(textFieldPeriod.getText());
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			createNewUserAndAddToMainWindow();
		});
	}

	private void initWindow()
	{
		setContentPane(rootPaneUserDataInfo);
		this.setTitle("User Data Info");
		this.setBounds(900, 100, 300, 230);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	private void createNewUserAndAddToMainWindow()
	{
		if(!rbMale.isSelected())
			gender = "Male";
		else
			gender = "Female";

		user = new User(gender, age, heigth, weigth, dietPeriod);
		mainWindow.setUserInfoOnMainPage(user);
	}

}
