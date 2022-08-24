package Sorting_Searching;

import java.util.HashSet;

public class K_diff_pairs_Array {

	public static void main(String[] args) {
//		int[] a = new int[] { 1,2,3,4,5};
		int[] a = new int[] { 1, 2, 4, 4, 3, 3, 0, 9, 2, 3 };
		int k = 3;
		System.out.println(findPairs(a, k));
	}

	static int findPairs(int[] a, int k) {
		int count = 0;
		HashSet<Integer> hs = new HashSet<Integer>();
		HashSet<Integer> rHS = new HashSet<Integer>();
		/*
		 * int count = 0; int i = 0; while (i < a.length) { // 1,2,4,4,3,3,0,9,2,3 for
		 * (int j = i + 1; j < a.length; j++) { if (!hs.contains(a[j])) { //
		 * System.out.println(hs.toString()); if (Math.abs(a[i] - a[j]) == k) {
		 * hs.add(a[j]); System.out.println(a[i] + " " + a[j]); count++; } } } i++; }
		 */
		for (int ele : a) {
			if (hs.contains(ele))
				rHS.add(ele); // double vala avse
			hs.add(ele); // 1,2,4,3,0,9 added here in hs
		}
		// special case if k==0
		if (k == 0)
			return rHS.size();

		// traversing through set not array
		for (int element : hs) {
			if (hs.contains(element + k)) // 1+3 = 4 yes then // 0+3 = 3 yes contains in hs total 2
											// reverse like 4-1 = 3 and 3-0 = 3 ni jagya e uper valu good logic
				count++;
		}

		return count;
	}

}
