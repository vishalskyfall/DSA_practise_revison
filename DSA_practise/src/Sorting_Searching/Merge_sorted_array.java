package Sorting_Searching;

import java.util.Arrays;
import java.util.LinkedList;

public class Merge_sorted_array {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 0, 0, 0 };
		int[] b = new int[] { 2, 5, 8 };
		merge_sorted(a, 3, b, 3);
	}

	static void merge_sorted(int[] a, int m, int[] b, int n) {
		LinkedList<Integer> ls = new LinkedList<>();
		int[] res = new int[m + n];
		int i = 0, j = 0;
		while (i < m) {
			ls.add(a[i]);
			i++;
		}
		while (j < n) {
			ls.add(b[j]);
			j++;
		}
		for (int v = 0; v < m + n; v++) {
			res[v] = ls.get(v);
		}
		Arrays.sort(res);
		System.out.println(Arrays.toString(res));
		// or as per leetcode print sorted a
		/*
		 * for(int v:res) { System.out.print(v); }
		 */
//		int i = 0, j = 0;
//		while (i < m) {
//			ls.add(a[i]);
//			i++; 
//		}
//		while(j<n) {
//			ls.add(b[j]);
//			j++;
//		}
//		for(int v=0;v<m+n;v++) {
//			a[v]=ls.get(v);
//		}
//		Arrays.sort(a);
	}
}
