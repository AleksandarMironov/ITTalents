import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		
		while (size <= 0){
			System.out.println("Enter valid size of array");
			size = sc.nextInt();
		}
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i+1) + " element from array:");
			arr[i] = sc.nextInt();
		}
		
		boolean isSpecular = true;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != arr[arr.length - 1 - i]){
				isSpecular = false;
			}
		}
		
		if (isSpecular){
			System.out.println("Array is specular");
		} else {
			System.out.println("Array is NOT specular");
		}
		
		sc.close();
	}
}
