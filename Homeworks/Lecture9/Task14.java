import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number for factorial:");
		
		int num = sc.nextInt();
		
		System.out.println(num + "! = " + factor(num));
		
		sc.close();
	}
	
	static int factor (int num){
		if (num == 1){
			return 1;
		}
		return num * factor(num - 1);
	}
}
