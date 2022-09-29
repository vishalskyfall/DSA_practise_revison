package Striver.String;

public class roman_2_int {
	public static void main(String[] args) {
		System.out.println(roman_to_int("XIII"));
	}

	private static int roman_to_int(String s) {
		int res = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			int a = getValue(s.charAt(i)); System.out.println(a+" : "+s.charAt(i)+" "+i);
			int b = getValue(s.charAt(i + 1));System.out.println(b+" : "+s.charAt(i+1));
			if (a < b) {
				res -= a;
			} else {
				res += a;
			}
		}
		res += getValue(s.charAt(s.length() - 1)); //for last one
		return res;
	}

	static int getValue(char c) {
		if (c == 'I')
			return 1;
		else if (c == 'V')
			return 5;
		else if (c == 'X')
			return 10;
		else if (c == 'L')
			return 50;
		else if (c == 'C')
			return 100;
		else if (c == 'D')
			return 500;
		else
			return 1000;
	}
}
