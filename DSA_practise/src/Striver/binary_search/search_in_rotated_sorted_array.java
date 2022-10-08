package Striver.binary_search;

//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
public class search_in_rotated_sorted_array {
	public static void main(String[] args) {
		int[] a = new int[] { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		int n = a.length;
		System.out.println(search_unsorted(a, n, target));
		System.out.println(search_rotated_sorted(a, target));
	}

	private static int search_unsorted(int[] a, int n, int target) {
		if (a[n - 1] == target) {
			return n - 1; // 99 means found already
		}
		int backup = a[n - 1];
		a[n - 1] = target;
		for (int i = 0;; i++) {
			if (a[i] == target) {
				a[n - 1] = backup;
				if (i < n - 1) {
					return i;
				} else {
					return -1;
				}
			}
		}
	}

	static int search_rotated_sorted(int[] a, int target) {
		int i = 0;
		while (i < a.length) {
			if (a[i] == target) {
				return i;
			}
			i++;
		}
		return -1;
	}

}
