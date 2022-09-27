package Striver.LinkedList;

//Input:    5 -> 10 -> 19 -> 28
//|        |         |        |
//V       V       V       V
//7      20      22     35
//|                 |        |
//V               V       V
//8               50     40
//|                          |
//V                        V
//30                       45
//
//Output: 5->7->8->10->19->20->22->28->30->35->40->45->50
public class flattening_linkedlist {
	public static void main(String[] args) {

	}
	class Node {
    int data;
    Node right, down;
    Node(int data)
    {
        this.data = data;
        right = null;
        down = null;
    }
}
}
