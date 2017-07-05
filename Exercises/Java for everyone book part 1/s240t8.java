import java.util.Scanner;

public class s240t8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		String out = "";
		for (int i = 0; i < a.length(); i++) {
			boolean contain = false;
			for (int j = 0; j < b.length(); j++) {
				if(a.charAt(i) == b.charAt(j)){
					contain = true;
				}
			}
			if(!contain){
				out = out + a.charAt(i) + " ";
			}
		}
		
		if(!out.isEmpty()){
			System.out.println("second word do not contain all leters of firs");
			System.out.println(out);
		} else {
			System.out.println("Yes");
		}
		
		sc.close();
	}
}
