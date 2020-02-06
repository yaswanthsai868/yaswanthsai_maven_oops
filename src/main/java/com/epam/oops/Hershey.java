package com.epam.oops;
class Hershey extends Chocolates
{
	private int count;
	public Hershey(int count)
	{
		super("Hershey Kisses",10,50);
		this.count=count;
	}
	public int getWeight()
	{
		return this.weight*this.count;
	}
	public int getCost()
	{
		return this.cost*this.count;
	}
}