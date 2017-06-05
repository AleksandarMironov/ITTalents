import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int firstNum = sc.nextInt();
		
		System.out.println("Enter second number:");
		int tempNum = sc.nextInt();
		
		int secondNum = (firstNum < tempNum)? tempNum : firstNum;
		firstNum = (firstNum < tempNum)? firstNum : tempNum;
		
		for (int i = firstNum; i <= secondNum; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
