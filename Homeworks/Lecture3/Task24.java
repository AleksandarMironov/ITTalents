import java.util.Scanner;

public class Task24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number in range [10 - 30000]");
		
		int originalNumber = sc.nextInt();
		int tempNum = originalNumber;
		int reversedNumber = 0;
		
		while(tempNum > 0){
			int temp = tempNum % 10;
			reversedNumber = reversedNumber * 10 + temp;
			tempNum = tempNum / 10;
		}
		
		if (originalNumber == reversedNumber){
			System.out.println("It is!!");
		} else {
			System.out.println("It is NOT!!!");
		}
		
		sc.close();
	}
}
