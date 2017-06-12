import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 7 elements of Array");

		int[] arr = new int[7];
		double average = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i+1) + " element from array:");
			arr[i] = sc.nextInt();
			average += arr[i];
		}
		
		average = average / 7;
		int closest = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (Math.abs(closest - average) > Math.abs(arr[i] - average)){
				closest = arr[i];
			}
		}
		
		System.out.println("Average is: " + average + " and closest is: " + closest);
		
		sc.close();
	}
}
