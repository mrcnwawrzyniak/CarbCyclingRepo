package com.company.widowBuilded;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TreiningDataWindow extends JFrame
{
	private JPanel rootPaneTreiningData;
	private JButton btnLose, btnKeep, btnIncrease, btnActiv1, btnActiv2, btnActiv3, btnActiv4, btnActiv5, btnActiv6;

	public TreiningDataWindow()
	{
		initWindow();
		setAction();
	}

	private void initWindow()
	{
		setContentPane(rootPaneTreiningData);
		this.setTitle("User Treining Info");
		this.setBounds(900, 100, 600, 230);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	private void setAction()
	{
		ButtonListener btnListener = new ButtonListener();
		btnLose.addActionListener(btnListener);
		btnKeep.addActionListener(btnListener);
		btnIncrease.addActionListener(btnListener);
		btnActiv1.addActionListener(btnListener);
		btnActiv2.addActionListener(btnListener);
		btnActiv3.addActionListener(btnListener);
		btnActiv4.addActionListener(btnListener);
		btnActiv5.addActionListener(btnListener);
		btnActiv6.addActionListener(btnListener);
	}

	class ButtonListener extends JButton implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == btnIncrease)
			{

			}

			else if(e.getSource() == btnKeep)
			{

			}

			else if(e.getSource() == btnLose)
			{

			}
			else if(e.getSource() == btnActiv1)
			{

			}
			else if(e.getSource() == btnActiv2)
			{

			}
			else if(e.getSource() == btnActiv3)
			{

			}
			else if(e.getSource() == btnActiv4)
			{

			}
			else if(e.getSource() == btnActiv5)
			{

			}
			else if(e.getSource() == btnActiv6)
			{

			}
		}
	}
}
