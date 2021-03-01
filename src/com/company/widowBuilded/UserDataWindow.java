package com.company.widowBuilded;

import javax.swing.*;

public class UserDataWindow extends JFrame
{
	private JPanel rootPaneUserDataInfo;

	public UserDataWindow()
	{
		initWindow();
	}

	private void initWindow()
	{
		setContentPane(rootPaneUserDataInfo);
		this.setTitle("User Data Info");
		this.setBounds(400, 100, 300, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


}
