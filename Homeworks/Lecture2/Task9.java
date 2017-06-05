import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers: (10-99)");
		
		Scanner sc = new Scanner(System.in);
		
		byte firstNum = sc.nextByte();
		byte secondNum = sc.nextByte();
		
		int lastDigit = firstNum * secondNum % 10;
		String oddOrEven = lastDigit%2>0? "odd" : "even";
		System.out.print(firstNum*secondNum + ", " + lastDigit + " " + oddOrEven);
		
		sc.close();
	}
}
