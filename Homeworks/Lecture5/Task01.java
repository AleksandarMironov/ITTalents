import java.util.Scanner;

public class Task01 {
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
		
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0 && smallest > arr[i]){
				smallest = arr[i];
			}
		}
		
		if(smallest == Integer.MAX_VALUE){
			System.out.println("No such number!");
		} else {
			System.out.println(smallest);
		}	
		
		sc.close();
	}
}
