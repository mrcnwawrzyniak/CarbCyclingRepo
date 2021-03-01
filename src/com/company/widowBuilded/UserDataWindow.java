package com.company.widowBuilded;

import com.company.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserDataWindow extends JFrame
{
	private JPanel rootPaneUserDataInfo;
	private JTextArea textAreaName,textAreaHeigth, textAreaWeigth, textAreaPeriod, textAreaAge;
	private JButton applyButton;

	private String name;
	private int age, heigth, weigth, dietPeriod;

	public UserDataWindow()
	{
		initWindow();
		applyButton.addActionListener(e ->
		{
			getTextFromTextArea(textAreaName);
			getTextFromTextArea(textAreaAge);
			getTextFromTextArea(textAreaHeigth);
			getTextFromTextArea(textAreaWeigth);
			getTextFromTextArea(textAreaPeriod);
			createNewUser();
		});
	}

	private void initWindow()
	{
		setContentPane(rootPaneUserDataInfo);
		this.setTitle("User Data Info");
		this.setBounds(900, 100, 320, 230);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	private void getTextFromTextArea(JTextArea incomingTextArea)
	{
		if(incomingTextArea != null)
		{
			if (incomingTextArea.equals(textAreaName))
			{
				name = incomingTextArea.getText();
			}
			if(incomingTextArea.equals(textAreaAge))
			{
				age = Integer.parseInt(incomingTextArea.getText());
			}
			if(incomingTextArea.equals(textAreaHeigth))
			{
				heigth = Integer.parseInt(incomingTextArea.getText());
			}
			if(incomingTextArea.equals(textAreaWeigth))
			{
				weigth = Integer.parseInt(incomingTextArea.getText());
			}
			if(incomingTextArea.equals(textAreaPeriod))
			{
				dietPeriod = Integer.parseInt(incomingTextArea.getText());
			}
		}
	}

	private void createNewUser()
	{
		User user = new User(name, age, heigth, weigth, dietPeriod);
	}
}
