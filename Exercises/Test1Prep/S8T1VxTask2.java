import java.util.Scanner;

///2. Стринг, да се подредят думите, или буквите не съм сигурен, по азбучен ред. Решаване с метод. Приемаме че са буквите
public class S8T1VxTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some text");
		
		String str = sc.nextLine();
		myMetod(str);
		
		sc.close();
	}
	
	static void myMetod(String str){
		int [] arr = new int [25];
		String tempStr = str.toLowerCase();
		
		for (int i = 0; i < tempStr.length(); i++) {
			if(tempStr.charAt(i) >= 'a' && tempStr.charAt(i) <= 'z'){
				arr[tempStr.charAt(i) - 'a']++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				System.out.print((char)(i + 'a'));
			}
		}
	}
}
