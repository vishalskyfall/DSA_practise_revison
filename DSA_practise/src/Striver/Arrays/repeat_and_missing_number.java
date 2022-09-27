package Striver.Arrays;

//Input: nums = [3,0,1]
//Output: 2
public class repeat_and_missing_number {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 0, 3 };
		missing(a);
	}

	private static void missing(int[] a) {
		int length = a.length;
		int total_sum = (length * (length + 1)) / 2;
		int given_sum = 0;
		for (int i = 0; i < length; i++) {
			given_sum += a[i];
		}
		System.out.println(total_sum - given_sum);
	}

}
