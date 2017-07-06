import java.util.Scanner;

public class S6T1V1Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text");
		String str = sc.nextLine();
		myMetod(str);
		sc.close();
	}
	
	static void myMetod(String str){
		int sentencesCounter = 0;
		int lengthMax = 0; //length
		int lengthTemp = 0; //length temp
		int startIndex = 0; 
		int startIndexTemp = 0; 
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
				if(lengthTemp > lengthMax){
					startIndex = startIndexTemp;
					lengthMax = lengthTemp;
				}
				sentencesCounter ++;
				lengthTemp = 1;
				startIndexTemp = i;
			} else {
				lengthTemp++;
			}
		}
		
		for (int i = 0; i < lengthMax; i++) {
			System.out.print(str.charAt(i + startIndex));			
		}
		System.out.println(sentencesCounter + " sentences in the text");
	}
}
