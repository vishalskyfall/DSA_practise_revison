package Striver.String;

//Input: haystack = "sadbutsad", needle = "sad"

//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.

public class index_of_first_occurance_in_String {
	public static void main(String[] args) {
		String s1 = "sadbutsad";
		String s2 = "butt";
		System.out.println(strStr(s1, s2));
	}

	private static int strStr(String s1, String s2) {
		if (s2.length() == 0)
			return 0;
		else if (s1.contains(s2)) {
			int i = s1.indexOf(s2);
			return i;
		} else {
			return -1;
		}
	}

}
