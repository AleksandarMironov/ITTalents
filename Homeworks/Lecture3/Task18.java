import java.util.Scanner;

public class Task18 {
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers in interval [1 - 9], separated by space or enter:");
		Scanner sc = new Scanner(System.in);
		
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		
		for (int i = 1; i <= firstNumber; i++) {
			for (int j = 1; j <= secondNumber; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		
		sc.close();
	}
}
