import java.util.Scanner;

public class s238t9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int a = sc.nextInt();
		System.out.println("Enter second num");
		int b = sc.nextInt();
		System.out.println(multiplication(a, b));
		sc.close();
	}
	
	static int multiplication(int a, int b){
		if (b == 1){
			return a;
		}
		return a + multiplication(a, b - 1);
	}
}
