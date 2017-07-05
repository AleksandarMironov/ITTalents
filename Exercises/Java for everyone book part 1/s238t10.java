import java.util.Scanner;

public class s238t10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		System.out.println("Enter pow");
		int pow = sc.nextInt();
		System.out.println(power(num, pow));
		sc.close();
	}
	
	static int power (int num, int pow){
		if(pow == 1){
			return num;
		}
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += power (num, pow - 1); 
		}
		return sum;
	}
}
