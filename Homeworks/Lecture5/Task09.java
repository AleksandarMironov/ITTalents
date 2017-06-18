import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size;
		
		do{
			System.out.println("Enter valid size of array");
			size = sc.nextInt();
		} while (size <= 0);
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i+1) + " element from array:");
			arr[i] = sc.nextInt(); //must be less than (Integer.MAX_VALUE / 2)
		}
		
		for (int i = 0; i < arr.length / 2; i++) {
			arr[i] = arr[i] + arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i] - arr[arr.length - 1 - i];
			arr[i] = arr[i] - arr[arr.length - 1 - i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		sc.close();
	}
}
