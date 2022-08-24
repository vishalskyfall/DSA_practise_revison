package Arrays;

/*Find the minimum and maximum element in an array using minimum comparisons
Input:  nums[] = [5, 7, 2, 4, 9, 6]
		 
Output:
 
The minimum array element is 2
The maximum array element is 9*/

public class Max_Min_find {

	public static void main(String[] args) {
		int[] nums = { 4, 7, 5, 1, 3 };

		findMinAndMax(nums);
	}

	public static void findMinAndMax(int[] nums) {
		// initialize both with infinity
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		int n = nums.length;

		/*
		 * if n is odd then ignore last element and consider it later found this logic
		 * check
		 */
		boolean odd = (n & 1) == 1;
		System.out.println(n & 1);
		if (odd) {
			n--;
		}
		// compare elements in pairs, i.e., nums[i] and nums[i+1]
		for (int i = 0; i < n; i = i + 2) {
			int minimum, maximum;
			if (nums[i] > nums[i + 1]) { // 1st check
				minimum = nums[i + 1];
				maximum = nums[i];
			} else {
				minimum = nums[i];
				maximum = nums[i + 1];
			}

			// updating min - max
			if (maximum > max) {
				max = maximum;
			}
			if (minimum < min) {
				min = minimum;
			}
		}

		// without below code it will work but we need to be sure about odd number of
		// elements
		if (odd) {
			if (nums[n] > max) {
				max = nums[n];
			}
			if (nums[n] < min) {
				min = nums[n];
			}
		}

		System.out.println("The minimum array element is " + min);
		System.out.println("The maximum array element is " + max);
	}
}
