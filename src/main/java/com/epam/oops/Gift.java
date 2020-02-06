package com.epam.oops;
import java.util.*;
class Gift
{
	private ArrayList<Chocolates> choco;
	private ArrayList<Sweets> sweet;
	public Gift()
	{
		this.choco=new ArrayList<Chocolates>();
		this.sweet=new ArrayList<Sweets>();
	}
	public void addChocolate(Chocolates choco)
	{
		this.choco.add(choco);
	}
	public void addSweets(Sweets sweet)
	{
		this.sweet.add(sweet);
	}
	public Chocolates getChocolates(int i)
	{
		return this.choco.get(i);
	}
	public Sweets getSweets(int i)
	{
		return this.sweet.get(i);
	}
	public ArrayList<Chocolates> getCArray()
	{
		return this.choco;
	}
	public ArrayList<Sweets> getSArray()
	{
		return this.sweet;
	}
	public void display()
	{
		for(Chocolates x:choco)
		{
			x.display();
		}
		for(Sweets s:sweet)
		{
			s.display();
		}
	}
}