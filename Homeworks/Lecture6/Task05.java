
public class Task05 {
	public static void main(String[] args) {
		int [][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		int maxColl = Integer.MIN_VALUE;
		int tempColl = 0;
		int maxRow = Integer.MIN_VALUE;
		int tempRow = 0;
		
		for (int i = 0; i < arr.length; i++) {
			tempColl = 0;
			tempRow = 0;
			for (int j = 0; j < arr[i].length; j++) { //condition is 4x4 arr
				tempRow += arr[i][j];
				tempColl += arr[j][i];
			}
			
			if (maxColl < tempColl) {
				maxColl = tempColl;
			}
			
			if (maxRow < tempRow) {
				maxRow = tempRow;
			}
		}
		
		System.out.println("Max row sum: " + maxRow);
		System.out.println("Max coll sum: " + maxColl);
		System.out.println("Max row sum is " + (maxRow > maxColl ? ">" : "<" ) + " than than max coll sum");
	}
}
