package Striver.Arrays;

import java.util.Arrays;
import java.util.LinkedList;

//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]

public class merge_2_sorted_array {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 0, 0, 0 };
		int[] b = new int[] { 2, 5, 6 };
		int m = 3, n = 3;
		merge(a, m, b, n);
	}

	private static void merge(int[] a, int m, int[] b, int n) {
		LinkedList<Integer> ls = new LinkedList<Integer>();
		int i = 0, j = 0;
		while (i < m && j < n) {
			ls.add(a[i]);
			ls.add(b[j]);
			i++;
			j++;
		}
		for (int v = 0; v < m + n; v++) {
			a[v] = ls.get(v); // because size of result is same as "a"
		}
		Arrays.sort(a);
		for(Integer ii : a) {
			System.out.print(ii);
		}
		System.out.println();
	}
}
