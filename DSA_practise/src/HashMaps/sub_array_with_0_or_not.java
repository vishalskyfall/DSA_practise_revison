package HashMaps;

import java.util.HashSet;
import java.util.Set;

//Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
//
//Output: Subarray with zero-sum exists
// 
//The subarrays with a sum of 0 are:
// 
//{ 3, 4, -7 }
//{ 4, -7, 3 }
//{ -7, 3, 1, 3 }
//{ 3, 1, -4 }
//{ 3, 1, 3, 1, -4, -2, -2 }
//{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
public class sub_array_with_0_or_not {
	public static void main(String[] args) {
		int[] nums = { 4, -6, 3, -1, 4, 2, 7 };

		if (hasZeroSumSubarray(nums)) {
			System.out.println("Subarray exists");
		} else {
			System.out.println("Subarray does not exist");
		}
	}

	static boolean hasZeroSumSubarray(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(0);
		int sum = 0;
		for (int value : nums) {
			sum += value;
			if (set.contains(sum)) {
				return true;
			}
			set.add(sum);
		}
		return false;
//		return false;
	}
}
