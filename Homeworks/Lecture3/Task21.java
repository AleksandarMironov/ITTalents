import java.util.Scanner;

public class Task21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 - 51");
		int card = sc.nextInt();
		
		switch(card){
			case 1:
				System.out.println("2 ♣");
			case 2:
				System.out.println("2 ♢");
			case 3:
				System.out.println("2 ♥");
			case 4:
				System.out.println("2 ♠");
			case 5:
				System.out.println("3 ♣");
			case 6:
				System.out.println("3 ♢");
			case 7:
				System.out.println("3 ♥");
			case 8:
				System.out.println("3 ♠");
			case 9:
				System.out.println("4 ♣");
			case 10:
				System.out.println("4  ♢");
			case 11:
				System.out.println("4 ♥");
			case 12:
				System.out.println("4 ♠");
			case 13:
				System.out.println("5 ♣");
			case 14:
				System.out.println("5 ♢");
			case 15:
				System.out.println("5 ♥");
			case 16:
				System.out.println("5 ♠");
			case 17:
				System.out.println("6 ♣");
			case 18:
				System.out.println("6 ♢");
			case 19:
				System.out.println("6 ♥");
			case 20:
				System.out.println("6 ♠");
			case 21:
				System.out.println("7 ♣");
			case 22:
				System.out.println("7 ♢");
			case 23:
				System.out.println("7 ♥");
			case 24:
				System.out.println("7 ♠");
			case 25:
				System.out.println("8 ♣");
			case 26:
				System.out.println("8 ♢");
			case 27:
				System.out.println("8 ♥");
			case 28:
				System.out.println("8 ♠");
			case 29:
				System.out.println("9 ♣");
			case 30:
				System.out.println("9 ♢");
			case 31:
				System.out.println("9 ♥");
			case 32:
				System.out.println("9 ♠");
			case 33:
				System.out.println("10 ♣");
			case 34:
				System.out.println("10 ♢");
			case 35:
				System.out.println("10 ♥");
			case 36:
				System.out.println("10 ♠");
			case 37:
				System.out.println("J ♣");
			case 38:
				System.out.println("J ♢");
			case 39:
				System.out.println("J ♥");
			case 40:
				System.out.println("J ♠");
			case 41:
				System.out.println("Q ♣");
			case 42:
				System.out.println("Q ♢");
			case 43:
				System.out.println("Q ♥");
			case 44:
				System.out.println("Q ♠");
			case 45:
				System.out.println("K ♣");
			case 46:
				System.out.println("K ♢");
			case 47:
				System.out.println("K ♥");
			case 48:
				System.out.println("K ♠");
			case 49:
				System.out.println("A ♣");
			case 50:
				System.out.println("A ♢");
			case 51:
				System.out.println("A ♥");
			case 52:
				System.out.println("A ♠");
				break;
			default:
				System.out.println("Wrong number!");
				break;
		}
		
		sc.close();
	}
}
