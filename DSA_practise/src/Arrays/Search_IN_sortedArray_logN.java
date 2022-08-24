package Arrays;

public class Search_IN_sortedArray_logN {

	public static void main(String[] args) {
		int check = 0;
		int[] n = { 4, 5, 6, 7, 0, 1, 2 };
		int res = search(n, check);
		System.out.println(res);
	}

	static int search(int[] n, int check) {

//		Arrays.sort(n);
		int i = 0;
		while (i < n.length) {
			if (n[i] == check) {
//				System.out.println(n[i]+" "+i);
				return i;
			}
			i++;
		}
		return -1;
	}
}
