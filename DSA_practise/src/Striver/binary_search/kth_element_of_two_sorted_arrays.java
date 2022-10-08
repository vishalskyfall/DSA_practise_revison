package Striver.binary_search;

import java.util.ArrayList;
import java.util.List;

//Input:

//arr1[] = {2, 3, 6, 7, 9}
//arr2[] = {1, 4, 8, 10}
//k = 5
//Output:
//6
//Explanation:
//The final sorted array would be -
//1, 2, 3, 4, 6, 7, 8, 9, 10
//The 5th element of this array is 6.

public class kth_element_of_two_sorted_arrays {
	public static void main(String[] args) {
		int[] a = new int[] { 2, 3, 6, 7, 9 };
		int[] b = new int[] { 1, 4, 8, 10 };
		int k = 5;
		System.out.println(kth_ele_2_sorted_array(a, b, k));
	}

	private static int kth_ele_2_sorted_array(int[] a, int[] b, int k) {
		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 0, j = 0; i < a.length; i++, j++) {
			ls.add(a[i]);
			if (j < b.length) {
				ls.add(b[j]);
			}
		}
		System.out.println(ls);
		return ls.get(k - 1);
	}
}
