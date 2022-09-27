package Striver.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]

//Output: [[1,6],[8,10],[15,18]]

public class merge_overlapping_sub_intervals {
	public static void main(String[] args) {
		int[][] a = new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] b = merge(a);
		print_2d_array(b);
	}

	private static void print_2d_array(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
	}

	private static int[][] merge(int[][] a) {
		List<int[]> ans = new ArrayList<>();
		if (a.length != 0 || a != null) {
			Arrays.sort(a, (v, n) -> v[0] - n[0]);

			int start = a[0][0];
			int end = a[0][1];
			for (int[] i : a) {
				if (i[0] <= end) {
					end = Math.max(end, i[1]);
				} else {
					ans.add(new int[] { start, end });
					start = i[0];
					end = i[1];
				}
			}
			ans.add(new int[] { start, end });

		}
		return ans.toArray(new int[0][]);
	}
}
