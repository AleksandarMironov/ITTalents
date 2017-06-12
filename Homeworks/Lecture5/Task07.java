import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		
		while (size <= 3){
			System.out.println("Enter valid size of array");
			size = sc.nextInt();
		}
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i+1) + " element from array:");
			arr[i] = sc.nextInt();
		}
		
		int[] newArr = new int[size];
		newArr[0] = arr[0];
		newArr[newArr.length-1] = arr[arr.length - 1];
		
		for (int i = 1; i < arr.length - 1; i++) {
			newArr[i] = arr[i-1] + arr[i+1];
		}
		
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + ", ");
		}
		
		sc.close();
	}
}
