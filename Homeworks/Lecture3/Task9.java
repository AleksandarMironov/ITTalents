import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");		
		int firstNumber = sc.nextInt();
		
		System.out.println("Enter second number:");
		int secondNumber = sc.nextInt();
		
		int start = (firstNumber < secondNumber) ? firstNumber : secondNumber;
		int end = (firstNumber < secondNumber) ? 
				(secondNumber * secondNumber) : (firstNumber * firstNumber);
		int sum = 0;			
		
		for (int i = start; i <= end; i++) {
			if (i % 3 == 0){
				System.out.print("skip 3, ");
				continue;
			}
			
			sum += i;
			
			if(sum > 200){
				break;
			}
			
			System.out.print(i + ", ");
		}
		
		sc.close();
	}
}
