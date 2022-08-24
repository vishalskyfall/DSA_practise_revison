package Sorting_Searching;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Find_all_duplicates {
	public static void main(String[] args) {
		int[] a = new int[] { 1};
		System.out.println("dupli : " + findDuplicates(a));
	}

	static List<Integer> findDuplicates(int[] a) {
		HashSet<Integer> hs = new HashSet<Integer>();
		List<Integer> ls = new LinkedList<Integer>();
		int i=0;
		while(i<a.length) {
			if(!hs.add(a[i])) {
				ls.add(a[i]);
			}
			i++;
		}
		return ls;
	}

}
