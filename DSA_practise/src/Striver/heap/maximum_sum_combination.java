package Striver.heap;

import java.util.Collections;
import java.util.PriorityQueue;

//Input 1: 
//	 A = [3, 2]
//	 B = [1, 4]
//	 C = 2
// Output : 	 [7, 6]
// Explanation 1: 7     (A : 3) + (B : 4)
//							  6     (A : 2) + (B : 4)

//Return the maximum C valid sum combinations from all the possible sum combinations.
public class maximum_sum_combination {
	public static void main(String[] args) {
		int a[] = new int[] { 3, 2 };
		int b[] = new int[] { 1, 4 };
		int c = 2;
		max_sum_combo(a, b, c);

	}

	private static void max_sum_combo(int[] a, int[] b, int c) {
		// max heap.
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

		// Insert all the possible
		// combinations in max heap.
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				pq.add(a[i] + b[j]);
			}
		}

		// Pop first N elements
		// from max heap and
		// display them.
		int count = 0;
		while (count < c) {
			System.out.println(pq.peek());
			pq.remove();
			count++;
		}

	}
}
