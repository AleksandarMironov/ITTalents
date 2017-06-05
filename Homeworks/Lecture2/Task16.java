import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		System.out.println("Enter number (100 - 999):");
		
		Scanner sc = new Scanner(System.in);
		
		short number = sc.nextByte();
		
		int digit1 = number/100;
		int digit2 = number/10%10;
		int digit3 = number%10;
		
		if(digit1 == digit2 && digit2 == digit3){
			System.out.println("Cifrite sa ravni");
		}else if (digit1 < digit2 && digit2 < digit3){
			System.out.println("Cifrite sa wuw wuzhodqsht red");
		}else if (digit1 > digit2 && digit2 > digit3){
			System.out.println("Cifrite sa w nishodqsht red");
		}else{
			System.out.println("Cifrite sa nenaredeni");
		}
		
		sc.close();
	}
}