package com.company.implementation;

import javax.swing.*;

public class User
{
	private String gender;
	private int age, weigth, heigth, dietPeriodInMonths;

	public int getAge()
	{
		return age;
	}

	private void setAge(int age)
	{
		if(validationInsertValue(age))
			this.age = age;
	}

	public int getWeigth()
	{
		return weigth;
	}

	private void setWeigth(int weigth)
	{
		if(validationInsertValue(weigth))
			this.weigth = weigth;
	}

	public int getHeigth()
	{
		return heigth;
	}

	private void setHeigth(int heigth)
	{
		if(validationInsertValue(heigth))
			this.heigth = heigth;
	}

	public int dietPeriodInMonths()
	{
		return dietPeriodInMonths;
	}

	private void setDietPeriodInmonths(int dietPeriodInMonths)
	{
		if(validationInsertValue(dietPeriodInMonths))
			this.dietPeriodInMonths = dietPeriodInMonths;
	}

	public String getGender()
	{
		return gender;
	}

	public User(String gender, int age, int heigth, int weigth, int dietPeriodInMonths)
	{
		this.gender = gender;
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

}
