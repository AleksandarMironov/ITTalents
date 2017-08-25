import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<Character, Integer> inMap = new HashMap<>();
		
		System.out.println("Enter some text");
		String input = sc.nextLine().toUpperCase().trim();
		char [] inputCharArr = input.toCharArray();
		
		for (int i = 0; i < inputCharArr.length; i++) {
			if(inputCharArr[i] >= 'A' && inputCharArr[i] <= 'Z'){
				if(inMap.containsKey(inputCharArr[i])){
					inMap.put(inputCharArr[i], inMap.get(inputCharArr[i]) + 1);
				} else {
					inMap.put(inputCharArr[i], 1);
				}
			}
		}
		
		int max = Collections.max(inMap.values());
		
		ArrayList<String> outputArr = new ArrayList<>();
		
		for (Entry<Character, Integer> e : inMap.entrySet()){
			String temp = e.getKey().toString();
			temp += ": ";
			temp += e.getValue().toString();
			temp += " ";
			for (int i = 0; i < e.getValue(); i++) {
				for (int j = 0; j < input.length() / max ; j++) {
					temp += "#";
				}
			}
			outputArr.add(temp);
		}
		
		Collections.sort(outputArr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}
			
		});
		
		for (int i = 0; i < outputArr.size(); i++) {
			System.out.println(outputArr.get(i));
		}
		sc.close();
		
		System.out.println("\nSecond solution\n************************************\n");
		
		ArrayList<Entry<Character, Integer>> entryArr = new ArrayList<>();
		
		for (Entry<Character, Integer> e : inMap.entrySet()){
			entryArr.add(e);
		}
		
		Collections.sort(entryArr, new Comparator<Entry<Character, Integer>>() { 

			@Override
			public int compare(Entry<Character, Integer> e1, Entry<Character, Integer> e2) {
				return e2.getValue() - e1.getValue();
			}		
		});
		
		for (int i = 0; i < entryArr.size(); i++) {
			System.out.print(entryArr.get(i).getKey());
			System.out.print(": ");
			System.out.print(entryArr.get(i).getValue() + " ");
			for (int j = 0; j < entryArr.get(i).getValue(); j++) {
				for (int j2 = 0; j2 < 20/max; j2++) {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}