package Striver.LinkedList;

//Input: head = [1,2,2,1]
//Output: true

public class palindrom_linkedlist {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);

		System.out.println(palin(head));
	}

	public static boolean palin(ListNode head) {
		root = head;
		return (head==null)? true : _palin(head);
	}

	public static ListNode root;

	public static boolean _palin(ListNode h) {
		boolean flag = true;
		if (h.next != null) {
			flag = _palin(h.next);
		}
		if (flag && root.val == h.val) {
			root = root.next;
			return true;
		}
		return false;
	}
}
