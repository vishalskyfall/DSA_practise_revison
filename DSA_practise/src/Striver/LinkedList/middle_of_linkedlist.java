package Striver.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

//Input: head = [1,2,3,4,5,6]
//Output: [4,5,6]
//Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
//		
//		
//class ListNode {
//	int val;
//	ListNode next;
//	ListNode() {
//	}
//
//	ListNode(int val) {
//		this.val = val;
//	}
//
//	ListNode(int val, ListNode next) {
//		this.val = val;
//		this.next = next;
//	}
//}

public class middle_of_linkedlist {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5, 6 };
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);
		root.next.next.next.next = new ListNode(5);
//		root.next.next.next.next.next = new ListNode(6);

		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls = middle(root);
		for (Integer i : ls) {
			System.out.print(i);
		}
		System.out.println();
	}

	static LinkedList<Integer> middle(ListNode a) {

		LinkedList<Integer> ls = new LinkedList<Integer>();
		if (a == null) {
			return ls;
		}
		Stack<ListNode> s = new Stack<ListNode>();
		s.add(a);

//		int k=5;
		while (!s.isEmpty()) {
			a = s.pop();
			ls.add(a.val);
			if (a.next != null)
				s.push(a.next);
		}

		int count = ls.size();
//		System.out.println(count);
		ListNode updatedA = null;
		LinkedList<Integer> ls1 = new LinkedList<Integer>();

		for (int i = count / 2; i < count; i++) {
//			updatedA.next.val = ls.get(i);
			ls1.add(ls.get(i));
			System.out.println(ls.get(i));
		}

		return ls1;
	}
}
