import java.util.Arrays;

// longest words, longest sentence in chars, count sentences
public class S8MYTask3 {
	public static void main(String[] args) {
		String str = "Classes have been used since the beginning of this book. However, until now, only the most rudimentary form of a class has been shown. The classes created in the preceding chapters primarily exist simply to encapsulate the main( ) method, which has been used to demonstrate the basics of the Java syntax. As you will see, classes are substantially more powerful than the limited ones presented so far";
		myMetod(str);
	}
	
	static void myMetod (String str){
		int senteCounter = 0;
		int longestWordLen = 0;
		int longestWordIndex = 0;
		int longestSentLen = 0;
		int LongestSentIndex = 0;
		
		String [] sente = str.split("\\.");
		senteCounter = sente.length;
		
		String [] longestWords = new String [sente.length];
		
		for (int i = 0; i < sente.length; i++) {
			if (longestSentLen < sente[i].length()){
				longestSentLen = sente[i].length();
				LongestSentIndex = i;
			}
			
			String [] words = sente[i].split(" ");
			
			for (int j = 0; j < words.length; j++) {
				if(longestWordLen < words[j].length()){
					longestWordLen = words[j].length();
					longestWordIndex = j;
				}
			}
			
			longestWords[i] = words[longestWordIndex];
		}
		
		System.out.println("Longest words: " + Arrays.toString(longestWords));
		System.out.println("Longest sentence: " + sente[LongestSentIndex]);
		System.out.println("Total senteces: " + senteCounter);
	}
}
