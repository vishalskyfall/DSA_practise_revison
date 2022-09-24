package Striver.Arrays.day1;

import java.util.HashSet;

// Input: nums = [1,1,2]
//		 Output: 2, nums = [1,2,_]
public class remove_duplicate_sorted_array {
	public static void main(String[] args) {
		int[] a = new int[] { -3, -1, 0, 0, 0, 3, 3 };
		remove(a);
	}

	private static void remove(int[] a) {
//		HashSet<Integer> set = new HashSet<Integer>();
//		for (int i = 0; i < a.length; i++) {
//			set.add(a[i]);
//		}
//		int dist = set.size();
//		int index = 0;
//		for (int num : set) {
//			a[index++] = num; // because pachhad na element ni nathi padi kemna ave 
//		}
//		for (int num : a) {
//			 System.out.print(num+",");
//		}
//		System.out.println();
//		System.out.println(dist);
		int c = 0, d = 0;
		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1 && a[i] == a[i + 1]) {
				continue;
			}
			a[c] = a[i];
			c++;
		}
		System.out.println(c);
	}
}
