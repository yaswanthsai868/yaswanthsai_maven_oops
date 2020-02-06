package com.epam.oops;
import java.util.*;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
class SortByName implements Comparator<Chocolates>
{
	public int compare(Chocolates a, Chocolates b) {
		return a.getName().compareToIgnoreCase(b.getName());
	}
	
}
class SortByCost implements Comparator<Chocolates>
{
	public int compare(Chocolates a, Chocolates b) {
		return a.getCost()-b.getCost();
	}
}
class SortByWeight implements Comparator<Chocolates>
{
	public int compare(Chocolates a, Chocolates b) {
		return a.getWeigth()-b.getWeigth();
	}
	
}
public class App 
{
    public static void main( String[] args )
    {
        Scanner inp=new Scanner(System.in);
        int n;
        System.out.println("Enter Children count");
        n=inp.nextInt();
        ArrayList<Gift> gift=new ArrayList<Gift>();
        for(int i=0;i<n;i++)
        {
        	Cadbury c=new Cadbury();
        	Ferrero f=new Ferrero();
        	Hershey h=new Hershey(i+1);
        	Gulab_Jamun g=new Gulab_Jamun(i+1);
        	Jalebi j=new Jalebi();
        	Kheer k=new Kheer();
        	Gift x=new Gift();
        	x.addChocolate(c);
        	x.addChocolate(f);
        	x.addChocolate(h);
        	x.addSweets(j);
        	x.addSweets(g);
        	x.addSweets(k);
        	gift.add(x);
        }
        int weight=0;
        for(Gift x:gift)
        {
        	for(Chocolates y:x.getCArray())
        	{
        		weight+=y.getWeigth();
        	}
        	for(Sweets y:x.getSArray())
        	{
        		weight+=y.getWeigth();
        	}
        }
        System.out.println("The weight of total gifts are "+weight+"Grams");
        int op;
        System.out.println("Sorting Chocolates in a Gift");
        do
        {
        	System.out.println("Enter the option:");
        	System.out.println("1: Sort by Name");
        	System.out.println("2: Sort by Cost");
        	System.out.println("3: Sort by Weight");
        	System.out.println("4: Exit");
        	op=inp.nextInt();
        	switch(op)
        	{
        	case 1:
        		for(Gift x:gift)
        		{
        			Collections.sort(x.getCArray(),new SortByName());
        		}
        		break;
        	case 2:
        		for(Gift x:gift)
        		{
        			Collections.sort(x.getCArray(),new SortByCost());
        		}
        		break;
        	case 3:
        		for(Gift x:gift)
        		{
        			Collections.sort(x.getCArray(),new SortByWeight());
        		}
        		break;
        	case 4:
        		break;
        	default:
        		System.out.println("Invalid option\nPlease select again");
        	}
        	if(op!=4)
        	{
        		System.out.println("After Sorting....");
        		for(int i=0;i<gift.size();i++)
        		{
        			System.out.println("Gift:"+i+1);
        			gift.get(i).display();
        		}
        	}
        }while(op!=4);
        System.out.println("Getting the candies in a gift");
        do
        {
        	System.out.println("Select the option below");
        	System.out.println("1: Candies by weight");
        	System.out.println("2: Candies by cost");
        	System.out.println("3: Exit");
        	op=inp.nextInt();
        	int mi=0,ma=0;
        	switch(op)
        	{
        	case 1:
        		System.out.println("Enter the range of weight to consider");//min max
        		mi=inp.nextInt();
        		ma=inp.nextInt();
        		break;
        	case 2:
        		System.out.println("Enter the range of Cost to consider");//min max
        		mi=inp.nextInt();
        		ma=inp.nextInt();
        		break;
        	case 3:
        		break;
        	default:
        		System.out.println("Invalid option\nPlease select again");
        	}
        	if(op!=3)
        	{
        		System.out.print("The candies with ");
        		if(op==1)
        			System.out.print("Weight ");
        		else
        			System.out.println("Cost ");
        		System.out.println("int The range "+mi+","+ma+"are");
        		for(int i=0;i<gift.size();i++)
        		{
        			System.out.println("Gift:"+(i+1));
        			ArrayList<Chocolates> x=gift.get(i).getCArray();
        			for(int j=0;j<x.size();j++)
        			{
        				int w[]=new int[2];
        				w[0]=x.get(j).getWeigth();
        				w[1]=x.get(j).getCost();
        				if(w[op-1]>=mi && w[op-1]<=ma)
        				{
        					System.out.println(x.get(j).getName());
        				}
        			}
        		}
        	}
        }while(op!=3);
        inp.close();
        System.out.println("Thank You....");
    }
}