
public class Task20 {
	public static void main(String[] args) {
		for (int i = 0; i < 10 ; i++) {
			for (int j = i + 1; j < i + 11; j++) {
				System.out.print((j % 10) + " ");
			}
			System.out.println();
		}
	}
}
