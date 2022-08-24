package Arrays;

public class Missing_number {

	public static void main(String[] args) {
		int n[] = { 1};
		int result = missingNo(n);
		System.out.println(result);
	}

	public static int missingNo(int[] n) {
		int l = n.length;
		int total_sum = (l * (l + 1)) / 2;
		int given_sum = 0;
		for (int i = 0; i < l; i++) {
			given_sum += n[i];
		}
		return total_sum - given_sum;
	}
}
