
public class s237t3 {
	public static void main(String[] args) {
		int [] first = {1,2,3,4,5,6,7,8,9,10};
		int [] second = {1,2,5,4,3,8};
		System.out.println(monotom(first, 0));
		System.out.println(monotom(second, 0));
	}
	
	static boolean monotom (int [] arr, int i){
		if(i == arr.length - 1){
			return true;
		}
		
		if(arr[i] >= arr[i + 1]){
			return false;
		}
		
		return monotom (arr, i + 1);
	}
}
