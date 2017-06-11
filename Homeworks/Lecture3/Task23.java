
public class Task23 {
	public static void main(String[] args) {
		int i = 1;
		while (i < 10){
			int j = i;
			while(j < 10){
				System.out.print(i + "*" + j + "; ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
