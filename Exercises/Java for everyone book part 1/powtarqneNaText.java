import java.util.Scanner;

public class powtarqneNaText {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String patern = sc.nextLine();
		
		int counter = 0;
		
		for (int i = 0; i < a.length() - patern.length() + 1; i++) {
			if(a.substring(i, i + patern.length()).equals(patern)){
				counter++;
			}
		}
		
		System.out.println(counter);
		
		sc.close();
	}
}
