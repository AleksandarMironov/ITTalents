import java.util.Arrays;

public class Task03 {
	public static void main(String[] args) {
		int [] arr = {1, 3, 5, 15, 7, 9, 11, 45};
		boolean isSorted = true;
		
		System.out.println("arr: " + Arrays.toString(arr));
		
		for (int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1]){
				isSorted = false;
				System.out.println("NOT SORTED!\n" + arr[i] + " > " + arr[i + 1]);
			}
		}
		
		if(isSorted){
			System.out.println("Array is sorted.");
		}
	}
}
