package com.company.implementation;

import javax.swing.*;

public class User
{
	private String name;
	private int age, weigth, heigth, dietPeriodInMonths;

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
		if(validationInsertValue(age))
			this.age = age;
	}

	public int getWeigth()
	{
		return weigth;
	}

	public void setWeigth(int weigth)
	{
		if(validationInsertValue(weigth))
			this.weigth = weigth;
	}

	public int getHeigth()
	{
		return heigth;
	}

	public void setHeigth(int heigth)
	{
		if(validationInsertValue(heigth))
			this.heigth = heigth;
	}

	public int dietPeriodInMonths()
	{
		return dietPeriodInMonths;
	}

	public void setDietPeriodInmonths(int dietPeriodInMonths)
	{
		if(validationInsertValue(dietPeriodInMonths))
			this.dietPeriodInMonths = dietPeriodInMonths;
	}

	public User(String name, int age, int heigth, int weigth, int dietPeriodInMonths)
	{
		setName(name);
		setAge(age);
		setHeigth(heigth);
		setWeigth(weigth);
		setDietPeriodInmonths(dietPeriodInMonths);
	}

	private boolean validationInsertValue(int arg1)
	{
		if(arg1 <= 0)
		{
			JOptionPane.showMessageDialog(null, "Invalid data");
			return false;
		}
		else
			return true;
	}

	@Override
	public String toString()
	{
		return name + "|" + age + "|" + weigth + "|" + heigth + "|" + dietPeriodInMonths;
	}
}
