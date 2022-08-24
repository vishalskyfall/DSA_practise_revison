package Strings;

import java.util.HashSet;

public class plaindrome_substrings {
	public static void main(String[] args) {
		System.out.println(palin_subS("longtimenosee"));
	}

	static int palin_subS(String str) {
		int count = 0;
//		HashSet<String> hs = new HashSet<String>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
//			         System.out.println(str.substring(i,j)+" "+" ispalin : "+ispalin(str.substring(i, j)));
				if (ispalin(str.substring(i, j))) {
					System.out.println(str.substring(i, j) + " " + " ispalin : " + ispalin(str.substring(i, j)));
//					hs.add(str.substring(i, j));
					count++;
				}
			}
		}
//		System.out.println(ispalin("enose"));
		return count;
	}

	static boolean ispalin(String s) {
		for (int k = 0, v = s.length() - 1; k < v; k++, v--) {
//			System.out.println(s.charAt(k) +" "+s.charAt(v)+" k: "+k+" v: "+v);
			if (s.charAt(k) != s.charAt(v)) {
//				System.out.println(s.charAt(k) +" "+s.charAt(v));
				return false;
			}

		}
		return true;
	}
}
