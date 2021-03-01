package com.company;

import javax.swing.*;

public class User
{
	private String name;
	private int age, weigth, heigth, dietPeriodInmonths;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		if (name.isEmpty())
			JOptionPane.showMessageDialog(null, "Invalid name");
		else
			this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		if (age <= 0)
			JOptionPane.showMessageDialog(null, "Invalid age");
		else
			this.weigth = age;
	}

	public int getWeigth()
	{
		return weigth;
	}

	public void setWeigth(int weigth)
	{
		if (age <= 0)
			JOptionPane.showMessageDialog(null, "Invalid weigth");
		else
			this.weigth = weigth;
	}

	public int getHeigth()
	{
		return heigth;
	}

	public void setHeigth(int heigth)
	{
		if (heigth <= 0)
			JOptionPane.showMessageDialog(null, "Invalid heigth");
		else
			this.heigth = heigth;
	}

	public int getDietPeriodInmonths()
	{
		return dietPeriodInmonths;
	}

	public void setDietPeriodInmonths(int dietPeriodInmonths)
	{
		if (dietPeriodInmonths <= 0 && dietPeriodInmonths >= 5)
			JOptionPane.showMessageDialog(null, "Minimum died period: 1, Maximum diet period: 5");
		else
			this.dietPeriodInmonths =dietPeriodInmonths;
	}

}
