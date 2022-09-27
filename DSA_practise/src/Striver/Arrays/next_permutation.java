package Striver.Arrays;

import java.util.Arrays;

//Input: nums = [1,2,3]
//Output: [1,3,2]
//		
//		For example, for arr = [1,2,3], the following are all the permutations 
//		of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].

public class next_permutation {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3 };
		System.out.println(next_p(a));
	}

	static String next_p(int[] a) {

		if (a == null || a.length <= 1)
			return "";

		int i = a.length - 2;

		while (i >= 0 && a[i] >= a[i + 1]) // Find 1st id i that breaks descending order
			i--;

		if (i >= 0) { // If not entirely descending
			int j = a.length - 1;// Start from the end
			while (a[j] <= a[i])// Find rightmost first larger id j
				j--;
			swap(a, i, j); // Switch i and j
		}
		reverse(a, i + 1, a.length - 1);// Reverse the descending sequence

		return Arrays.toString(a);
	}

	static void swap(int[] A, int i, int j) {
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}

	static void reverse(int[] A, int i, int j) {
		while (i < j)
			swap(A, i++, j--);
	}
}
