import java.util.Scanner;

//bingo// enter 3 capital letters, end after 26 different bingos// input is valid!
public class S8MyTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int [] arr = new int [26];
		
		while(true){
			String str = sc.nextLine();
			if(str.charAt(0) == str.charAt(2) && str.charAt(2) == str.charAt(4)){
				System.out.println("BINGO");
				arr[(int)(str.charAt(0) - 'A')]++;
			}
			
			counter++;
			
			boolean end = true;
			
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 0){
					end = false;
					break;
				}
			}
			
			if(end){
				break;
			}
		}
		
		System.out.println("Total: " + counter);
		
		sc.close();
	}
}
