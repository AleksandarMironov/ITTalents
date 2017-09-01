package vinetki;

import java.util.Random;

public class RanGen {
	static Random r = new Random();
	
	static int intInRange(int start, int stop){
		return (r.nextInt(stop + 1 - start) + start);
	}
	
	static int intFrom0To(int end){
		return (r.nextInt(end + 1));
	}
	
	static String randomString (int length){
		String s = "";
		
		for (int i = 0; i < length; i++) {
			s += (char)intInRange(97, 122);
		}
		return s;
	}
	
	static String randomString (){
		int length = r.nextInt(100) + 1;
		return randomString(length);
	}
	
	static String randomNumberString (int length){
		String s = "";
		
		for (int i = 0; i < length; i++) {
			s += (char)intInRange(48, 57);
		}
		return s;
	}
}
