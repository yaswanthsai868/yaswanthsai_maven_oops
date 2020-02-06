package com.epam.oops;
class Details
{
	protected String name;
	protected int cost;
	protected int weight;
	public Details(String name,int cost,int weight)
	{
		this.name=name;
		this.cost=cost;
		this.weight=weight;
	}
	public String getName()
	{
		return this.name;
	}
	public int getCost()
	{
		return this.cost;
	}
	public int getWeigth()
	{
		return this.weight;
	}
	public void setName(String name)
	{
		this.name=name;;
	}
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	public void setWeight(int weight)
	{
		this.weight=weight;
	}
}