package Arrays;

public class Buy_sell_stocks {
	public static void main(String[] args) {
		int prices[] = {7,1,5,3,6,4 };
		max_profit(prices);
	}

	static void max_profit(int[] a) {
		int i = 0, j = 0, profit = 0;
		while(j<a.length) {
			if(a[i]>a[j]) {
				i=j;
			}
			else {
				profit = Math.max((a[j]-a[i]), profit);
				j++;
			}
		}
		System.out.println(profit);
	}
}
