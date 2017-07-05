
public class s237t5 {
	public static void main(String[] args) {
		int [] arr = {1,1,2,3,5,8,64,64,8};
		
		System.out.println(biggestElementIndex(arr, arr[0], 0));
	}
	
	static int biggestElementIndex(int [] arr, int max, int i){
		if (i == arr.length - 1){
			return max;
		}
		
		if (max < arr[i]){
			max = arr[i];
		}
		
		return biggestElementIndex(arr, max, i + 1);
	}
}
