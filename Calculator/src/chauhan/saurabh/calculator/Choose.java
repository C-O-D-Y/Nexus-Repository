package chauhan.saurabh.calculator;

public class Choose extends Main
{
	Methods m=new Methods();
	void choose(double r, String s, double f1)
	{
		switch(s)
		{
		case "+":	m.add(r,f1);
		break;
		case "-":	m.substract(r,f1);
		break;
		case "*":	m.multiply(r,f1);
		break;
		case "/":	m.divide(r,f1);
		break;
		default :	System.out.println("Wrong Operator");
		}
	}
}