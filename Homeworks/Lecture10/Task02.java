
public class Task02 {
	public static void main(String[] args) {
		int [] arr = {1, 3, 3, 7, 9, 9, 9, 9, 11, 11, 12, 14};
		int biggersArea = 0;
		int numberOfAreas = 0;
		
		int counter = 1;
		int num = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(num == arr[i]){
				counter ++;
			} else {
				if(counter > biggersArea){
					biggersArea = counter;
				}
				if(counter > 1){
					numberOfAreas++;
				}
				counter = 1;
				num = arr[i];
			}
		}
		
		System.out.println("Areas: " + numberOfAreas);
		System.out.println("Biggest area: " + biggersArea);
	}
}
