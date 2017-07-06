import java.util.Scanner;

public class S6T1V1Task4 {
	public static final char king = 'K';
	public static final char fig = 'X';
	public static final char empty = ' ';
	public static final char step = 'S';
	
	public static void main(String[] args) {
		char [][] arr = {{' ',' ',' ',' ',' ','X',' ',' '},
							{' ','X',' ',' ',' ',' ',' ',' '},
							{' ',' ','X',' ','X',' ','X',' '},
							{' ','X',' ',' ',' ','X',' ',' '},
							{'X',' ',' ',' ',' ',' ',' ',' '},
							{' ','X',' ',' ',' ','X',' ',' '},
							{' ',' ','X',' ','X','X',' ',' '},
							{' ',' ',' ',' ',' ',' ','X','X'}};
		
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		do{
			System.out.println("Enter x and y of king"); // 4 3 is for false
			x = sc.nextInt();
			y = sc.nextInt();
			if (arr[x][y] == empty){
				arr[x][y] = king;
				break;
			}
		}while(true);
		
		do{
			System.out.println("Enter x and y of knight");
			x = sc.nextInt();
			y = sc.nextInt();
			if (arr[x][y] == empty){
				break;
			}
		}while(true);
		
		boolean a = canReach (arr, x, y);
		System.out.println(a);
		
		sc.close();
	}
	
	static boolean canReach (char [][] arr, int x, int y){
		if (arr[x][y] == king){
			return true;
		}
		arr[x][y] = step;
		boolean hit = false;
		int tempX = x - 2;
		int tempY = y - 1;
		if (tempX >= 0 && tempX < arr.length && tempY >= 0 && tempY < arr[tempX].length){
			if (arr[tempX][tempY] == king){
				return true;
			} else if (arr[tempX][tempY] == empty && !hit){
				hit = canReach (arr, tempX, tempY);
			}
		}
		
		tempX = x - 2;
		tempY = y + 1;
		if (tempX >= 0 && tempX < arr.length && tempY >= 0 && tempY < arr[tempX].length){
			if (arr[tempX][tempY] == king){
				return true;
			} else if (arr[tempX][tempY] == empty && !hit){
				hit = canReach (arr, tempX, tempY);
			}
		}
		
		tempX = x - 1;
		tempY = y + 2;
		if (tempX >= 0 && tempX < arr.length && tempY >= 0 && tempY < arr[tempX].length){
			if (arr[tempX][tempY] == king){
				return true;
			} else if (arr[tempX][tempY] == empty && !hit){
				hit = canReach (arr, tempX, tempY);
			}
		}
		
		tempX = x + 1;
		tempY = y + 2;
		if (tempX >= 0 && tempX < arr.length && tempY >= 0 && tempY < arr[tempX].length){
			if (arr[tempX][tempY] == king){
				return true;
			} else if (arr[tempX][tempY] == empty && !hit){
				hit = canReach (arr, tempX, tempY);
			}
		}
		
		tempX = x + 2;
		tempY = y + 1;
		if (tempX >= 0 && tempX < arr.length && tempY >= 0 && tempY < arr[tempX].length){
			if (arr[tempX][tempY] == king){
				return true;
			} else if (arr[tempX][tempY] == empty && !hit){
				hit = canReach (arr, tempX, tempY);
			}
		}
		
		tempX = x + 2;
		tempY = y - 1;
		if (tempX >= 0 && tempX < arr.length && tempY >= 0 && tempY < arr[tempX].length){
			if (arr[tempX][tempY] == king){
				return true;
			} else if (arr[tempX][tempY] == empty && !hit){
				hit = canReach (arr, tempX, tempY);
			}
		}
		
		tempX = x + 1;
		tempY = y - 2;
		if (tempX >= 0 && tempX < arr.length && tempY >= 0 && tempY < arr[tempX].length){
			if (arr[tempX][tempY] == king){
				return true;
			} else if (arr[tempX][tempY] == empty && !hit){
				hit = canReach (arr, tempX, tempY);
			}
		}
		
		tempX = x - 1;
		tempY = y - 2;
		if (tempX >= 0 && tempX < arr.length && tempY >= 0 && tempY < arr[tempX].length){
			if (arr[tempX][tempY] == king){
				return true;
			} else if (arr[tempX][tempY] == empty && !hit){
				hit = canReach (arr, tempX, tempY);
			}
		}
		
		return hit? true : false;
	}
}
