package HashMaps;

import java.util.PriorityQueue;

public class divide_array_k_setofConsecutive {
//	h=[1,2,3,6,2,3,4,7,8] and k = 3
//			true : [123] [234] [678]
//				
//	h1 = [1,2,3,4,5] k =4
//	false :[1234] has 4 length but remaining 5 has len : 1!=4

	public static void main(String[] args) {
		int[] a = new int[] { 1,2,3,4,5 };
		System.out.println(possible(a, 4));
	}

	static boolean possible(int[] a, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i : a)
			pq.add(i);
//123623478 -> now priority Queue ma nakhya pachhi : 122334678
//as per k = 3 | will take cur=1 22334678
// now need 2 then 3 so remove : 1 234678 
//now i++ so 2 34678 | remove 3 & 4 as k=3 (234) | 2 678 and i++
// so 6 89 remove 8 & 9 so nothing left at last so true otherwise false

		while (!pq.isEmpty()) {
			int cur = pq.poll();
			for (int i = 1; i < k; i++) {
				if (!pq.remove(cur + i)) // if pq can't remove means there is still left so false
					return false;
			}
		}
		return true;
	}
}
