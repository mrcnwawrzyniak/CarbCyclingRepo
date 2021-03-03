package com.company.widowBuilded;

import com.company.User;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class UserDataWindow extends JFrame
{
	private JPanel rootPaneUserDataInfo;
	private JButton applyButton;
	private JTextField textFieldName, textFieldAge, textFieldheigth, textFieldWeigth, textFieldPeriod;
	User user;
	private String name;
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
		textFieldAge.addKeyListener(keyAdapter);
		textFieldheigth.addKeyListener(keyAdapter);
		textFieldWeigth.addKeyListener(keyAdapter);
		textFieldPeriod.addKeyListener(keyAdapter);
		mainWindow = window;

		applyButton.addActionListener(e ->
		{
			name = textFieldName.getText();
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
			createNewUser();
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

	private void createNewUser()
	{
		user = new User(name, age, heigth, weigth, dietPeriod);
		mainWindow.setUserInfoOnMainPage(user);
	}

}
