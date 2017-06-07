import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sum 3 - 27");
		
		int sum = sc.nextInt();
		int firstDigit;
		int secondDigit;
		int tirdDigit;
		
		for (int i = 100; i < 1000; i++){
			firstDigit = i / 100;
			secondDigit = (i / 10) % 10;
			tirdDigit = i % 10;
			
			if ((firstDigit + secondDigit + tirdDigit) == sum){
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
