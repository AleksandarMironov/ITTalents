import java.util.Arrays;

public class Task05 {
	public static void main(String[] args) {
		int [] arr = {1, 3, 5, 7, 9, 11, 45};
		int newElem = 6;
		int [] newArr = inputNewElement(arr, newElem, 0); // 0 is added for recursive index
		
		System.out.println("Old arr: " + Arrays.toString(arr));
		System.out.println("New element: " + newElem);
		System.out.println("New arr: " + Arrays.toString(newArr));
	}
	
	static int[] createArr (int [] oldArr, int newNum, int index){
		int [] newArr = new int [oldArr.length + 1];
		
		for (int i = 0, j = 0; i < newArr.length; i++, j++) {
			if(i == index){
				newArr[i] = newNum;
				j--;
				continue;
			}
			newArr[i] = oldArr[j];
		}
		
		return newArr;
	}
	
	static int [] inputNewElement (int [] arr, int newNum, int i){
		if (i == 0 && arr[i] > newNum){
			return createArr(arr, newNum, i);
			
		} else if (i == arr.length - 1) {
			if (arr[i] > newNum){
				return createArr(arr, newNum, i);
			} else {
				return createArr(arr, newNum, i + 1);
			}
			
		} else {
			if(arr[i] < newNum && newNum < arr[i + 1]){
				return createArr(arr, newNum, i + 1);
			} else {
				return inputNewElement(arr, newNum, i + 1);
			}
		}
	}
}
