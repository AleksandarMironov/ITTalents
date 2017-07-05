import java.util.Scanner;

public class s237t8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		System.out.println(isSimple(num, 2));
		sc.close();
	}
	
	static boolean isSimple(int num, int i){
		if(num < 1){
			return false;
		}
		if(i >= num){
			return true;
		}
		if(num % i == 0){
			return false;
		}
		
		return isSimple(num, i + 1);
	}
}
