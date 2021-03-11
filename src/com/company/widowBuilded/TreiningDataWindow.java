package com.company.widowBuilded;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TreiningDataWindow extends JFrame
{
	private JPanel rootPaneTreiningData;
	private JRadioButton radioButtonIcrease, radioButtonLose, radioButtonKeep, radioButton2, radioButton1, radioButton3, radioButton4, radioButton5, radioButton6;

	private ButtonGroup bg1 = new ButtonGroup(), bg2 = new ButtonGroup();

	public TreiningDataWindow()
	{
		initWindow();
		setAction();
	}

	private void initWindow()
	{
		setContentPane(rootPaneTreiningData);
		this.setTitle("User Treining Info");
		this.setResizable(false);
		this.setBounds(900, 100, 400, 230);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		bg1.add(radioButtonIcrease);
		bg1.add(radioButtonLose);
		bg1.add(radioButtonKeep);

		bg2.add(radioButton1);
		bg2.add(radioButton2);
		bg2.add(radioButton3);
		bg2.add(radioButton4);
		bg2.add(radioButton5);
		bg2.add(radioButton6);
	}

	private void setAction()
	{
		ButtonListener btnListener = new ButtonListener();
		radioButtonIcrease.addActionListener(btnListener);
		radioButtonLose.addActionListener(btnListener);
		radioButtonKeep.addActionListener(btnListener);
		radioButton2.addActionListener(btnListener);
		radioButton1.addActionListener(btnListener);
		radioButton3.addActionListener(btnListener);
		radioButton4.addActionListener(btnListener);
		radioButton5.addActionListener(btnListener);
		radioButton6.addActionListener(btnListener);
	}

	class ButtonListener extends JButton implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == radioButtonIcrease)
			{

			}
			if(e.getSource() == radioButtonLose)
			{

			}
			if(e.getSource() == radioButtonKeep)
			{

			}
			if(e.getSource() == radioButton2)
			{

			}
			if(e.getSource() == radioButton1)
			{

			}
			if(e.getSource() == radioButton3)
			{

			}
			if(e.getSource() == radioButton4)
			{

			}
			if(e.getSource() == radioButton5)
			{

			}
			if(e.getSource() == radioButton6)
			{

			}


		}
	}
}
