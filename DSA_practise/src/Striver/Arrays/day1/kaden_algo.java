package Striver.Arrays.day1;

//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]

//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.

public class kaden_algo {
	public static void main(String[] args) {
		int[] a = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int sum = kaden(a);
		System.out.println(sum);
	}

	private static int kaden(int[] a) {

		int sum = Integer.MIN_VALUE;
		int curSum = 0;
		int i = 0;
		while (i < a.length) {
			curSum += a[i];
			System.out.println(sum + " sum");
			if (curSum > sum)
				sum = curSum;
			if (curSum < 0) {
				curSum = 0;
				
//			System.out.println(curSum + " cur");
			}
			i++;
		}

		return sum;
	}
}
