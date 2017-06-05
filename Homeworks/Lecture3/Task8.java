import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int number = sc.nextInt();
		
		int printNum = number - 1;
		
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				System.out.print(printNum);
			}
			printNum+=2;
			System.out.println();
		}
		
		sc.close();
	}
}
