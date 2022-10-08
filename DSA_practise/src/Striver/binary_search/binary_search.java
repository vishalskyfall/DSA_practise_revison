package Striver.binary_search;

import java.util.Arrays;

public class binary_search {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 5, 3, 33, 8, 56, 00 };
		System.out.println(binary_search(a, 3));
	}

	static int binary_search(int[] a, int target) {
		Arrays.sort(a);
//		Given array should be sorted.
		int n = a.length;
		int beg = 0, end = n - 1;
		while ((end - beg) > 1) {
			int mid = (beg + end) / 2;
			if (a[mid] < target) {
				beg = mid + 1;
			} else {
				end = mid;
			}
		}
		if (a[beg] == target) {
			return beg;
		} else if (a[end] == target) {
			return end;
		}
		return -1;
	}
}
