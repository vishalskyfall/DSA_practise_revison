package Arrays;

public class Maximum_SubArray_Kadene {

	public static void main(String[] args) {
		int a[] = {1,2,-4,3,4,6};
		int sum = maxSubArray(a);
		System.out.println(sum);
	}
	public static int maxSubArray(int[] a) {
		int maxsum = Integer.MIN_VALUE;
		int currentSum = 0;
		for (int i = 0; i < a.length; i++) {
			currentSum += a[i];
			if (currentSum > maxsum) {
				maxsum = currentSum;
			}
			if (currentSum < 0) {
				currentSum = 0;
			}
		}
		return maxsum;
	}
}
