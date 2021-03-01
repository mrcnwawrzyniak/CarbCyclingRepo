package com.company.widowBuilded;

import javax.swing.*;
import java.awt.*;

public class UserDataWindow extends JFrame
{
	private JPanel rootPaneUserDataInfo;
	private JTextArea textArea1;
	private JTextArea textArea3;
	private JTextArea textArea4;
	private JTextArea textArea5;
	private JTextArea textArea2;
	private JButton applyButton;

	public UserDataWindow()
	{
		initWindow();
	}

	private void initWindow()
	{
		setContentPane(rootPaneUserDataInfo);

		this.setTitle("User Data Info");
		this.setBounds(900, 100, 320, 230);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}



}
