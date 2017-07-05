import java.util.Scanner;

public class s239t7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n - 1; i++) {
			System.out.print(" ");
		}
		System.out.println("1");
		
		int starCounter = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			
			System.out.print(i);
			
			for (int j = 0; j < starCounter; j++) {
				System.out.print("*");
			}
			
			starCounter += 2;
			
			System.out.println(i);
		}
		
		starCounter -= 4;
		for (int i = n - 1; i >= 2; i--) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			System.out.print(i);
			
			for (int j = 0; j < starCounter; j++) {
				System.out.print("*");
			}
			
			System.out.println(i);
			starCounter -= 2;
		}
		
		for (int i = 0; i < n - 1; i++) {
			System.out.print(" ");
		}
		System.out.println("1");
		sc.close();
	}
}
