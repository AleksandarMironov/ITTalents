import java.util.Scanner;

public class Task17 {
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
			arr[i] = sc.nextInt();
		}
		
		boolean isJagged = true;
		
		for (int i = 1; i < arr.length - 1; i++) {
			if(!((arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) ||
					(arr[i - 1] > arr[i] && arr[i] < arr[i + 1]))){
				isJagged = false;
				break;
			}
		}
		
		System.out.println(isJagged? "It is jagged" : "It is NOT jagged");
		
		sc.close();
	}
}
