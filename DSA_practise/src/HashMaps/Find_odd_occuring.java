package HashMaps;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Find_odd_occuring {

//	Input:  arr[] = [4, 3, 6, 2, 4, 2, 3, 4, 3, 3]
//			 
//			Output: The odd occurring elements are 4 and 6
//			 
//			6 appears once.
//			2 appears twice.
//			4 appears thrice.
//			3 appears 4 times.
	public static void main(String[] args) {

		int[] arr = { 4, 3, 6, 2, 4, 2, 3, 4, 3, 3 };
		findOddOccuring(arr);
	}

	static void findOddOccuring(int[] a) {
//		List<Integer> al = new LinkedList<Integer>();
//		for (int i : a) {
//			al.add(i);
//		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			int count =1;
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
//				System.out.println(a[i] + "  " + map.get(a[i]));
			} else { // { 4, 3, 6, 2, 4, 2, 3, 4, 3, 3 };
				map.put(a[i], count);
			}
		}
		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.get(a[i]) + " times " + a[i]);
			if(map.get(a[i])%2!=0) {
				System.out.println("The odd occurring elements are "+a[i]);
			}
		}
		
	}
}
