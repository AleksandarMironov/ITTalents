import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] input;
		
		do{
			System.out.println("Enter 2 names, separated by comma");
			input = sc.nextLine().trim().split(",");
		} while (input.length < 2);
		
		System.out.println("Name with biggest ASCII char sum:");
		System.out.println((asciiLetterSum(input[0].trim()) > asciiLetterSum(input[1].trim()))? 
							input[0].trim() : input[1].trim());
		
		sc.close();
	}
	
	static int asciiLetterSum(String str){
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			sum = sum + str.charAt(i);
		}
		return sum;
	}
}
