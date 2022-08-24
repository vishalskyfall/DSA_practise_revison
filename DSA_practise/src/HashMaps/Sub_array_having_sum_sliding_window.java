package HashMaps;

public class Sub_array_having_sum_sliding_window {
//	Input:  nums[] = {2, 6, 0, 9, 7, 3, 1, 4, 1, 10}, target = 15
//			Output: {6, 0, 9}
	public static void main(String[] args) {
		// an array of positive integers
		int[] nums = { 2, 6, 0, 9, 7, 3, 1, 4, 1, 10 };
		int target = 15;

		findSubarray(nums, target);
	}

	static void findSubarray(int[] nums, int target) {
		int windowSum = 0;
		int high = 0;
		for (int low = 0; low < nums.length; low++) { // this is a classic technique for
			// using while inside for to check all possibilities
			while (windowSum < target && high < nums.length) {
				windowSum += nums[high];
				high++;
			}
			if (windowSum == target) {
				System.out.println("subarray found : " + low + " - " + (high - 1));
				return;
			}
			windowSum -= nums[low];
		}
	}
}
