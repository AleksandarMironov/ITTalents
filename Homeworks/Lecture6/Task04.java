
public class Task04 {
	public static void main(String[] args) {
		int [][] arr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
		};
		
		int [][] rotatedArr = new int [arr.length][arr[0].length];
		
		int i1 = 0;
		int j1 = rotatedArr[0].length - 1; //will use for second arr navigation
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				rotatedArr[i1][j1] = arr[i][j];
				i1++;
				if(i1 / rotatedArr.length >= 1){
					i1 = i1 % rotatedArr.length;
					j1--;
				}
			}
		}
		
		for (int i = 0; i < rotatedArr.length; i++) {
			for (int j = 0; j < rotatedArr[i].length; j++) {
				System.out.print(rotatedArr[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
