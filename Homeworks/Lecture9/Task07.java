import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter some text on single line");
		String [] input = sc.nextLine().trim().split(" ");
		
		int maxWordLength = 0;
		
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > maxWordLength){
				maxWordLength = input[i].length();
			}
		}
		
		System.out.println("You entered " + input.length + " words.");
		System.out.println("Longest word: " + maxWordLength + " simbols");
		
		sc.close();
	}
}
