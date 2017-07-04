import java.util.Scanner;

public class S5T1V2Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int count7 = 0;
		while(true){
			int a = 0;
			int b = 0;
			do{
				System.out.println("Enter first dice");
				a = sc.nextInt();
				
				System.out.println("Enter second dice");
				b = sc.nextInt();
				
			}while(!(a < 7 && a > 0 && b < 7 && b > 0));
			
			if(a + b == 7){
				count7++;
			} else {
				count7 = 0;
			}
			
			counter++;
			
			if (count7 == 7){
				break;
			}
		}
		
		System.out.println("You roll " + counter + " times");
		
		sc.close();
	}
}
