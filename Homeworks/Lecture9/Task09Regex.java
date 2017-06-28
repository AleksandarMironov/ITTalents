import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task09Regex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input;
		do{
			System.out.println("Enter some text + numbers (2 simbols min)");
			input = sc.nextLine().trim();
		} while (input.length() < 2);
		

		Pattern p = Pattern.compile("-?[0-9]+");
		Matcher m = p.matcher(input);
		long sum = 0;
		System.out.println("Numbers:");
		
		while (m.find()) {
			System.out.println(m.group());
			sum = sum + Integer.parseInt(m.group());
		}
		
		System.out.println("Sum: " + sum);
		
		sc.close();
	}
}
