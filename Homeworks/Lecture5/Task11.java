import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 7 elements of Array");

		int[] arr = new int[7];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i+1) + " element from array:");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 5 && arr[i] % 5 == 0){
				System.out.print(arr[i] + ", ");
			}
		}
		
		sc.close();
	}
}
