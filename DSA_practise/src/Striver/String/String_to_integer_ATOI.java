package Striver.String;

//Input: s = "   -42"
//Output: -42
//Explanation:
//Step 1: "   -42" (leading whitespace is read and ignored)
//            ^
//Step 2: "   -42" ('-' is read, so the result should be negative)
//             ^
//Step 3: "   -42" ("42" is read in)
//               ^
//The parsed integer is -42.
//Since -42 is in the range [-231, 231 - 1], the final result is -42.

public class String_to_integer_ATOI {
	public static void main(String[] args) {
		System.out.println(myAtoi("words and 987"));
	}

	public static int myAtoi(String s) {
		int ans = 0;
		s = remove_spaces(s);

		StringBuilder sb = new StringBuilder();
		char[] cA = s.toCharArray();
		for (Character c : cA) {
			if (Character.isDigit(c) || c == '-' || c == '+') {
				sb.append(c);
			}
		}

//		System.out.println(sb);
		ans = Integer.parseInt(sb.toString());
		return ans;
	}

	static String remove_spaces(String s) {
		return s = s.replaceAll("\\s+", "");
	}
}
