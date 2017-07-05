import java.util.Scanner;

public class s238t2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter text");
		
		String [] str = sc.nextLine().split(" ");
		
		for (int i = 0; i < str.length; i++) {
			str[i] = str[i].substring(0,1).toUpperCase() + str[i].substring(1).toLowerCase();
		}
		
		System.out.println(String.join(" ", str));	
		
		sc.close();
	}
}
