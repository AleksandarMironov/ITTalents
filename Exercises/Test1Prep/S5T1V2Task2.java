import java.util.Scanner;

public class S5T1V2Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter some text");
		
		String str = sc.nextLine();
		
		int smCo = 0;
		
		int bigCo = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a'){
				smCo++;
			}
			if (str.charAt(i) <= 'Z' && str.charAt(i) >= 'A'){
				bigCo++;
			}
		}
		if (bigCo == 0 && smCo == 0){
			System.out.println("There is no letters in the text");
		} else {
			System.out.println("Ratio is " + smCo + " : " + bigCo );
		}
		sc.close();
	}
}
