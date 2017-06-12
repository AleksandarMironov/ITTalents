import java.util.Scanner;

public class Task08 {
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
		
		int maxLength = 0;
		int tempMaxLen = 0;
		int startPosition = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			tempMaxLen = 0;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]){
					tempMaxLen++;
				} else {
					break;
				}
			}
			
			if(tempMaxLen > maxLength){
				maxLength = tempMaxLen;
				startPosition = i; 
			}
		}
		
		for (int i = startPosition; i <= startPosition + maxLength ; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		sc.close();
	}
}
