package HashMaps;

import java.util.ArrayList;

public class find_two_dupli_XOR {
//	Input:  arr[] = [4, 3, 6, 5, 2, 4, 1, 1]
//			 
//			Output: The duplicate elements are 1 and 4
	public static void main(String[] args) {
		int[] arr = { 4, 3, 6, 5, 2, 4, 1, 1 };
		int n = 6; // array size is `n+2`

		findDuplicates(arr, n);
	}

	static void findDuplicates(int[] arr, int n) {
		ArrayList<Integer> al = new ArrayList<>();
		int i = 0;

		for (; i < arr.length - 1; i++) {
			int j = i + 1;
			while (j < arr.length) {
				if ((arr[i] ^ arr[j]) == 0) {
//					System.out.println(arr[i] + " ^ " + arr[j] + " " + i + " " + j);
					al.add(arr[i]);
				}
				j++;
			}
		}
		for (int v : al) {
			System.out.print(v+" ");
		}
	}
}
