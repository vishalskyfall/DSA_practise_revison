package Striver.Arrays;

//Input: prices = [7,1,5,3,6,4]
//Output: 5
public class Stocks_buy_sell {
	public static void main(String[] args) {
		int[] a = new int[] { 7, 1, 5, 3, 6, 4 };
		buy_sell(a);
	}

	private static void buy_sell(int[] a) {
		int i = 0, j = 0;
		int maxProfit = 0;
		while (j < a.length) {
			if (a[i] > a[j]) {
				i = j;
			} else {
				maxProfit = Math.max(a[j] - a[i], maxProfit);
				j++;
			}
		}
		System.out.println(maxProfit);
	}
}
