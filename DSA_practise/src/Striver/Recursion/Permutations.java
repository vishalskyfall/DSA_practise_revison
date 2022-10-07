package Striver.Recursion;

import java.util.ArrayList;
import java.util.List;

//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

public class Permutations {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3 };
		List<List<Integer>> ls = new ArrayList<List<Integer>>();
		helper(0, a, ls);
		System.out.println(ls);
	}

	private static void helper(int i, int[] nums, List<List<Integer>> list) {
		if (i == nums.length) {
			// convert array to list
			List<Integer> temp = new ArrayList<Integer>();
			for (int j = 0; j < nums.length; j++)
				temp.add(nums[j]);

			list.add(temp);
			return;
		}

		for (int k = i; k < nums.length; k++) {
			// swapping element in array
			swap(nums, i, k);

			// solve in forward direction only
			helper(i + 1, nums, list);

			// backtracking
			swap(nums, i, k);
		}
	}

// swap the array
	private static void swap(int nums[], int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	/*
	 * converting list to string and then find permutation from Permutation_seq
	 * example private static List<List<Integer>> permutation(int[] a) { String s =
	 * ""; for(int i=0;i<a.length;i++) { s+=a[i]; } // System.out.println(s);
	 * 
	 * return null; }
	 */
}
