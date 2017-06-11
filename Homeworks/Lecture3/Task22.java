import java.util.Scanner;

public class Task22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		
		int num = sc.nextInt();
		int printedNumbers = 1;
		
		while(printedNumbers < 11){
			num++;
			if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0){
				System.out.println(printedNumbers + " : " + num);
				printedNumbers++;
			}
		}
		
		sc.close();
	}
}
