import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		System.out.println("Enter liters (10 - 9999)");
		
		Scanner sc = new Scanner(System.in);
		
		short liters = sc.nextShort();
		
		int times3Liters = (liters%3) == 1? liters/3-1 : liters/3;
		int times2Liters = (liters%3) == 0? 0 : (liters%3) == 2? 1 : 2; 
		
		System.out.println(times3Liters + " times 3 liters + " +
			times2Liters + " times 2 liters");
		
		sc.close();
	}
}
