import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter some text:");
		char [] input = sc.nextLine().toCharArray();
	
		for (int i = 0; i < input.length; i++) {
			input[i] += 5;
		}
		
		System.out.println("Edited text:");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]);
		}
		
		sc.close();
	}
}
