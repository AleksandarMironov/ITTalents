import java.util.Arrays;

public class Task12 {
	public static void main(String[] args) {
		int [] arr = makeMeArray(10);

		System.out.println(Arrays.toString(arr));
	}
	
	static int[] makeMeArray (int size){
		int [] returnArr = new int [size];
		
		for(int i = 0; i < returnArr.length; i++){
			returnArr[i] = i + 1;
		}
		
		return returnArr;
	}
}
