
public class task12 {
		public static void main(String[] args) {
					
		int firstDigit;
		int secondDigit;
		int tirdDigit;
		
		for (int i = 100; i < 1000; i++){
			firstDigit = i / 100;
			secondDigit = (i / 10) % 10;
			tirdDigit = i % 10;
			
			if (firstDigit != secondDigit && 
					firstDigit != tirdDigit && 
					secondDigit != tirdDigit){
				System.out.println(i);
			}
		}
	}
}
