import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		System.out.println("Enter 3 numbers:");

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double tempNum = 0;

		if (a < b) {
			tempNum = a;
			a = b;
			b = tempNum;
		}

		if (b <= c) {
			tempNum = b;
			b = c;
			c = tempNum;
			if (a < b) {
				tempNum = a;
				a = b;
				b = tempNum;
			}
		}
		
		System.out.println(a + " " + b + " " + c);

		sc.close();
	}
}