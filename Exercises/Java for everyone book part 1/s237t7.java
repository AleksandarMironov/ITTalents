import java.util.Scanner;

public class s237t7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		paint(start, end);
		sc.close();
	}
	
	static void paint (int start, int end){
		if (start == end){
			System.out.println(start);
			return;
		}
		
		paint (start, end - 1);
		
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	
	}
}
