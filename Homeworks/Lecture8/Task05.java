
public class Task05 {
	public static void main(String[] args) {
		String firstWord = "mashina";
		String secondWord = "shapka";
		boolean isCrossed = false;
		
		for (int i = 0; i < firstWord.length(); i++) {
			if (!isCrossed && firstWord.charAt(i) == secondWord.charAt(0)){
				System.out.println(secondWord);
				isCrossed = true;
			} else {
				System.out.println(firstWord.charAt(i));
			}
		}
		
		if (!isCrossed){
			System.out.println(secondWord);
		}
	}
}
