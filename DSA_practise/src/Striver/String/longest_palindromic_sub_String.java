package Striver.String;

//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.

public class longest_palindromic_sub_String {
	public static void main(String[] args) {
		System.out.println(longestPalindrome("babad"));
	}

	private static String longestPalindrome(String s) {

		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			int low = i, high = i;
			while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
				if (ans.length() < high - low + 1) {
					ans = s.substring(low, high + 1);
				}
				low--;
				high++;
			}
			low = i;
			high = i + 1;
			while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
				if (ans.length() < high - low + 1) {
					ans = s.substring(low, high + 1);
				}
				low--;
				high++;
			}
		}
		return ans;
	}
}
