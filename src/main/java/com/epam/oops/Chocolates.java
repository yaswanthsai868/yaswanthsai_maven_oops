package com.epam.oops;

class  Chocolates extends Details
{
	public Chocolates(String name,int cost,int weight)
	{
		super(name,cost,weight);
	}
	public void display()
	{
		System.out.println("Chocolate-name:"+this.name);
		System.out.println("Chocolate-cost:Rs."+this.cost+"/-");
		System.out.println("Chocolate-weight:"+this.weight+"Grams");
	}
}