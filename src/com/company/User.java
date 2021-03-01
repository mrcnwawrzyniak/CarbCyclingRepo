package com.company;

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
		if (age <= 0)
			JOptionPane.showMessageDialog(null, "Invalid age");
		else
			this.age = age;
	}

	public int getWeigth()
	{
		return weigth;
	}

	public void setWeigth(int weigth)
	{
		if (weigth <= 0)
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

	public int dietPeriodInMonths()
	{
		return dietPeriodInMonths;
	}

	public void setDietPeriodInmonths(int dietPeriodInMonths)
	{
		if (dietPeriodInMonths <= 0 && dietPeriodInMonths >= 5)
			JOptionPane.showMessageDialog(null, "Minimum died period: 1, Maximum diet period: 5");
		else
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

	@Override
	public String toString()
	{
		return "User " + name + ", age: " + age + ", weigth: " + weigth + ", heigth: " + heigth + ", dietPeriodInMonths: " + dietPeriodInMonths + '}';
	}
}
