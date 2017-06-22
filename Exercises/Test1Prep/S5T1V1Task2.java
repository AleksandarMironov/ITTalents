//Season 5 Test 1 v 1 Task 2. First done on paper :) 

import java.util.Scanner;

public class S5T1V1Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter some text");
		
		String input = sc.nextLine();
		
		System.out.println("Most frequent word: " + mostFreq(input));
		
		sc.close();
	}
	
	static String mostFreq (String in){
		String [] arr = in.split(" ");
		
		if(arr.length <= 1){
			return in;
		}
		
		int count = 0;
		int tempCount = 1;
		String word = "";
		
		for (int i = 0; i < arr.length - 1; i++){
			tempCount = 1;
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])){
					tempCount++;
				}
			}
			
			if(tempCount > count){
				word = arr[i];
				count = tempCount;
			}
		}
		
		return word;
	}
}
