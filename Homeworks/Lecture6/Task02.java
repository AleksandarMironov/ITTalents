import java.util.Scanner;

public class Task02 {
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
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter elm " + i + " " + j + ":");
				arr[i][j] = sc.nextInt();
			}
		}
		int maxDig = arr.length < arr[0].length ? arr.length : arr[0].length;
		
		for (int i = 0; i < maxDig; i++) {
			System.out.print(arr[i][i] + ", ");
		}
		System.out.println();
		
		for (int i = 0; i < maxDig; i++) {
			System.out.print(arr[i][maxDig - 1 - i] + ", ");
		}
		
		sc.close();
	}
}
