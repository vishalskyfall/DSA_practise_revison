package Arrays;

import java.util.Arrays;

/*
Input :  arr[] = {1, 2, 3, 4, 5, 6}
Output : arr[] = {6, 5, 4, 3, 2, 1}*/

public class Reverse_Array {

	public static void main(String[] args) {

		int[] n = { 1, 2, 3, 4, 5, 6 };
		reverse_str(n);
		reverse_compare(n);
	}

	public static void reverse_str(int[] n) {
		String n1 = Arrays.toString(n);
		String n2 = "";
		int i = n1.length() - 1;
		while (i >= 0) {
			n2 += n1.charAt(i);
//			System.out.println(i+""+n1.charAt(i));
			i--;
		}
		System.out.println(n1 + " " + n2);

		// not so good approach
	}

	public static void reverse_compare(int[] n) {

		int start = 0;
		int end = n.length - 1;
		while (start < end) {
			// swap n[start] n[end]
			int temp = n[start];
			n[start] = n[end];
			n[end] = temp;
			start = start + 1;
			end = end - 1;
		}
		int i=0;
		while(i<n.length) {
			System.out.print(n[i]+" ");
			i++;
		}
	}
}
