package Striver.binary_search;

//1
//3 27
//3.000000
//
//3rd Root of 27 is 3.000000, as (3.000000)^3 is equal to 27.

//1
//4 69
//
//2.882121
//https://www.codingninjas.com/codestudio/problems/1062679?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website
public class Nth_root_of_M {
	public static void main(String[] args) {
		System.out.println(findNthRootOfM(3, 27));
	}

	public static double findNthRootOfM(int n, int m) {
		double low = 1;
		double high = m;
		double eps = 1e-7; // 7 zeros behind 1 so it will become 10,000,000.\
		while ((high - low) > eps) {
			double mid = (low + high) / 2.0;
			if (multiply(mid, n) < m) {
				low = mid;
			} else {
				high = mid;
			}
		} // nth root of m is low
		return low;
	}

	private static double multiply(double number, int n) {
		double ans = 1.0;
		for (int i = 1; i <= n; i++) {
			ans = ans * number;
		}
		return ans;
	}
}
