import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String firstWord;
		String secondWord;
		
		do{
			System.out.println("Enter 2 words, between 10 and 20 simbols, separated by space");
			firstWord = sc.next();
			secondWord = sc.next();
		} while(firstWord.length() > 20 || secondWord.length() > 20 ||
				firstWord.length() < 10 || secondWord.length() < 10);
		
		String tempStr = firstWord;
		firstWord = secondWord.substring(0, 5) + firstWord.substring(5);
		secondWord = tempStr.substring(0, 5) + secondWord.substring(5);
		
		System.out.println("Longest word, with mixed first 5 letters:");
		System.out.println((firstWord.length() >= secondWord.length()) ? 
				(firstWord.length() + " " + firstWord) : (secondWord.length() + " " + secondWord) );
		
		sc.close();
	}
}
