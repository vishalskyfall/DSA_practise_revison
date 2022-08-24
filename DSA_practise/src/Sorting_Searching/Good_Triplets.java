package Sorting_Searching;

public class Good_Triplets {
	public static void main(String[] args) {
		int[] a = new int[] { 3, 0, 1, 1, 9, 7 };
		System.out.println("Triplets : " + triplets(a, 7, 2, 3));

	}

	static int triplets(int[] a, int x, int y, int z) {
		int count = 0;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n ; j++) {
				if (Math.abs(a[i] - a[j]) <= x) {
					for (int k = j + 1; k < n; k++) {
						if (Math.abs(a[j] - a[k]) <= y) {
							if (Math.abs(a[i] - a[k]) <= z) {
								count++;
							}
						}
					}
				}
			}
		}
		return count;
	}
}
