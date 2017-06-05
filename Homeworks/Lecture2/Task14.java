import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		System.out.println("Enter coordinates");

		Scanner sc = new Scanner(System.in);

		byte ax = sc.nextByte();
		byte ay = sc.nextByte();
		byte bx = sc.nextByte();
		byte by = sc.nextByte();

		if ((ax + ay) % 2 == (bx + by) % 2) {
			System.out.println("Same color!");
		} else {
			System.out.println("Different color!");
		}

		sc.close();

	}
}
