package Arrays;

import java.util.Arrays;

public class k_th_largest_array {
	public static void main(String[] args) {
		int n[] = {3,2,3,1,2,4,5,5,6};
		int k=4;
		int result = kTH_largest(n, k);
		System.out.println(result);	
	}
	static int kTH_largest(int[] n, int k) {
		Arrays.sort(n);
		return n[n.length -k] ;
	}
}
