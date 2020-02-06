package com.epam.oops;
class Gulab_Jamun extends Sweets
{
	public int count;
	public Gulab_Jamun(int count)
	{
		super("Gulab Jamun",10,200);
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