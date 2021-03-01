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
			getTextFromTextAreaString(textAreaName);
			getTextFromTextAreaNumber(textAreaAge, textAreaHeigth, textAreaWeigth, textAreaPeriod);
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

	private void getTextFromTextAreaString(JTextArea incomingTextArea)
	{
		if(incomingTextArea.equals(""))
		{
			JOptionPane.showMessageDialog(null, "Insert user name");
		}
		else
		{
			name = incomingTextArea.getText();
		}
	}
	private void getTextFromTextAreaNumber(JTextArea arg1, JTextArea arg2,JTextArea arg3, JTextArea arg4)
	{
		if(arg1.isE)
	}

	private void createNewUser()
	{
		User user = new User(name, age, heigth, weigth, dietPeriod);
	}
}
