import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String firstWord;
		String secondWord;
		
		do{
			System.out.println("Enter some text (2 words, up to 40 simbols, separated by space");
			firstWord = sc.next();
			secondWord = sc.next();
		} while(firstWord.length() > 40 || secondWord.length() > 40);
		
		System.out.println("Text in upper and lower case:");
		System.out.println(firstWord.toUpperCase() + " " + firstWord.toLowerCase());
		System.out.println(secondWord.toUpperCase() + " " + secondWord.toLowerCase());
		
		sc.close();
	}
}
