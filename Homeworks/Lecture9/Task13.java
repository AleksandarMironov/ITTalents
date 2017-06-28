import java.util.Arrays;

public class Task13 {
	public static void main(String[] args) {
		int [] arr1 = {1,4,3,5,2};
		int [] arr2 = {10,13,34,234,12,213,42,213,43};

		int [] concatArr = concatArrays(arr1, arr2);

		System.out.println("Original arrays");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println("New Array");
		System.out.println(Arrays.toString(concatArr));
	}
	
	static int[] concatArrays (int[] arr1, int[] arr2){
		int[] newArr = new int [arr1.length + arr2.length];
		
		for (int i = 0; i < arr1.length; i++){
			newArr[i] = arr1[i];
		}
		
		for (int i = arr1.length, j = 0; i < arr1.length + arr2.length; i++, j++){
			newArr[i] = arr2[j];
		}
		
		return newArr;
	}
}
