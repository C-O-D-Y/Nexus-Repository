package chauhan.saurabh.Test;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

				try {
					cal();
				} catch (Exception t) {
					System.out.println(" Wrong Input");
				}
	}

	public static void cal() {
		int k = 1;
		while (k > 0) {
			Input i = new Input();
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the first Number: ");
			i.setfirst(in.nextDouble());
			System.out.print("Enter the second Number: ");
			i.setsecond(in.nextDouble());
			System.out.print("Which Operation you want to do(+,-,*,/,%):");
			in.nextLine();
			String s = in.nextLine();
			Methods o = new Methods(i.getfirst(), i.getsecond(), s);
			o.operation();
			int k1 = 1;
			while (k1 > 0) {
				System.out.print(
						"Press 1: Continue 2: New Calculation 3: Exit: ");
				try {
					int q = in.nextInt();
					if (q == 1) {
						System.out.print("Enter the Value: ");
						i.setContinue(in.nextDouble());
						System.out.print("Select Operation you want to do(+,-,*,/,%):");
						in.nextLine();
						o.contin(i.getContinue(), in.nextLine());
					} else if (q == 2) {
						k1 = 0;

					} else if (q == 3) {
						System.out.println("Bye Bye");
						System.exit(0);

					} else {
						System.out.println("Please select the given options");
					}
				} catch (Exception e) {
					System.out.println("Wrong input");
					cal();
				}
			}
		}
	}

}