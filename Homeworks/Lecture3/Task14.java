import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number (10 - 200)");
		
		int number = sc.nextInt();
		
		for (int i = number; i > 10; i--) {
			if(i % 7 == 0){
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
