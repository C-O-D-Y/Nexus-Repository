package chauhan.saurabh.calculator;

import java.util.Scanner;

public class Methods extends Main
{
	Scanner scan=new Scanner(System.in);Choose c=new Choose();
	public void add(double r, double f1)
	{	
		double res=f1+r;  
		System.out.println(res);
		while(1>0)
		{
			System.out.println("Enter the operator");
			String s1=scan.nextLine();
			scan.nextLine();
			System.out.println("Enter next value");
			int ff=scan.nextInt();
			c.choose(res,s1, ff);
			System.out.println(" for EXIT press any number and Enter");
		}
	}	
	
	public void substract(double r, double f1)
	{
		double res=f1-r;
		while(1>0)
		{
			System.out.println("Enter the operator");
			String s1=scan.nextLine();
			scan.nextLine();
			System.out.println("Enter next value");
			int ff=scan.nextInt();
			c.choose(res,s1, ff);
			System.out.println(" for EXIT press any number and Enter");
		}
	}	
	
	public void multiply(double r, double f1)
	{
		double res=f1*r;
		while(1>0)
		{
			System.out.println("Enter the operator");
			String s1=scan.nextLine();
			scan.nextLine();
			System.out.println("Enter next value");
			int ff=scan.nextInt();
			c.choose(res,s1, ff);
			System.out.println(" for EXIT press any number and Enter");
		}
	}	
	
	public void divide(double r, double f1)
	{
		 double res=f1/r;
		 while(1>0)
			{
				System.out.println("Enter the operator");
				String s1=scan.nextLine();
				scan.nextLine();
				System.out.println("Enter next value");
				int ff=scan.nextInt();
				c.choose(res,s1, ff);
				System.out.println(" for EXIT press any number and Enter");
			}
	}	
}
