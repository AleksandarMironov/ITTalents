import java.util.Scanner;

public class s237t6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num:");
		int n = sc.nextInt();
		
		System.out.println("Reverce :");
		int num = reverce(n);
		System.out.println(num);
		sc.close();
	}
	
	static int reverce (int n){
		if(n == 0){
			return 0;
		}
		int pow = 1;
		int temp = n;
		while (temp / 10 != 0){
			pow = pow * 10;
			temp = temp / 10;
		}
		return (n % 10) * pow + reverce (n / 10);
	}
	
}
