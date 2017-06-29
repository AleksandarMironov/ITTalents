import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
	
	private static final int mineNumber = 100;
	private static final int mineHittedNumber = 666;
	private static final String mineSimbol = " *|";
	private static final String emptySimbol = "  |";
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//[0] = x [1] = y [2] = mines in field
		int [] sizeAndDifficult = difficult();
							//= inputSizeAndDifficult(); // full custom field
		int [][] gamefield = createGamefield(sizeAndDifficult);
		print(gamefield);

		int[] coordinates = new int[2]; 
		
		long startTime = System.currentTimeMillis();

		while(true){
			coordinates = getCoordinates(sizeAndDifficult[0], sizeAndDifficult[1]); 
			System.out.println(Arrays.deepToString(gamefield));
			if(hittedMine(gamefield, coordinates)){
				print(gamefield);
				System.out.println("You hitted a mine!!! You are DEAD!!! \nGAME OVER!");
				break;
			}
			
			applayCoordinates(gamefield, coordinates);
			print(gamefield);	
			
			if(checkIsWinner(gamefield)){
				System.out.println("You WIN!!! \n:) :) :)");
				break;
			}
		}
		
		long stopTime = System.currentTimeMillis();
		System.out.println("Your time: " + ((stopTime - startTime) / 1000 / 60) + ":" + ((stopTime - startTime) / 1000 % 60));	
	}
	
	//
	static boolean checkIsWinner(int [][] gamefield){
		
		for (int i = 0; i < gamefield.length; i++) {
			for (int j = 0; j < gamefield[i].length; j++) {
				if(gamefield[i][j] == Minesweeper.mineHittedNumber || gamefield[i][j] < 10){
					return false;
				}
			}
		}
		return true;
	}
	
	//check did we hitted a mine
	static boolean hittedMine (int [][] gamefield, int [] coords){
		if (gamefield[coords[0]][coords[1]] == Minesweeper.mineNumber){
			gamefield[coords[0]][coords[1]] = Minesweeper.mineHittedNumber;
			return true;
		}
		return false;
	}
	
	//gamefield change
	static void applayCoordinates (int [][] gf, int [] coords){
		//this is only because i'm to lazy to write coords[] :D 
		int x = coords[0];
		int y = coords[1];
		
		gf[x][y] +=10; // now it's visible to printer
		if(gf[x][y] % 10 == 0){
			if(x - 1 > 0 && gf[x - 1][y] < 10){
				applayCoordinates(gf, new int [] {x - 1, y});
			}
			
			if(x + 1 < gf.length  && gf[x + 1][y] < 10){		
				applayCoordinates(gf, new int [] {x + 1, y});
			}
			
			if(x - 1 > 0 && y - 1 > 0  && gf[x - 1][y - 1] < 10){		
				applayCoordinates(gf, new int [] {x - 1, y - 1});
			}
			
			if(x - 1 > 0 && y + 1 < gf[x].length  && gf[x - 1][y + 1] < 10){		
				applayCoordinates(gf, new int [] {x - 1, y + 1});
			}
			
			if(y - 1 > 0  && gf[x][y - 1] < 10){		
				applayCoordinates(gf, new int [] {x, y - 1});
			}
			
			if(y + 1 < gf[x].length  && gf[x][y + 1] < 10){		
				applayCoordinates(gf, new int [] {x, y + 1});
			}
			
			if(x + 1 < gf.length && y - 1 > 0  && gf[x + 1][y - 1] < 10){		
				applayCoordinates(gf, new int [] {x + 1, y - 1});
			}
			
			if(x + 1 < gf.length && y + 1 < gf[x].length  && gf[x + 1][y + 1] < 10){		
				applayCoordinates(gf, new int [] {x + 1, y + 1});
			}
		}
	}
	
	//get from user new coordinates to open
	static int[] getCoordinates (int sizeX, int sizeY){

		int x = 0;
		int y = 0;
		
		do{
			System.out.println("Enter x and y coordinates of field you want to hit");
			x = sc.nextInt();
			y = sc.nextInt();
		} while(!(x >= 0 && y >= 0 && x < sizeX && y < sizeY));
		
		return new int [] {x, y};
	}
	
	//print gamefield
	static void print (int [][] gamefield){
		System.out.println();
		System.out.print("__|");
		
		for (int i = 0; i < gamefield[0].length; i++) {
			System.out.printf("%02d|", i);
		}
		System.out.println();
		
		for (int i = 0; i < gamefield.length; i++) {
			System.out.printf("%02d|", i);			
			for (int j = 0; j < gamefield[i].length; j++) {
				if(gamefield[i][j] >= 10 && gamefield[i][j] < 100){
					System.out.print(" " + (gamefield[i][j] - 10) + "|");
				} else if (gamefield[i][j] == Minesweeper.mineHittedNumber){
					System.out.print(Minesweeper.mineSimbol);
				} else {
					System.out.print(Minesweeper.emptySimbol);
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//create gamefield 
	//returns gamefield 
	static int[][] createGamefield (int[] inputData){
		int [][] gamefield = new int [inputData[0]][inputData[1]];
		
		// fill the gamefield with "empty" = 0
		for (int i = 0; i < gamefield.length; i++) {
			for (int j = 0; j < gamefield[i].length; j++) {
				gamefield[i][j] = 0;
			}
		}
		
		// add mines to the gamefield, mines = mineNumber end add numbers
		Random rd = new Random();
		int tempX = 0;
		int tempY = 0;
		for (int i = 0; i < inputData[2]; i++) {
			do{		
				tempX = (Math.abs(rd.nextInt())) % inputData[0];
				tempY = (Math.abs(rd.nextInt())) % inputData[1];
				
			} while(gamefield[tempX][tempY] == Minesweeper.mineNumber);
			
			gamefield[tempX][tempY] = Minesweeper.mineNumber;
			
			if(tempX - 1 >= 0){
				gamefield[tempX - 1][tempY] = (gamefield[tempX - 1][tempY] != Minesweeper.mineNumber)? 
							gamefield[tempX - 1][tempY] + 1 : gamefield[tempX - 1][tempY];
				
				if (tempY - 1 >= 0){
					gamefield[tempX - 1][tempY - 1] = (gamefield[tempX - 1][tempY - 1] != Minesweeper.mineNumber)?
							gamefield[tempX - 1][tempY - 1] + 1 : gamefield[tempX - 1][tempY - 1];
				}
				
				if(tempY + 1 < gamefield[tempX - 1].length){
					gamefield[tempX - 1][tempY + 1] = (gamefield[tempX - 1][tempY + 1] != Minesweeper.mineNumber)?
							gamefield[tempX - 1][tempY + 1] + 1 : gamefield[tempX - 1][tempY + 1];
				}			
			}
			
			if(tempY - 1 > 0){
				gamefield[tempX][tempY - 1] = (gamefield[tempX][tempY - 1] != Minesweeper.mineNumber)?
						gamefield[tempX][tempY - 1] + 1 : gamefield[tempX][tempY - 1];
			}
			
			if(tempY + 1 < gamefield[tempX].length){
				gamefield[tempX][tempY + 1] = (gamefield[tempX][tempY + 1] != Minesweeper.mineNumber)?
						gamefield[tempX][tempY + 1] + 1 : gamefield[tempX][tempY + 1];
			}
			
			if(tempX + 1 < gamefield.length){
				gamefield[tempX + 1][tempY] = (gamefield[tempX + 1][tempY] != Minesweeper.mineNumber)?
						gamefield[tempX + 1][tempY] + 1 : gamefield[tempX + 1][tempY];
				
				if(tempY - 1 >= 0){
					gamefield[tempX + 1][tempY - 1] = (gamefield[tempX + 1][tempY - 1] != Minesweeper.mineNumber)?
							gamefield[tempX + 1][tempY - 1] + 1 : gamefield[tempX + 1][tempY - 1];
				}
				
				if(tempY + 1 < gamefield[tempX + 1].length){
					gamefield[tempX + 1][tempY + 1] = (gamefield[tempX + 1][tempY + 1] != Minesweeper.mineNumber)?
							gamefield[tempX + 1][tempY + 1] + 1 : gamefield[tempX + 1][tempY + 1];
				}
			}
		}
	
		return gamefield;
	}
	
	//get data for difficulty from user, levels
	//returns int[] -> [0] = x [1] = y [2] = mines in field
	static int[] inputSizeAndDifficult(){
	
		int x = 0;
		int y = 0;
		int mines = 0;
		
		do{
			System.out.println("Enter size of field x y:");
			x = sc.nextInt();
			y = sc.nextInt();
			
			System.out.println("Enter how many mines do you want");
			mines = sc.nextInt();
			
		}while(!(x > 1 && y > 1 && mines > 0 && mines < x * y));
		
		int [] output = {x, y, mines};

		return output;
	}
	
	//get data for difficulty from user, fully custom
	static int[] difficult (){
		int x = 0;
		int y = 0;
		int mines = 0;
		String difficultTemp = "";
		
		do{
			System.out.println("Enter difficult: (Beginner / Intermediate / Expert / Custom)");
			difficultTemp = sc.next().trim().toLowerCase();
		}while(!(difficultTemp.equalsIgnoreCase("Beginner") || difficultTemp.equalsIgnoreCase("Intermediate") 
				|| difficultTemp.equalsIgnoreCase("Expert") || difficultTemp.equalsIgnoreCase("Custom")));
		
		switch(difficultTemp){
			case "beginner":
				x = 8;
				y = 8;
				mines = 10;
				System.out.println("You choose " + difficultTemp);
				System.out.println("Size: " + x + "x" + y + "  Mines: " + mines);
				break;
				
			case "intermediate":
				x = 16;
				y = 16;
				mines = 49;
				System.out.println("You choose " + difficultTemp);
				System.out.println("Size: " + x + "x" + y + "  Mines: " + mines);
				break;
				
			case "expert":
				x = 16;
				y = 30;
				mines = 99;
				System.out.println("You choose " + difficultTemp);
				System.out.println("Size: " + x + "x" + y + "  Mines: " + mines);
				break;
				
			case "":
				x = 16;
				y = 30;				
				System.out.println("You choose " + difficultTemp);
				System.out.println("Size: " + x + "x" + y);
				do{
					System.out.println("Enter how many mines do you want:");
					mines = sc.nextInt();
				}while (mines < 0 || mines > x * y);
				break;		
		}
				
		int [] output = {x, y, mines};

		return output;
	}
} 

