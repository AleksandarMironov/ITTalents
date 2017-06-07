import java.util.Scanner;

public class Task19 {
	public static void main(String[] args) {
		System.out.println("Enter number in interval [10 - 99]");
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		while(1 < number){
			number = (number % 2 == 0)? (number / 2) : (number * 3 + 1);
			System.out.println(number);
		}
		
		sc.close();
	}
}
