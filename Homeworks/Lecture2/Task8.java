import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter four digihs number!");
		
		short inputNum = sc.nextShort();
		int digit1 = inputNum / 1000;
		int digit2 = (inputNum / 100) % 10;
		int digit3 = (inputNum / 10) % 10;
		int digit4 = inputNum % 10;
		
		int number1 = 10*digit1 + digit4;
		int number2 = 10*digit2 + digit3;
		
		if(number1 < number2){
			System.out.println("Bigger (" + number1 + " < " + number2 + ")");
		}else if(number1 > number2){
			System.out.println("Smaler (" + number1 + " > " + number2 + ")");
		}else{
			System.out.println("Equal (" + number1 + " = " + number2 + ")");
		}
		
		sc.close();
	}
}
