
public class Task18 {
	public static void main(String[] args) {
		int [] firstArr = {18, 19, 32, 1, 3, 4, 5, 6, 7, 8};
		int [] secondArr = {1, 2, 3, 4, 5, 16, 17, 18, 27, 11};
		
		int [] combineArr = new int [firstArr.length];
		
		for (int i = 0; i < combineArr.length; i++) {
			combineArr[i] = (firstArr[i] > secondArr[i])? firstArr[i] : secondArr[i];
		}
		
		for (int i = 0; i < combineArr.length; i++) {
			System.out.print(combineArr[i] + ", ");
		}
	}
}
