import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers:");
		
		Scanner sc = new Scanner(System.in);
		
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		
		double tempNum = 0;
		
		tempNum = first;
		first = second;
		second = tempNum;
		
		System.out.println("First: " + first);
		System.out.println("Second: " + second);
		
		sc.close();
	}
}
