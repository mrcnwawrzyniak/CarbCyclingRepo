package com.company.widowBuilded;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TreiningDataWindow extends JFrame
{
	private JPanel rootPaneTreiningData;
	private JButton btnLose;
	private JButton btnKeep;
	private JButton btnIncrease;

	public TreiningDataWindow()
	{
		initWindow();

	}

	private void initWindow()
	{
		setContentPane(rootPaneTreiningData);
		this.setTitle("User Treining Info");
		this.setBounds(900, 100, 500, 230);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	class ButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == btnIncrease)
			{

			}

			if(e.getSource() == btnKeep)
			{

			}

			if(e.getSource() == btnLose)
			{

			}
		}
	}

}
