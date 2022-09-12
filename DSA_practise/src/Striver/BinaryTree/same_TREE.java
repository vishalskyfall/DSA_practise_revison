package Striver.BinaryTree;

public class same_TREE {
	public static void main(String[] args) {
		Node root = new Node(3);
		root.left = new Node(9);
		root.right = new Node(20);
		root.left.left = new Node(15);
		root.left.right = new Node(7);

		Node r = new Node(3);
		r.left = new Node(9);
		r.right = new Node(20);
		r.left.left = new Node(5);
		r.left.right = new Node(7);

		System.out.println(same_TREE(root, r));
	}

	private static boolean same_TREE(Node p, Node q) {
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;

		if (depth(p) != depth(q)) {
			return false;
		}

		if (p.data == q.data) {
			return same_TREE(p.left, q.left) && same_TREE(p.right, q.right);
		}

		return false;
	}

	static int depth(Node root) {
		if (root == null)
			return 0;

		int left = depth(root.left);
		int right = depth(root.right);

		int depth = Math.max(left, right) + 1; // 1 is root
		return depth;
	}
}
