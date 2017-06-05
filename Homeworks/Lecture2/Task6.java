import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		System.out.println("Enter 3 numbers:");
		
		Scanner sc = new Scanner(System.in);
		
		double a1 = sc.nextDouble();
		double a2 = sc.nextDouble();
		double a3 = sc.nextDouble();
		
		double temp = a1;
		
		a1=a2;
		a2=a3;
		a3=temp;
		
		System.out.println(a1 + " " + a2 + " " + a3);
		sc.close();
	}
}
