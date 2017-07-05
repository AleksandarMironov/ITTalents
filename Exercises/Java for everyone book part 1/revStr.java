
public class revStr {
	public static void main(String[] args) {
		String str = "abcd n";
		System.out.println(reverce(str, str.length() - 1));
		System.out.println(reverce2(str));
	}
	
	static String reverce (String str, int i){
		if (i == 0){
			return str.substring(0,1);
		}
		return str.charAt(i) + reverce(str, i - 1);
	}
	
	static String reverce2 (String str){
		if (str.length() == 1){
			return str;
		}
		return str.charAt(str.length() - 1) + reverce2(str.substring(0, str.length() - 1));
	}
}
