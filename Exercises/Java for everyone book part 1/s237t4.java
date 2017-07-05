
public class s237t4 {
	public static void main(String[] args) {
		int [] arr = {1,1,2,3,5,8,64,64,8};
		
		System.out.println(repeatingNums(arr, 0));
	}
	
	static  boolean repeatingNums (int [] arr, int i){
		if (i == arr.length - 1){
			return false;
		}
		for (int j = 0; j < arr.length; j++) {					
			if (arr[i] == arr [j]){
				return true;
			}
		}
		
		return repeatingNums(arr, i + 1);
	}
}
