package Striver.LinkedList;

public class sum_3_linkedlist {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		sum_3_linkedlist llist1 = new sum_3_linkedlist();
		sum_3_linkedlist llist2 = new sum_3_linkedlist();
		sum_3_linkedlist llist3 = new sum_3_linkedlist();
		 /* Create Linked List llist1 100->15->5->20 */
    llist1.push(20);
    llist1.push(5);
    llist1.push(15);
    llist1.push(100);

    /*create a sorted linked list 'b' 2->4->9->10 */
    llist2.push(10);
    llist2.push(9);
    llist2.push(4);
    llist2.push(2);

    /*create another sorted linked list 'c' 8->4->2->1 */
    llist3.push(1);
    llist3.push(2);
    llist3.push(4);
    llist3.push(8);

    int givenNumber = 25;
		llist1.isSumSorted(llist1, llist2, llist3, givenNumber);
	}

	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	boolean isSumSorted(sum_3_linkedlist llist1, sum_3_linkedlist llist2, sum_3_linkedlist llist3,
			int givenNumber) {
		System.out.println(givenNumber);
		Node a = llist1.head;
		while (a != null) {
			Node b = llist2.head;
			Node c = llist3.head;
			// for every node in la pick 2 nodes from lb and lc
			while (b != null && c != null) {
				int sum = a.data + b.data + c.data;
				System.out.println(sum);
				if (sum == givenNumber) {
					System.out.println("Triplet found " + a.data + " " + b.data + " " + c.data);
					return true;
				}
				// If sum is smaller then look for greater value of b
				else if (sum < givenNumber)
					b = b.next;
				else
					c = c.next;
			}
			a = a.next;
		}
		System.out.println("No Triplet found");
		return false;
	}
}
