package Striver.Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
public class Pascal_triangle {
	public static void main(String[] args) {
		triangle(5);
	}

	private static void triangle(int row) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();

		for (int i = 0; i < row; i++) {
			List<Integer> ls = new LinkedList<Integer>();
			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || j == i) {
					ls.add(1);
				} else {
					ls.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
				}
			}
			triangle.add(ls);

		}
		System.out.println(triangle);
	}

}
