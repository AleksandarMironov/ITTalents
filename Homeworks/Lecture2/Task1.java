import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers (interval):");
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println("Enter number for check:");
		double c = scan.nextDouble();
		
		if ((a<c && c<b) || (b<c && c<a)){
			System.out.println("Number " + c + " is between " + a +" and " + b);
		}else {
			System.out.println("Number " + c + " is NOT between " + a +" and " + b);
		}
		
		scan.close();
	}
}