package Striver.binary_search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.

public class median_of_two_sorted_arrays {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2 };
		int[] b = new int[] { 3, 4 };
		System.out.println(median(a, b));
	}

	private static double median(int[] a, int[] b) {
		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 0, j = 0; i < a.length; i++, j++) {
			ls.add(a[i]);
			if (j < b.length) {
				ls.add(b[j]);
			}
		}
		Collections.sort(ls);
		double ans;
		System.out.println(ls.size());
		if (ls.size() == 1)
			return ls.get(0);
		if (ls.size() % 2 == 0) {
			int v1 = ls.size() / 2;
			int v2 = (ls.size() / 2) - 1;
			double value1 = (ls.get(v1) + ls.get(v2));
			ans = value1 / 2;
			System.out.println(ans);
			return (double) ans;
		} else {
			int value_q = ls.size() / 2;
			double value1 = ls.get(value_q);
			System.out.println(value1);
			return (double) value1;
		}
	}

	static double median_2(int[] a, int[] b) {
		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 0, j = 0; i < a.length; i++, j++) {
			ls.add(a[i]);
			if (j < b.length) {
				ls.add(b[j]);
			}
		}
		Collections.sort(ls);
		System.out.println(ls.size());
		double ans, sum = 0;
		for (Integer k : ls) {
			sum += k;
		}
		ans = sum / ls.size();
		return ans;
	}
}
