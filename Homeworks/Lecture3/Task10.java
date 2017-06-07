import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Is it prime? Enter number:");
		int number = sc.nextInt();
		
		boolean isPrime = true;
		if(number < 1){
			isPrime = false;
		}
		for (int i = 2; i < Math.sqrt(number); i++) {
			if(number % i == 0){
				isPrime = false;
				break;
			}
		}
		
		if(isPrime){
			System.out.println("It is prime");
		} else {
			System.out.println("It is NOT prime!");
		}
		
		sc.close();
	}
}
