package com.company.widowBuilded;

import com.company.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class UserDataWindow extends JFrame
{
	private JPanel rootPaneUserDataInfo;
	private JButton applyButton;
	private JTextField textFieldName, textFieldAge, textFieldheigth, textFieldWeigth, textFieldPeriod;

	private String name;
	private int age, heigth, weigth, dietPeriod;

	public UserDataWindow()
	{
		textFieldAge.addKeyListener(new KeyAdapter()
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
		});

		textFieldheigth.addKeyListener(new KeyAdapter()
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
		});

		textFieldWeigth.addKeyListener(new KeyAdapter()
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
		});

		textFieldPeriod.addKeyListener(new KeyAdapter()
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
		});


		initWindow();
		applyButton.addActionListener(e ->
		{

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
		User user = new User(name, age, heigth, weigth, dietPeriod);
	}
}
