package com.company.widowBuilded;

import javax.swing.*;
import java.awt.*;

public class UserDataWindow extends JFrame
{
	private JPanel rootPaneUserDataInfo;
	private JTextArea textArea1;
	private JTextArea textArea2;
	private JTextArea textArea3;
	private JTextArea textArea4;
	private JTextArea textArea5;

	public UserDataWindow()
	{
		initWindow();
	}

	private void initWindow()
	{
		setContentPane(rootPaneUserDataInfo);

		this.setTitle("User Data Info");
		this.setBounds(400, 100, 400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}



}
