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

	private JRadioButton rbMale;
	private JRadioButton rbFemale;
	private ButtonGroup buttonGroup = new ButtonGroup();

	private Window mainWindow;
	private User user;
	private KeyAdapter keyAdapter;

	private String gender;
	private int age, heigth, weigth, dietPeriod;

	public UserDataWindow(Window window)
	{
		initWindow();
		setKeyAdapter();
		mainWindow = window;
<<<<<<< HEAD
=======

		buttonGroup.add(rbMale);
		buttonGroup.add(rbFemale);

>>>>>>> RadioButtonImplementation
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

	private void setKeyAdapter()
	{
		keyAdapter = new KeyAdapter()
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
	}

	private void createNewUserAndAddToMainWindow()
	{
		if(rbMale.isSelected())
			gender = "Male";
		else if(rbFemale.isSelected())
			gender = "Female";

		user = new User(gender, age, heigth, weigth, dietPeriod);
		mainWindow.setUserInfoOnMainPage(user);
	}

}
