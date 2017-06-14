import java.util.Scanner;

public class TicTacToe {
	public static final char HUMAN_CHAR = 'x';
	public static final char COMPUTER_CHAR = 'o';
	
	// this is our printer
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
	
	// this is checking for winner
	public static char checkForWinner (char [][] board){
		char answer = ' ';
		
		if ((board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][2] == COMPUTER_CHAR) ||
				(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][2] == COMPUTER_CHAR) ||
				(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][2] == COMPUTER_CHAR) ||
				(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[2][0] == COMPUTER_CHAR) ||
				(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[2][1] == COMPUTER_CHAR) ||
				(board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[2][2] == COMPUTER_CHAR) ||
				(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] == COMPUTER_CHAR) ||
				(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] == COMPUTER_CHAR)){
			answer = COMPUTER_CHAR;
			return answer;
		}
		
		if ((board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][2] == HUMAN_CHAR) ||
				(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][2] == HUMAN_CHAR) ||
				(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][2] == HUMAN_CHAR) ||
				(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[2][0] == HUMAN_CHAR) ||
				(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[2][1] == HUMAN_CHAR) ||
				(board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[2][2] == HUMAN_CHAR) ||
				(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] == HUMAN_CHAR) ||
				(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] == HUMAN_CHAR)){
			answer = HUMAN_CHAR;
			return answer;
		}
		return answer;
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
		
		System.out.println(print(board));
		
		while(true){
			// player move
			do{
				System.out.println("Enter valid coordinates for your move(x y)");
				x = sc.nextInt();
				y = sc.nextInt();
			} while(x < 0 || 2 < x || y < 0 || 2 < y || board[x][y] != ' ');
			
			board[x][y] = HUMAN_CHAR;
			moveCounter++;
			
			System.out.println(print(board));			
			
			if (checkForWinner(board) == HUMAN_CHAR){
				System.out.println("GAME OVER!!! \nYOY WIN!!!");
				break;
			} else if (checkForWinner(board) == COMPUTER_CHAR){
				System.out.println("GAME OVER!!! \nComputer WIN!!!");
				break;
			} else if(moveCounter >= 9){
				System.out.println("GAME OVER!!! \nNo winner!!!");
				break;
			}
			
			// computer move
			System.out.println("Computer move:");
			
			int randomPosition = randomWithRange(0, 8);
			while(board[randomPosition / 3][randomPosition % 3] != ' '){
				randomPosition++;
				randomPosition = randomPosition % 9; //if we go out of range
			}
			board[randomPosition/3][randomPosition%3] = COMPUTER_CHAR;
			
			moveCounter++;
			
			System.out.println(print(board) + "\n");
			
			if (checkForWinner(board) == HUMAN_CHAR){
				System.out.println("GAME OVER!!! \nYOY WIN!!!");
				break;
			} else if (checkForWinner(board) == COMPUTER_CHAR){
				System.out.println("GAME OVER!!! \nComputer WIN!!!");
				break;
			} else if(moveCounter >= 9){
				System.out.println("GAME OVER!!! \nNo winner!!!");
				break;
			}
		}
		
		sc.close();
	}
}
