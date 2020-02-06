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
        		System.out.println("Invalid option");
        	}
        	if(op!=4)
        	{
        		System.out.println("After Sorting....");
        		for(Gift x:gift)
        		{
        			x.display();
        		}
        	}
        }while(op!=4);
        inp.close();
    }
}