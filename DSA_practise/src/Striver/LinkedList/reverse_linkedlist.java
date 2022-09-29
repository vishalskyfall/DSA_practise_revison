package Striver.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class reverse_linkedlist {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5, 6 };
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);
		root.next.next.next.next = new ListNode(5);

		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls = reverse(root);
		for (Integer i : ls) {
			System.out.print(i);
		}
		System.out.println();

	}

	// iterative
	static LinkedList<Integer> reverse(ListNode head) {
		LinkedList<Integer> ls1 = new LinkedList<Integer>();
		ls1 = Node_2_List(head);
		Collections.reverse(ls1);
		ListNode test = List_2_Node(ls1);
		ls1 =Node_2_List(test);
//		ListNode newHead = null;
//		while (head != null) {
//			ListNode next = head.next;
//			head.next = newHead;
//			newHead = head;
//			head = next;
//		}
		return ls1;
	}

	static LinkedList<Integer> Node_2_List(ListNode a) {
		LinkedList<Integer> ls = new LinkedList<Integer>();
		if (a == null) {
			return ls;
		}
		Stack<ListNode> s = new Stack<ListNode>();
		s.add(a);

		while (!s.isEmpty()) {
			a = s.pop();
			ls.add(a.val);
			if (a.next != null)
				s.push(a.next);
		}
		return ls;
	}
	
	static ListNode List_2_Node(LinkedList<Integer> ls) {
		ListNode test = new ListNode();
		Stack<Integer> s = new Stack<>();

	
		while(!ls.isEmpty()) {
			s.add(ls.pop());
			test.val = s.pop();
		}
		
		return null;
	}

	// recursive
	static ListNode rec_reverse(ListNode head) {
		return reverseListInt(head, null);

	}

	private static ListNode reverseListInt(ListNode head, ListNode newHead) {
		if (head == null)
			return newHead;
		ListNode next = head.next;
		head.next = newHead;
		return reverseListInt(next, head);
	}
}
