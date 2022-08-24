package Sorting_Searching;

public class Max_SUM_Non_adj_elements {
	/*
	 * example> [5, 20, 15, -2, 18] => 20 + 18 = 38 | [4, 1, 6, 3, 2] => 4 + 6 + 2 =
	 * 12
	 */
	public static void main(String[] args) {

		int[] a = new int[] { 4, 1, 6, 3, 2 };
		System.out.println("Max_sum : " +	 sum2(a));
	}

	/*
	 * static int sum(int[] a) { HashSet<Integer> hs = new HashSet<Integer>(); int
	 * maxSum = Integer.MIN_VALUE; int i = 0, sum = 0; while (i < a.length) { for
	 * (int j = i + 1; j < a.length; j++) { sum = a[i] + a[j]; if (sum > maxSum) {
	 * maxSum = sum; } }
	 * 
	 * i++; } return maxSum; }
	 */

	static int sum2(int[] a) {
		if (a.length == 0)
			return 0;
		int cur = 0;
		int cur1 = a[0];
		int cur2 = 0;
		for (int i = 1; i < a.length; i++) { // 4, 1, 6, 3, 2
			System.out.println("cur: " + cur + " cur1: " + cur1 + " cur2: " + cur2);
			cur = Math.max(cur1, cur2);
			cur1 = cur2 + a[i];
			cur2 = cur;
		}
		return Math.max(cur1, cur2);
	}
}
