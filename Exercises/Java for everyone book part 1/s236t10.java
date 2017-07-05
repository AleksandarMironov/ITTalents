import java.util.Arrays;

public class s236t10 {
	public static void main(String[] args) {
		int [] f = {1,2,8,4,5};
		int [] s = {1,9,4,7,3,8,4};
		int [] ne = new int [f.length + s.length];
		
		for (int i = 0; i < f.length; i++) {
			ne[i] = f[i];
		}
		
		for (int i = 0; i < s.length; i++) {
			ne[i + f.length - 1] = s[i];
		}
		
		for (int i = 0; i < ne.length; i++) {
			for (int j = i; j < ne.length; j++) {
				if(ne[i] > ne[j]){
					int temp = ne[i];
					ne[i] = ne[j];
					ne[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ne));
	}
}
