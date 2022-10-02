package Striver.String;

//Input: version1 = "0.1", version2 = "1.1"
//Output: -1
//Explanation: version1's revision 0 is "0", while version2's revision 0 is "1". 
//0 < 1, so version1 < version2.
//
//
//Input: version1 = "1.01", version2 = "1.001"
//Output: 0
//Explanation: Ignoring leading zeroes, both "01" and "001" represent the same integer "1".

public class compare_version {
	public static void main(String[] args) {
		String s1 = "1.0";
		String s2 = "1.0.0";
		System.out.println(Compare_version(s1, s2));
	}

//	Return the following:
//
//		If version1 < version2, return -1.
//		If version1 > version2, return 1.
//		Otherwise, return 0.
	static int Compare_version(String s1, String s2) {
		String[] v1 = s1.split("\\.");
		String[] v2 = s2.split("\\.");
		int len = Math.max(v1.length, v2.length);
		for (int i = 0; i < len; i++) {
			Integer val1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
			Integer val2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
			Integer compare = val1.compareTo(val2);
			if (compare != 0) {
				return compare;
			}
		}
		return 0;
	}
}
