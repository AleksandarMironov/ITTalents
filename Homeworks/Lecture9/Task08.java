import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter some text on single line");
		String text = sc.nextLine().trim();
		
		boolean isPalendrom = true;
		
		for (int i = 0; i < text.length() / 2; i++) {
			if(text.charAt(i) != text.charAt(text.length() - i - 1)){
				isPalendrom = false;
			}
		}
		
		System.out.println(isPalendrom? "Yes word is palendrom" : "No, word is not a palendrom");
		
		sc.close();
	}
}
