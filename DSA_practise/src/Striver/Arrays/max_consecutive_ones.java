package Striver.Arrays;
//

//Input: nums = [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s.
//The maximum number of consecutive 1s is 3.

public class max_consecutive_ones {
	public static void main(String[] args) {

		int[] a = new int[] { 1, 1, 0, 1, 1, 1 };
		int ans = findMaxConsecuitive(a);
		System.out.println(ans);
	}

	private static int findMaxConsecuitive(int[] a) {
		// ones means 1s
		int maxCount = 0;
		int count = 0;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if (a[i] == 1) {
				count++;
			} else
				count = 0;
			maxCount = Math.max(maxCount, count);
		}
		return maxCount;
	}
}
