import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers in range [10 5555], separated by space or enter");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int start = n < m? m : n;
		int end = n < m? n : m;
		
		for (int i = start; i >= end; i--) {
			if(i % 50 == 0){
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
