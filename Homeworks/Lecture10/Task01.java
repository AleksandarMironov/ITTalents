//Sorry for the names in this task

import java.util.Arrays;

public class Task01 {
	public static void main(String[] args) {
		int [][] arr = {{15, 16, 8, 1},
						{2, 3, 4, 7, 5, 0},
						{9, 11, 19, 6}};
		
		System.out.println("Entered array: " + Arrays.deepToString(arr));
		
		//we need this for jagged arrays
		int elmCounter = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				elmCounter++;
			}
		}
		
		int x = 0;
		int y = 0;
		int c = 0;
		int v = 0;
		
		for (int i = 0; i < elmCounter; i++) {
			x = 0;
			y = 0;
			c = 0;
			v = 0;
			
			//check the length of first row of the arr
			if(arr[0].length > 1){
				v++;
			} else {
				c++;
			}
			
			for (int j = 0; j < elmCounter - 1; j++) {
				if (arr[x][y] > arr[c][v]){
					int temp = arr[x][y];
					arr[x][y] = arr[c][v];
					arr[c][v] = temp;
				}
				
				x = c;
				y = v;
				
				v++;
				
				if(v > arr[c].length - 1){
					v = 0;
					c++;
				} 
			}
		}
		
		System.out.println("Sorted array: " + Arrays.deepToString(arr));

	}
}
