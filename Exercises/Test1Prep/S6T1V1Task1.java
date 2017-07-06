import java.util.Scanner;

public class S6T1V1Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int counter = 0;
		
		while (true){
			str = sc.nextLine();
			if (str.charAt(0) == 'A' && str.charAt(0) == 'A'){
				System.out.println("Numbers of tries: " + counter);
				break;
			}
			if(!(str.charAt(0) == '2' || str.charAt(0) == '3' || str.charAt(0) == '4' ||
					str.charAt(0) == '5' || str.charAt(0) == '6' || str.charAt(0) == '7' ||
					str.charAt(0) == '8' || str.charAt(0) == '9' || str.charAt(0) == 'T' ||
					str.charAt(0) == 'Q' || str.charAt(0) == 'J' || str.charAt(0) == 'K' ||
					str.charAt(0) == 'A' )){
				System.out.println("Invalid cards given");
			} else if(!(str.charAt(2) == '2' || str.charAt(2) == '3' || str.charAt(2) == '4' ||
					str.charAt(2) == '5' || str.charAt(2) == '6' || str.charAt(2) == '7' ||
					str.charAt(2) == '8' || str.charAt(2) == '9' || str.charAt(2) == 'T' ||
					str.charAt(2) == 'Q' || str.charAt(2) == 'J' || str.charAt(2) == 'K' ||
					str.charAt(2) == 'A' )){
				System.out.println("Invalid cards given");
			} 
			counter++;
		}
		sc.close();
	}
}
