import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size;
		
		do{
			System.out.println("Enter valid size of array");
			size = sc.nextInt();
		} while (size <= 0);
		
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
					
					//we consider that condition is for 3 different elements from array
					if((Math.abs(arr[i]) + Math.abs(arr[j]) + Math.abs(arr[k])) > biggestSum){
						biggestSum = (Math.abs(arr[i]) + Math.abs(arr[j]) + Math.abs(arr[k]));
						//we can use if(arr[i]<0) arr[i]*=-1, but Math.abs is easy way :)
						firstBiggest = arr[i];
						secondBiggest = arr[j];
						thirdBiggest = arr[k];
					}
				}
			}
		}

		System.out.println(firstBiggest + ", " + secondBiggest + ", " + thirdBiggest);
		
		sc.close();
	}
}
