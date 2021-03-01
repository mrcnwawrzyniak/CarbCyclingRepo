package com.company.widowBuilded;

import javax.swing.*;

public class HelpWindow extends JFrame
{
	private JLabel creatorLabel;
	private JPanel helpWindowPanel;
	private JLabel emailInfoLabel;

	public HelpWindow()
	{
		super("Help");
		setContentPane(helpWindowPanel);
		this.setBounds(900, 100, 300, 230);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);

		creatorLabel = new JLabel();
		emailInfoLabel = new JLabel();

	}
}
