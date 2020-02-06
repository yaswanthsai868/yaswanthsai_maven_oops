package com.epam.oops;
class Sweets extends Details
{
	public Sweets(String name,int cost,int weight)
	{
		super(name,cost,weight);
	}
	public void display()
	{
		System.out.println("Sweet-name:"+this.name);
		System.out.println("Sweet-cost:Rs."+this.cost+"/-");
		System.out.println("Sweet-weight:"+this.weight+"Grams");
	}
}