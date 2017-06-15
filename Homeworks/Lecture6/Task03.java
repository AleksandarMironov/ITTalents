
public class Task03 {
	public static void main(String[] args) {
		int [][] arr = {
				{13,9,5,1 },
				{14,10,6,2},
				{15,11,7,3},
				{16,12,8,4}
		};
		
		long sum = 0l;
		int counter = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				counter++;
			}
		}
		
		System.out.println("Sum = " + sum + "\nAverage = " + (sum / (double)counter));
	}
}
