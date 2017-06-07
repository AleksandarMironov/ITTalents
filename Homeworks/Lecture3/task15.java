import java.util.Scanner;

public class task15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int n = sc.nextInt();
		long sum = 0;
		int i = 1;
		
		while (i <= n ){
			sum += i;
			i++;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
