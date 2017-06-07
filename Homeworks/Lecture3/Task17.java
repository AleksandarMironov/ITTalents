import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size [3 - 20]");
		int size = sc.nextInt();
		
		System.out.println("Enter simbol:");
		char simbol = sc.next().charAt(0);
		
		for (int i = 0; i < size; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 0; i < size - 2; i++) {
			System.out.print("*");
			for (int j = 0; j < size - 2; j++) {
				System.out.print(simbol);
			}
			System.out.println("*");
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print("*");
		}
		
		sc.close();
	}
}
