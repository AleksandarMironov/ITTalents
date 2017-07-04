
public class S5T1V2Task3 {
	public static void main(String[] args) {
		int [] arr = {-1, 1, 2, 3, 4, 5};
		int negative = countNegative(arr, 0, 0);
		System.out.println(negative);
	}
	
	static int countNegative (int[] arr, int i, int counter){
		if(arr[i] < 0){
			counter++;
		}
		if (arr[i] >= 0){
			return counter;
		}
		if(i == arr.length - 1){
			return counter;
		}
		return countNegative(arr, i + 1, counter);
	}
}
