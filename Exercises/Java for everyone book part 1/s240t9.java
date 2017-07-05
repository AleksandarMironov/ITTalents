import java.util.Scanner;

public class s240t9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine().toLowerCase();
		
		int [] arr = new int [25];
		
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z'){
				arr[a.charAt(i) - 'a']++;
			}
		}
		
		int max = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			char c = (char)('a' + i);
			System.out.println(c + " -> " + arr[i] + " times");
			if(max < arr[i]){
				max = arr[i];
				index = i;
			}
		}
		
		System.out.println("Most friquent -> " + (char)('a' + index));
		
		sc.close();
	}
}
