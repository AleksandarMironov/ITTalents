import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter some text on single line");
		char [] arr = sc.nextLine().trim().toCharArray();
		
		boolean isPalendrom = true;
		
		for (int i = 0; i < arr.length / 2; i++) {
			if(arr[i] != arr[arr.length - i - 1]){
				isPalendrom = false;
			}
		}
		
		System.out.println(isPalendrom? "Yes word is palendrom" : "No, word is not a palendrom");
		
		sc.close();
	}
}
