
public class chisloNaKvadratSubirane {
	public static void main(String[] args) {
		int n = 5;
		int s = 3;
		int answer = pow(n, s, n);
		System.out.println(answer);
		
		///pow with for
		int sum = n;
		int temp = 0;
		for(int i = 0; i < s - 1 ; i++){
			temp = sum;
			for (int j = 0; j < n - 1; j++) {
				sum += temp;
			}
		}
		System.out.println(sum);
	}
	
	static int pow (int n, int s, int sum){
		if (s == 0){
			return 1;
		}
		if (s == 1){
			return n;
		}
		if (s == 2){
			int temp = sum;
			for (int i = 0; i < n - 1; i++) {
				sum += temp;
			}
			return sum;
		}
		int temp = (n > sum)? n : sum;
		for (int i = 0; i < n - 1; i++) {
			sum += temp;
		}
		return pow (n, s - 1, sum);
	}
}
