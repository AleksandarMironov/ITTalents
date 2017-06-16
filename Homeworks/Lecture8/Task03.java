import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter word:");
		String firstWord = sc.next();
		
		System.out.println("Enter second word:");
		String secondWord = sc.next();
		
		int checkableWordLength;
		
		if(firstWord.length() > secondWord.length()){
			System.out.println("First word is longer");
			checkableWordLength = secondWord.length();
		} else if(firstWord.length() < secondWord.length()){
			System.out.println("Second word is longer");
			checkableWordLength = firstWord.length();
		} else {
			System.out.println("Words length is equal");
			checkableWordLength = firstWord.length();
		}
		
		if(firstWord.equals(secondWord)){
			System.out.println("Words are equal!");
		} else {
			System.out.println("Difference:");
			for (int i = 0; i < checkableWordLength; i++) {
				if(firstWord.charAt(i) != secondWord.charAt(i)){
					System.out.println("Char at position " + i + ": " + 
							firstWord.charAt(i) + " --> " + secondWord.charAt(i));
				}
			}
		}
		
		sc.close();
	}
}
