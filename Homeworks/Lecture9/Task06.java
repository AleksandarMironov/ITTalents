import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter some text on a single line");
		String input = sc.nextLine().trim();
		
		input = input.substring(0, 1).toUpperCase() + input.substring(1); // first letter to upercase
		
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i - 1) == ' ' && input.charAt(i) != ' '){
				input = input.substring(0, i) + 
						input.substring(i, i + 1).toUpperCase() + 
						input.substring(i+1);
			}
		}
		
		System.out.println("Edited text:");
		System.out.println(input);
		
		sc.close();
	}
}
