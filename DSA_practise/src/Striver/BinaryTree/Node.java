package Striver.BinaryTree;

public class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
	Node(int data, Node left, Node right){
		this.data= data;
		this.left=left;
		this.right=right;
	}
}
