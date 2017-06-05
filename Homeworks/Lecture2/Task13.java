import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		System.out.println("Enter temperature (-100 : 100)");
		
		Scanner sc = new Scanner(System.in);
		
		byte t = sc.nextByte();
		
		if(t < -20){
			System.out.println("Ice cold");
		}else if(-20 <= t && t < 0){
			System.out.println("Cold");
		}else if(0 <= t && t < 15){
			System.out.println("Chill");
		}else if(15 <= t && t < 25){
			System.out.println("Hot");
		}else if(25 <= t){
			System.out.println("Very hot");
		}
		
		sc.close();
	}
}
