package chauhan.saurabh.Test;
public class Methods {

	double s;
	private double x;
	private double y;
	private String v;

	public  Methods(double x, double y, String v) {
		this.x = x;
		this.y = y;
		this.v = v;
	}

	public void operation()
	{

		switch (v) {
		case "+":
			s = x + y;
			System.out.println("The Result of(" + x + " + " + y + ")= " + s);
			break;
		case "-":
			s = x - y;
			System.out.println("The Result of(" + x + " - " + y + ")= " + s);
			break;
		case "*":
			s = x * y;
			System.out.println("The Result of(" + x + " * " + y + ")= " + s);
			break;
		case "/":
			s = x / y;
			System.out.println("The Result of(" + x + " / " + y + ")= " + s);
			break;
		default:
			System.out.println("Wrong Operation");
		}
	}
	public void contin(double y,String v)
	{
		x=s;
		this.y=y;
		this.v=v;
		operation();
	}
}
