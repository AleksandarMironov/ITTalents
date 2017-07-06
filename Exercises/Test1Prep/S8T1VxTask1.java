import java.util.Scanner;

///1. Безкраен цикъл, да се прекрати само, ако има въведени грешни данни или Терца.
public class S8T1VxTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] cards = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};
		String str;
		
		while(true){
			System.out.println("Enter 3 cards, separated by space");
			str = sc.nextLine();
			if (str.length() != 5){
				System.out.println("Invalid");
				break;
			}
			if(!(str.charAt(0) == cards[0] || str.charAt(0) == cards[1] || str.charAt(0) == cards[2] ||
					str.charAt(0) == cards[3] || str.charAt(0) == cards[4] || str.charAt(0) == cards[5] ||
					str.charAt(0) == cards[6] || str.charAt(0) == cards[7] || str.charAt(0) == cards[8] ||
					str.charAt(0) == cards[9] || str.charAt(0) == cards[10] || str.charAt(0) == cards[11] ||
					str.charAt(0) == cards[12])){
				System.out.println("Invalid");
				break;
			}
			if(!(str.charAt(2) == cards[0] || str.charAt(2) == cards[1] || str.charAt(2) == cards[2] ||
					str.charAt(2) == cards[3] || str.charAt(2) == cards[4] || str.charAt(2) == cards[5] ||
					str.charAt(2) == cards[6] || str.charAt(2) == cards[7] || str.charAt(2) == cards[8] ||
					str.charAt(2) == cards[9] || str.charAt(2) == cards[10] || str.charAt(2) == cards[11] ||
					str.charAt(2) == cards[12])){
				System.out.println("Invalid");
				break;
			}
			if(!(str.charAt(4) == cards[0] || str.charAt(4) == cards[1] || str.charAt(4) == cards[2] ||
					str.charAt(4) == cards[3] || str.charAt(4) == cards[4] || str.charAt(4) == cards[5] ||
					str.charAt(4) == cards[6] || str.charAt(4) == cards[7] || str.charAt(4) == cards[8] ||
					str.charAt(4) == cards[9] || str.charAt(4) == cards[10] || str.charAt(4) == cards[11] ||
					str.charAt(4) == cards[12])){
				System.out.println("Invalid");
				break;
			}
			boolean flag = false;
			for (int i = 0; i < cards.length - 2; i++) {
				if (str.charAt(0) == cards[i] && str.charAt(2) == cards[i + 1] && str.charAt(4) == cards[i + 2]){
					System.out.println("TERCA");
					flag = true;
					break;
				}
			}
			if(flag){
				break;
			}
		}
		sc.close();
	}
}
