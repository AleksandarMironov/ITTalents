
public class s236t2 {
	public static void main(String[] args) {
		int [] arr = {1,8,2,5,-55,2,58,4};
		int min = minElm (arr, arr[0], 0);
		System.out.println(min);
	}
	
	static int minElm(int [] arr, int min, int i){
		if (i == arr.length){
			return min;
		}
		
		if (arr[i] < min){
			min = arr[i];
		}
		
		return minElm(arr, min, i + 1);
	}
}
