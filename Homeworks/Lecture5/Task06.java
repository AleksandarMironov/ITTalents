import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size;
		
		do{
			System.out.println("Enter valid size of first array");
			size = sc.nextInt();
		} while (size <= 0);
		
		int[] firstArr = new int[size];
		
		for (int i = 0; i < firstArr.length; i++) {
			System.out.println("Enter " + (i+1) + " element from first array:");
			firstArr[i] = sc.nextInt();
		}
		
		do{
			System.out.println("Enter valid size of second array");
			size = sc.nextInt();
		}while (size <= 0);
		
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
