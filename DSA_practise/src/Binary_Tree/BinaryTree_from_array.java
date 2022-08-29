package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree_from_array {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class Binary_Tree {
		static int idx = -1;

		public static Node buildTree(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);

			return newNode;
		}
	}

	public static void preOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void InOrder(Node root) {
		if (root == null)
			return;
		InOrder(root.left);
		System.out.print(root.data + " ");
		InOrder(root.right);
	}

	public static void postOrder(Node root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static void LevelOrder(Node root) { // FIFO Queue
		// siblings pela children add thai jay with null
		// breadth first
		
		if(root==null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);

		while (!q.isEmpty()) {
			Node currNode = q.remove();
			if (currNode == null) {
				System.out.println();
				if (q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			} else {
				System.out.println(currNode.data);
				if (currNode.left != null) {
					q.add(currNode.left);
				}
				if (currNode.right != null) {
					q.add(currNode.right);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] nodes = new int[] { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1, };
		Binary_Tree tree = new Binary_Tree();
		Node root = tree.buildTree(nodes);
		System.out.println(root.data);
//		preOrder(root);
//		InOrder(root);
//		postOrder(root);
		LevelOrder(root);
	}
}
