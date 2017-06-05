import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int number = sc.nextInt();
		
		if(0 < number){
			System.out.print(3);
		}
		
		for (int i = 2; i <= number; i++) {
			System.out.print("," + i*3);
		}
		
		sc.close();
	}
}
