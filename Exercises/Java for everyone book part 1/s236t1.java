import java.util.Scanner;

public class s236t1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num for factorial:");
		int n = sc.nextInt();
		
		System.out.println(fac(n));
		
		sc.close();
	}
	
	static int fac(int n){
		if (n == 1){
			return 1;
		}
		
		return n * fac(n - 1);
	}
}
