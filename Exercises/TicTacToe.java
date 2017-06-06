import java.util.Scanner;

public class TicTacToe {
	
	public static String print (char [][] board){
		StringBuilder sb = new StringBuilder();
		sb.append("  _   _   _  \n");
		for (int i = 0; i < board.length; i++) {
			sb.append("| ");
			for (int j = 0; j < board[i].length; j++) {
				sb.append(board[i][j] + " | ");
			}
			sb.append("\n  _   _   _  \n");
		}		
		return sb.toString();
	}
	
	//this will give as random number in range (from stackoverflow)
	public static int randomWithRange(int min, int max){
		   int range = (max - min) + 1;     
		   return (int)(Math.random() * range) + min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char [][] board = { {' ', ' ', ' '},
							{' ', ' ', ' '},
							{' ', ' ', ' '}
		};		
		int x;
		int y;
		
		int moveCounter = 0; //game is only 9 moves, will use this for game stop
		
		while(true){
			// player move
			do{
				System.out.println("Enter valid coordinates for your move(x y)");
				x = sc.nextInt();
				y = sc.nextInt();
			}while(x < 0 || 2 < x || y < 0 || 2 < y || board[x][y] != ' ');
			
			board[x][y] = 'x';
			moveCounter++;
			
			System.out.println(print(board));
			
			if(moveCounter>=9){
				break;
			}
			
			// computer move
			System.out.println("Computer move:");
			
			int randomPosition = randomWithRange(0, 8);
			while(board[randomPosition/3][randomPosition%3] != ' '){
				randomPosition++;
				randomPosition = randomPosition % 9; //if we go out of range
			}
			board[randomPosition/3][randomPosition%3] = 'o';
			
			moveCounter++;
			
			System.out.println(print(board) + "\n");
			
			if(moveCounter>=9){
				break;
			}
		}
		
		System.out.println("GAME OVER!!!");
		
		sc.close();
	}
}
