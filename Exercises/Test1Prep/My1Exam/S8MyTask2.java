import java.util.Arrays;

//metod// return arr / + - * / :)
public class S8MyTask2 {
	public static void main(String[] args) {
		int [] arr = {10,5,3,5,3,21,4};
		int [] ans = myMetod(arr, arr[0], arr[0], arr[0], arr[0], 1);
		System.out.println(Arrays.toString(ans));
	}
	
	static int [] myMetod (int[] arr, int sum, int sub, int pro, int dev, int i){
		if (i >= arr.length){
			int [] ans = {sum, sub, pro, dev};
			return ans;
		}
		
		sum = sum + arr[i];
		sub = sub - arr[i];
		pro = pro * arr[i];
		dev = dev / arr[i];
		
		return myMetod(arr, sum, sub, pro, dev, i + 1);
	}
}
