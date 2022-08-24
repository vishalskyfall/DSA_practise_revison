package Sorting_Searching;

import java.util.Arrays;

public class Counting_Sort {
	public static void main(String args[]) {
		int[] data = { 10, 13, 9, 15, 7, 13 };
		int size = data.length;
		Counting_Sort cs = new Counting_Sort();
		cs.countSort(data, size);
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(data));
	}

	void countSort(int[] a, int n) {
		if (a.length == 0) {
			return;
		}
		int[] a1 = new int[n + 1];

		int x = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] > x) {
				x = a[i];
			}
		}

		// now as per x
		int[] count_arr = new int[x + 1];
		// initialize
		for (int i = 0; i < x; ++i) {
			count_arr[i] = 0;
		}
		// till n ++
		for (int i = 0; i < n; i++) {
			count_arr[a[i]]++;
		}

		// 1 to x +
		for (int i = 1; i <= x; i++) {
			count_arr[i] += count_arr[i - 1];
		}

		//most imp thing to check tomorrow
		for (int i = n - 1; i >= 0; i--) {
			a1[count_arr[a[i]] - 1] = a[i];
			count_arr[a[i]]--;
		}
		for (int i = 0; i < n; i++) {
			a[i] = a1[i];
		}
		
	}

}
