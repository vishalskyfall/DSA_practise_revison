package Striver.Arrays;

//Input: x = 2.00000, n = 10
//Output: 1024.00000

//Input: x = 2.00000, n = -2
//Output: 0.25000
//Explanation: 2-2 = 1/22 = 1/4 = 0.25

public class pow {
	public static void main(String[] args) {

		System.out.println(pow(2.0000, -2147483648));
	}

	static double pow(double x, int n) {
		if (n == 0)
			return 1;

		if (n < 0) {
			n = -n;
			x = 1 / x;
		}

		return (n % 2 == 0) ? pow(x * x, n / 2) : x * pow(x * x, n / 2);
		//even odd thi karyu

	}
}
