
public class Task07 {
	public static void main(String[] args) {
		int [][] arr = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
		};
		int totalSum = 0;
		int tempSum = 0;
		
		//condition is with only one loop..... 
		
		int i = 0;
		int j = 0;
		while (true){
			if((i + j) % 2 == 0){
				totalSum += arr[i][j];
				tempSum += arr[i][j];
				System.out.print(arr[i][j] + ", ");
			}
			
			j++;
			
			if(j / arr[i].length >= 1){
				j = j % arr[i].length;
				i++;
				System.out.println("Sum: " + tempSum);
				tempSum = 0;
			}
			
			if(i >= arr.length){
				System.out.println("Total sum: " + totalSum);
				break;
			}
		}
	}
}
