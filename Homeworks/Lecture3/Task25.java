import java.util.Scanner;

public class Task25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int n = sc.nextInt();
		
		long factorial = 1;
		
		while (n > 0){
			factorial *= n;
			n--;
		}
		
		System.out.println(factorial);
		
		sc.close();
	}
}
