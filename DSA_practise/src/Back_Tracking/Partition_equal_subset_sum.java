package Back_Tracking;

import java.util.Arrays;

public class Partition_equal_subset_sum {
	public static void main(String[] args) {
		int[] a = new int[] { 3, 3, 3, 4, 5 };
		System.out.println(partition(a));
	}

	/*
	 * below code works only for 1,5,11,5 -> 11 then yes like single integers only
	 * we need complete sub sets static boolean partition(int[] a) {
	 * System.out.println(a.length); if (a.length == 2 && a[0] == a[1]) { return
	 * true; } else if (a.length == 0 || a.length == 1) { return false; } else
	 * if(a.length>2){ LinkedList<Integer> hs = new LinkedList<Integer>(); for (int
	 * i = 0; i < a.length; i++) { hs.add(a[i]); } int k = 0; while (k < a.length) {
	 * // System.out.println(hs.get(k) + " " + sum(a, hs.get(k)));
	 * 
	 * if (hs.contains(sum(a, hs.get(k)))) { System.out.println(hs.get(k) + " " +
	 * sum(a, hs.get(k))); return true; } k++; } } return false; }
	 * 
	 * static int sum(int[] a, int skip) { int sum = 0; for (int j = 0; j <
	 * a.length; j++) { sum += a[j]; }
	 * 
	 * return sum - skip; }
	 */

	public static boolean partition(int[] a) {
		int sum = 0;
		for (int i : a)
			sum += i;
		if (sum % 2 != 0)
			return false;
		int[][] dp = new int[a.length + 1][sum];
		for (int[] i : dp) {
			Arrays.fill(i, -1);
		}
		return isPossible(a.length - 1, a, sum / 2, dp);
	}

	private static boolean isPossible(int i, int[] a, int target, int[][] dp) {
		if (target == 0)
			return false;
		if (i == 0)
			return target == a[0];
		if (dp[i][target] != -1)
			return dp[i][target] != 0;
		boolean notTake = isPossible(i - 1, a, target, dp);
		boolean take = false;
		if (target >= a[i])
			take = isPossible(i - 1, a, target - a[i], dp);

		dp[i][target] = (notTake | take) ? 1 : 0;
		return (notTake | take);
	}
}
