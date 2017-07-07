
public class S8MyTask4 {
	public static void main(String[] args) {
		char [][] arr = {{'a', 'b', 'c', 'd', 'e'},
						{'f', 'g', 'h', 'i', 'j'},
						{'k', 'l', 'm', 'n', 'o'},
						{'p', 'q', 'r', 's', 't'},
						{'u', 'v', 'x', 'y', 'z'}};
		myMetod(arr);
	}
	
	static void myMetod(char[][] arr){
		int n = (arr.length + 1) / 2;
		String [] str = new String [n];
		
		int row = 0;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				str[row] = str[row] + " ";
			}
			for (int j = i; j < str.length - i; j++) {
				str[row] = str[row] + arr[i][j];
			}
			for (int j = 0; j < i + 1; j++) {
				str[row] = str[row] + " ";
			}
			row++;
		}
		
		row = 0;
		int temp = n;
		for (int i = n - 1; i < str.length; i++) {
			for (int j = 0; j < temp; j++) {
				str[row] += " ";
			}
			for (int j = temp; j < str.length - temp; j++) {
				str[row] += arr[i][j];
			}
			row++;
			temp--;
		}
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
