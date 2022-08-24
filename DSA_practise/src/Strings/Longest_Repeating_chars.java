package Strings;

public class Longest_Repeating_chars {

	public static void main(String[] args) {
		System.out.println(LRC("AABABBA", 1));
	}

	static int LRC(String s, int k) {
		int l = 0;
		int[] count = new int[26];
		int maxf = 0;
		int max = 0;

		for (int r = 0; r < s.length(); r++) {
			int current_char = s.charAt(r) - 'A';
		 System.out.println(current_char + " currentC");
			count[current_char]++;

			maxf = Math.max(maxf, count[current_char]);
			System.out.println(maxf);
			while (r - l + 1 - maxf > k) {
				count[s.charAt(l) - 'A']--;
				l++;
			}

			max = Math.max(max, r - l + 1);

		}
		return max;
	}

}
