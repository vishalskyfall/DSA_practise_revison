package Sorting_Searching;

import java.util.ArrayList;
import java.util.Arrays;

public class Permute_2Arrays_sum_equal {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 2, 1};
		int[] b = new int[] {3,3,4,4};
		int k = 5; //condition i.e a[i] + b[i] >= k.
		System.out.println(check_P2S(a, b, k));
	}

	static boolean check_P2S(int[] a, int[] b, int k) {
		if (a.length != b.length)
			return false;
		int c=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		Arrays.sort(a);
		int i=b.length-1;
		while(i>=0) {
			al.add(b[i]);
			i--;
		}
		for(int j=0;j<a.length;j++) {
			if(a[j]+al.get(j)>=k) {
				c++;
			}
		}
		System.out.println(c);

		if (c>=a.length)
			
			return true;
		
		return false;

	}
}
