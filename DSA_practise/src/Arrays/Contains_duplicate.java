package Arrays;

import java.util.Arrays;

public class Contains_duplicate {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5 };
		boolean check = contains(a);
		System.out.println("duplicate contains : " + check);
	}

	static boolean contains(int[] n) {
		/*
		 * int i = 0; int j = 1; int c; boolean check = false; while (i < n.length - 1)
		 * {
		 * 
		 * while (j < n.length) { // System.out.println((n[i] ^ n[j]) + " " +n[i]+" ^ "+
		 * n[j]); c = (n[i] ^ n[j]); if (c == 0) { check = true; break; } j++; } i++; j
		 * = i + 1; }
		 */

		Arrays.sort(n);
		int i = 0;
		int c;
		boolean check = false;
		while (i < n.length - 1) {

			c = n[i] ^ n[i + 1];
			if (c == 0) {
				check = true;
				break;
			}
			i++;
		}

		return check;
	}
}
