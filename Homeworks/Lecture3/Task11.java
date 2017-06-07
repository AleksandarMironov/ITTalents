import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size:");
		
		int size = sc.nextInt();
		
		for (int i = 0; i < size; i++) {
			for (int j = size - 1 - i; j > 0; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
