import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of first Array");
		int size = sc.nextInt();
		
		while (size <= 0){
			System.out.println("Enter valid size of array");
			size = sc.nextInt();
		}
		
		int[] firstArr = new int[size];
		
		for (int i = 0; i < firstArr.length; i++) {
			System.out.println("Enter " + (i+1) + " element from first array:");
			firstArr[i] = sc.nextInt();
		}

		System.out.println("Enter size of second Array");
		size = sc.nextInt();
		
		while (size <= 0){
			System.out.println("Enter valid size of array");
			size = sc.nextInt();
		}
		
		int[] secondArr = new int[size];
		
		for (int i = 0; i < secondArr.length; i++) {
			System.out.println("Enter " + (i+1) + " element from second array:");
			secondArr[i] = sc.nextInt();
		}
		
		if (firstArr.length != secondArr.length){
			System.out.println("Size of arrays is different! \nArrays are NOT equal!");
		} else {
			System.out.println("Size of arrays is equal.");
			boolean isEqual = true;
			
			for (int i = 0; i < secondArr.length; i++) {
				if(firstArr[i] != secondArr[i]){
					isEqual = false;
					break;
				}
			}
			
			if(isEqual){
				System.out.println("Arrays are equal");
			} else {
				System.out.println("Arrays are NOT equal!");
			}		
		}
		sc.close();
	}
}
