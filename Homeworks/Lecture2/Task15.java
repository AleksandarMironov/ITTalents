import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		System.out.println("Enter time [0-24]");
		
		Scanner sc = new Scanner(System.in);
		
		byte time = sc.nextByte();
		
		if(time < 4 || 18 <= time){
			System.out.println("Good evening");
		}else if(9 <= time && time < 18){
			System.out.println("Hello");
		}else if(4 <= time && time < 9){
			System.out.println("Good morning");
		}
		
		sc.close();
	}
}