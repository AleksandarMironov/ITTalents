package S8T2Schetovoditeli;

import java.util.Random;

public class UT {
public static Random ran = new Random();
	
	public static int intInRange(int start, int stop){
		return (ran.nextInt(stop + 1 - start) + start);
	}
	
	public static int intFrom0To(int end){
		return (ran.nextInt(end + 1));
	}
	
	public static String randomString (int length){
		String s = "";
		
		for (int i = 0; i < length; i++) {
			s += (char)intInRange(97, 122);
		}
		return s;
	}
	
	public static String randomString (){
		int length = ran.nextInt(100) + 1;
		return randomString(length);
	}
	
	public static String randomNumberString (int length){
		String s = "";
		
		for (int i = 0; i < length; i++) {
			s += (char)intInRange(48, 57);
		}
		return s;
	}
}
