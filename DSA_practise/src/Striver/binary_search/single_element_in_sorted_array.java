package Striver.binary_search;

//Input: nums = [1,1,2,3,3,4,4,8,8]
//Output: 2

public class single_element_in_sorted_array {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		System.out.println(singleNonDuplicate(a));
	}

	public static int singleNonDuplicate(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == nums[mid + 1]) {
				mid--;
			}
			if ((mid - start + 1) % 2 != 0) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return nums[start];
	}
}
