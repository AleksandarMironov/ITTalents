import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers:");
		
		Scanner sc = new Scanner(System.in);
		
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		
		if(first <= second){
			System.out.println(first + " " + second);
		} else {
			System.out.println(second + " " + first);
		}
		
		sc.close();
	}
}