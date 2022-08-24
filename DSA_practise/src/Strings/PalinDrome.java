package Strings;

public class PalinDrome {
	public static void main(String[] args) {
		String s = "iijhjii";
		boolean f = check_palindrome(s);
		System.out.println("Is this above String palindrome ? " + f);
	}

	static boolean check_palindrome(String s) {
		s = s.toLowerCase();
		StringBuilder sb = new StringBuilder();
		/*
		 * for (char c : s.toCharArray()) { if (Character.isLetter(c) ||
		 * Character.isDigit(c)) { sb.append(c); } }
		 */
		int j = sb.length() - 1;
		for (int i = 0; i < sb.length() / 2; i++) { // middle ma lava and check from both ends
			if (sb.charAt(i) != sb.charAt(j)) {
				return false; // even ek jagya e bhi wrong thay to false so
			}
			j--;
		}

		return true; // or else true answer
	}
}
