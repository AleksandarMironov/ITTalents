import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		System.out.println("Enter time (only hour of day)");
		
		Scanner sc = new Scanner(System.in);		
		byte time = sc.nextByte();
		
		System.out.println("Money:");
		double money = sc.nextDouble();
		
		System.out.println("Are you sick? (true/false)");
		boolean sick = sc.nextBoolean();
		
		if(sick){
			System.out.print("I'm sick! I'll stay at home and ");
			
			if(money>0){
				System.out.print("I'll get some medicine!");
			} else{
				System.out.print("I'll drink some tea!");
			}
		}else{
			System.out.print("I'm healty! I'll ");
			
			if(money<10){
				System.out.print("go to cofe");
			} else{
				System.out.print("go to cinema");
			}
		}
		
		sc.close();
	}
}
