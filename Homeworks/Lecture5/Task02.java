
public class Task02 {
	public static void main(String[] args) {
		int [] originalArr = {2, 3, 4, 5, 6, 10, 11, 12, 13, 14};
		int [] newArr = new int [originalArr.length];
		
		for (int i = 0; i < newArr.length / 2; i++) {
			newArr[i] = originalArr[i];
		}
		for (int i = newArr.length - 1, j = newArr.length / 2; i >= newArr.length / 2; i--, j++) {
			newArr[j] = originalArr[i];
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
	}
}
