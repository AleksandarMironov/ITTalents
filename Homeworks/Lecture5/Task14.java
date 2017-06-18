
public class Task14 {
	public static void main(String[] args) {
		double[] arr = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2};
		
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (-2.99 <= arr[i] && arr[i] <= 2.99){
				counter++;
			}
		}
		
		double[] newArr = new double [counter];
		
		for (int i = 0, j = 0; i < arr.length; i++) {
			if(-2.99 <= arr[i] && arr[i] <= 2.99){
				newArr[j] = arr[i];
				j++;
			}
		}
		
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + ", ");
		}
	}
}
