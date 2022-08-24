package Strings;

/*Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

i/p : abc 
o/p: flase

i/p : abba
o/p : true
*/
public class PalinDrome_II {
	public static void main(String[] args) {
		String s = "abcca";
		boolean f = check_palindrome_II(s);
		System.out.println("Is this above String palindrome ? " + f);
	}

	static boolean check_palindrome_II(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				boolean b1, b2;
				b1 = ispalin(s.substring(i + 1, j + 1));
				System.out.println((i+1)+" "+(j+1)+" : "+s.substring(i + 1, j + 1));
				b2 = ispalin(s.substring(i, j));
				return b1 || b2;
			}
		}
		return true;
	}

	static boolean ispalin(String s) {
		for (int k = 0, v = s.length() - 1; k < v; k++, v--) {
			if (s.charAt(k++) != s.charAt(v--)) {
				return false;
			}
		}
		return true;
	}
}
