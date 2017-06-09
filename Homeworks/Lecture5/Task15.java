import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		
		while (size <= 3){
			System.out.println("Enter valid size of array");
			size = sc.nextInt();
		}
		
		double[] arr = new double[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i+1) + " element from array:");
			arr[i] = sc.nextDouble();
		}
		
		double firstBiggest = Double.MIN_VALUE;
		double secondBiggest = Double.MIN_VALUE;
		double thirdBiggest = Double.MIN_VALUE;
		double biggestSum = Double.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j){
					continue;
				}
				for (int k = 0; k < arr.length; k++) {
					if (i == k || j == k){
						continue;
					}
					
					if((arr[i] + arr[j] + arr[k]) > biggestSum){
						biggestSum = (arr[i] + arr[j] + arr[k]);
						firstBiggest = arr[i];
						secondBiggest = arr[j];
						thirdBiggest = arr[k];
					}
				}
			}
		}

		System.out.println(firstBiggest + ", " + secondBiggest + ", " + thirdBiggest);
		
		sc.close();
		// test numbers 7.13; 0.2; 4.9; 5.1; 6.34; 1.12 
	}
}
