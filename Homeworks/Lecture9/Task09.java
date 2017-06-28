import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input;
		do{
			System.out.println("Enter some text + numbers (2 simbols min)");
			input = sc.nextLine().trim();
		} while (input.length() < 2);
		
		for (int i = 1; i < input.length() - 1; i++) {
			if((input.charAt(i) < 48 || input.charAt(i) > 57) && input.charAt(i) != 45 ){
				input = input.substring(0, i) + " " + input.substring(i+1);
			}
		}
		
		if((input.charAt(0) < 48 || input.charAt(0) > 57) && input.charAt(0) != 45 ){
			input = input.substring(1);
		}
		
		if((input.charAt(input.length() - 1) < 48 || input.charAt(input.length() - 1) > 57) &&
							input.charAt(input.length() - 1) != 45 ){
			input = input.substring(0, input.length() - 2);
		}
		
		String [] arrTemp = input.trim().split("\\s+");
		long sum = 0;
		
		System.out.println("Numbers: ");
		
		for (int i = 0; i < arrTemp.length; i++) {
			if(!arrTemp[i].equals("-")){
				sum = sum + Integer.parseInt(arrTemp[i]);
				System.out.print(Integer.parseInt(arrTemp[i]) + ", ");
			}
		}
		
		System.out.println("\nSum:\n" + sum);
		
		sc.close();
	}
}