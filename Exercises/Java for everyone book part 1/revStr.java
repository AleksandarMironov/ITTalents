
public class revStr {
	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(reverce(str, str.length() - 1));
	}
	
	static String reverce (String str, int i){
		if (i == -1){
			return "";
		}
		return str.charAt(i) + reverce(str, i - 1);
	}
}
