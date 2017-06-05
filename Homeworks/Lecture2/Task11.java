import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		System.out.println("Enter number (111 - 999) without 0:");
		
		Scanner sc = new Scanner(System.in);
		
		byte number = sc.nextByte();
		
		int digit1 = number/100;
		int digit2 = number/10%10;
		int digit3 = number%10;
		
		if(number % digit1 == 0 && number % digit2 == 0 && number % digit3 == 0){
			System.out.println("Yes!");
		} else{
			System.out.println("No!");
		}
		
		sc.close();
	}
}