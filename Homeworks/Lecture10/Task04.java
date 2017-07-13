import java.util.Arrays;

public class Task04 {
	public static void main(String[] args) {
		int [] arr = {1, 3, 5, 7, 9, 11, 45};
		int newElem = 6;
		int [] newArr = new int [arr.length + 1];
		
		int index = -1;	
		if(newElem <= arr[0]){
			index = 0;
		} else if(newElem >= arr[arr.length - 1]){
			index = arr.length;
		} else {
			for (int i = 0; i < arr.length - 1; i++) {
				if(newElem >= arr[i] && newElem <= arr[i + 1]){
					index = i + 1;
					break;
				}
			}
		}
		
		for (int i = 0, j = 0; i < newArr.length; i++, j++) {
			if(i == index){
				newArr[i] = newElem;
				j--;
				continue;
			}
			newArr[i] = arr[j];
		}
		
		System.out.println("Old arr: " + Arrays.toString(arr));
		System.out.println("New element: " + newElem);
		System.out.println("New arr: " + Arrays.toString(newArr));
	}
}
