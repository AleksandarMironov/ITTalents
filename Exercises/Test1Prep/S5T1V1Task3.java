
public class S5T1V1Task3 {
	public static void main(String[] args) {
		int [] arr = {8,3,5,7,9,11,4,-1};
		
		System.out.println("Difference between min end max = " +
							minMax(arr, arr.length - 1, arr[0], arr[0]));
		
	}
	
	static int minMax(int[] arr, int i, int min, int max){
		if(i < 0){
			return (max - min);
		}
		
		min = (arr[i] < min)? arr[i] : min;
		max = (arr[i] > max)? arr[i] : max;
		
		return minMax(arr, i-1, min, max);
	}
}
