package Striver.heap;

import java.util.Arrays;
import java.util.Random;

//Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
//Output: 4
public class kth_largest_heap {
	public static void main(String[] args) {
		int a[] = new int[] { 5, 3, 2, 9, 4, 0 };
		int k = 2;
		System.out.println(findKthLargest(a, k));
		System.out.println(findkthLarget_quickselect(a, k));

	}

	public static int findKthLargest(int[] n, int k) {
		Arrays.sort(n);
		return n[n.length - k];
	}

	public static int findkthLarget_quickselect(int[] nums, int k) {
		return quickSelect(nums, 0, nums.length - 1, k);
	}

	private static int quickSelect(int[] nums, int left, int right, int k) {
		int pivot = left;
		// use quick sort's idea
		// put nums that are <= pivot to the left
		// put nums that are > pivot to the right
		for (int j = left; j < right; j++) {
			if (nums[j] <= nums[right]) {
				swap(nums, pivot++, j);
			}
		}
		swap(nums, pivot, right);

		// count the nums that are > pivot from high
		int count = right - pivot + 1;
		// pivot is the one!
		if (count == k)
			return nums[pivot];
		// pivot is too small, so it must be on the right
		if (count > k)
			return quickSelect(nums, pivot + 1, right, k);
		// pivot is too big, so it must be on the left
		return quickSelect(nums, left, pivot - 1, k - count);
	}

	private static void swap(int[] nums, int x, int y) {
		int temp = nums[x];
		nums[x] = nums[y];
		nums[y] = temp;
	}
}
