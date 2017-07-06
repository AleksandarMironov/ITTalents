
public class S6T1V1Task3 {
	public static void main(String[] args) {
		int [] arr = {1, 2,3, -5, 6};
		System.out.println(myMetod(arr, 0));
 	}
	
	static boolean myMetod (int[] arr, int i){
		if(i == arr.length){
			return true;
		}
		
		if(arr[i] < 0){
			return false;
		}
		
		return myMetod (arr, i + 1);
	}
}
