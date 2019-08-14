package chauhan.saurabh.calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Scanner scan=new Scanner(System.in);
		Choose c=new Choose();
		System.out.println("Enter the value 1: ");
		double f= scan.nextDouble();
		System.out.println("Enter the value 2:");
		double f1=scan.nextInt();
		System.out.println("choose the operation('+', '-', '*', '/')");
		scan.nextLine();
		String s=scan.nextLine();
		c.choose(f, s,f1);
		}
		catch(Exception e)
		{
			System.out.println("Thank you");
		}
	}

}
