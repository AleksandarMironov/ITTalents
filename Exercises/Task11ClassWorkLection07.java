import java.util.Scanner;

public class Task11ClassWorkLection07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		
		do {
			System.out.println("Enter size of array. Rows:");
			n = sc.nextInt();
		} while (n <= 0);
		
		do {
			System.out.println("Colls:");
			m = sc.nextInt();
		} while (m <= 0);
		
		int [][] arr = new int [n][m];
		int [][] rotatedArr = new int [n][m];
		int [][] digiArr = new int [n][m];
		int [][] zigZagArr = new int [n][m]; 

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter elm " + i + " " + j + ":");
				arr[i][j] = sc.nextInt();
			}
		}
		
		// Rotated Array
		
		int i1 = 0;
		int j1 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				rotatedArr[i1][j1] = arr[i][j];
				i1++;
				if(i1 / rotatedArr.length >= 1){
					i1 = i1 % rotatedArr.length;
					j1++;
				}
			}
		}
		
		// ZigZag Array
		
		i1 = 0;
		j1 = 0;
		boolean direction = true; // change direction of new array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				zigZagArr[i1][j1] = arr[i][j];
				if(direction){
					i1++;
					if(i1 / zigZagArr.length >= 1){
						i1 = zigZagArr.length - 1;
						j1++;
						direction = false;
					}
				} else {
					i1--;
					if(i1 <= -1){
						i1 = 0;
						j1++;
						direction = true;
					}
				}
			}
		}
		
		// Diagonal Array // this was hard 
		
		i1 = 0;
		j1 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				digiArr[i1][j1] = arr[i][j];
				
				if (i1 <= 0 || j1 + 1 >= digiArr[0].length){
					i1 = j1 + i1 + 1;
					
					if(i1 >= digiArr.length){
						j1 = i1 - digiArr.length + 1;
						i1 = digiArr.length - 1;
					} else {
						j1 = 0;
					}
				} else {
					i1--;
					j1++;
				}
			}
		}
		
		//Printing
		
		System.out.println("Original:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + ", ");
			}
			System.out.println();
		}
		
		System.out.println("Rotated:");
		for (int i = 0; i < rotatedArr.length; i++) {
			for (int j = 0; j < rotatedArr[i].length; j++) {
				System.out.print(rotatedArr[i][j] + ", ");
			}
			System.out.println();
		}
		
		System.out.println("Diagonal:");
		for (int i = 0; i < digiArr.length; i++) {
			for (int j = 0; j < digiArr[i].length; j++) {
				System.out.print(digiArr[i][j] + ", ");
			}
			System.out.println();
		}
		
		System.out.println("Zig Zag:");
		for (int i = 0; i < zigZagArr.length; i++) {
			for (int j = 0; j < zigZagArr[i].length; j++) {
				System.out.print(zigZagArr[i][j] + ", ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
