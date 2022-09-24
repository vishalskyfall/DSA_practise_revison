package Striver.LinkedList.day1;

import java.util.List;
import java.util.Stack;

//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class merge_2_sorted_linkedlist {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);

		ListNode h2 = new ListNode(1);
		h2.next = new ListNode(3);
		h2.next.next = new ListNode(4);

		ListNode h1 = mergeTwoList(l1, h2);
		Stack<ListNode> s = new Stack<ListNode>();
		s.add(h1);
		while (!s.isEmpty()) {
			s.add(h1.next);
			h1 = h1.next;
			if (s.peek() != null) {
				System.out.print(s.pop().val);
//			s.pop();
			}
		}

		System.out.println();
	}

	private static ListNode mergeTwoList(ListNode l1, ListNode h2) {
//		if (l1 == null)
//			return h2;
//		if (h2 == null)
//			return l1;
//
//		if (l1.val < h2.val) {
//			l1.next = mergeTwoList(l1.next, h2);
//			return l1;
//		} else {
//			h2.next = mergeTwoList(l1, h2.next);
//			return h2;
//		}

		if (l1 == null)
			return h2;
		else if (h2 == null)
			return l1;
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		while (l1 != null && h2 != null) {
			if (l1.val <= h2.val) {
				cur.next = l1;
				l1 = l1.next;
			} else {
				cur.next = h2;
				h2 = h2.next;
			}
			cur = cur.next;
		}
		cur.next = l1 == null ? h2 : l1;
		return dummy.next;
	}

}
