import java.util.Scanner;

public class S5T1V1Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inp;
		
		int count = 0;
		
		while(true){
			do{
				System.out.println("Enter Heads / Tails");
				
				inp = sc.next();
			}while(!(inp.equals("Heads") || inp.equals("Tails")));
			
			if(inp.equals("Heads")){
				count++;
				if(count == 5){
					break;
				}
			} else {
				count = 0;
			}
		}
		
		System.out.println("END");
		
		sc.close();
	}
}
