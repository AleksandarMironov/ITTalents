import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		System.out.println("Enter 2 integer numbers:");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		long sum = a + b;
		int subtraction = a - b;
		long multiplication = a * b;
		double division = (double)a / b;
 		int residue = a % b;
		
		System.out.println("a + b = " + sum);
		System.out.println("a - b = " + subtraction);
		System.out.println("a * b = " + multiplication);
		System.out.println("a / b = " + division);
		System.out.println("a % b = " + residue);
		
		sc.close();
	}
}
