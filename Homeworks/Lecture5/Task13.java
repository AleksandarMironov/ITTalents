import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer number:");
		
		int num = sc.nextInt();

		int [] numInBin = new int [32];
		
		numInBin[0] = num < 0 ? 1 : 0;
		
		for (int i = numInBin.length - 1; i > 0; i--) {
			numInBin[i] = num % 2;
			num = num / 2;
		}
		
		for (int i = 0; i < numInBin.length; i++) {
			System.out.print(numInBin[i]);
		}
		
		sc.close();
	}
}
