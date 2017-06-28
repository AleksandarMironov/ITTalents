
public class Task11 {
	public static void main(String[] args) {
		int [] arr = { 1, 2, 3, 4, 5};
		
		//print all elements from int arr
		printArray(arr);
		
		System.out.println();
		
		//print first x elements from int arr
		printArrayRecursion(arr, arr.length);
	}
	
	static void printArray (int [] arr){
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
			if (i == arr.length - 1){
				System.out.print(" ]");
			} else {
				System.out.print(", ");
			}
		}
	}
	
	//passing arr in recursion is not the best solution but......
	static void printArrayRecursion (int [] arr, int elements){
		if(elements - 1 == 0){
			System.out.print("[ " + arr[elements - 1] + ", ");			
		} else if (elements == arr.length) {			
			printArrayRecursion(arr, elements - 1);
			System.out.print(arr[elements - 1] + " ]");
			
		} else {
			printArrayRecursion(arr, elements - 1);
			System.out.print(arr[elements - 1] + ", ");
		}
		
	}
}
