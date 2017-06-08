import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long [] arr = new long [10];
		
		System.out.println("Enter 2 numbers. \nFirst:");
		arr[0] = sc.nextLong();
		System.out.println("Second:");
		arr[1] = sc.nextLong();
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}
}
