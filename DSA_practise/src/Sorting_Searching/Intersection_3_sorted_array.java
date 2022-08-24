package Sorting_Searching;

import java.util.ArrayList;
import java.util.List;

public class Intersection_3_sorted_array {

	public static void main(String[] args) {
		int a[] = new int[] { 1,2,3,9,10};
		int b[] = new int[] { 1,3,4,5,9 };
		int c[] = new int[] { 1,2,3,4,6};
		System.out.println(inter(a, b, c));
	}

	static List<Integer> inter(int[] a, int[] b, int[] c) {
		List<Integer> al = new ArrayList<Integer>();
		int ai = 0;
		int bi = 0;
		int ci = 0;
		while (ai < a.length && bi < b.length && ci < c.length) {
			if (a[ai] == b[bi] && b[bi] == c[ci]) {
				al.add(a[ai]);
				ai++;
				bi++;
				ci++;
			} else if (a[ai] <= b[bi] && a[ai] <= c[ci]) {
				ai++;
			} else if (b[bi] <= a[ai] && b[bi] <= c[ci]) {
				bi++;
			} else {
				ci++;
			}

		}

		return al;
	}
}
