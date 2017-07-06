import java.util.Scanner;

///3. Масив матрица сравнен с число х и се отпечатват четните и по-големи от х числа....с рекурсия 
public class S8T1VxTask3 {
	public static void main(String[] args) {
		int [][] arr = {{1,2,3,4,5},
						{10,20,30,40,50},
						{15,43,46,1234,11}};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		printMe(arr, num, 0, 0);
		sc.close();
	}
	
	static void printMe (int[][] arr, int num, int x, int y){
		if (arr[x][y] > num && arr[x][y] % 2 ==0){
			System.out.print(arr[x][y] + ", ");
		}
		if(y + 1 < arr[x].length){
			y++;
			printMe(arr, num, x, y);
		} else if (y + 1 == arr[x].length && x + 1 < arr.length) {
			y = 0;
			x++;
			printMe(arr, num, x, y);
		} else {
			return;
		}
	}
}
