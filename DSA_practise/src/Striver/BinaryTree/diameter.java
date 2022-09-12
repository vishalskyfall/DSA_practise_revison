package Striver.BinaryTree;

public class diameter {
	public static void main(String[] args) {
		Node root = new Node(3);
		root.left = new Node(9);
		root.right = new Node(20);
		root.left.left = new Node(15);
//		root.left.right = new Node(7);
		System.out.println(diameter(root));
	}

	static int ans = 0;

	private static int diameter(Node root) {
		if (root == null)
			return 0;

		int left = diameter(root.left);
		int right = diameter(root.right);
		int d = depth(root.left) + depth(root.right);

		return Math.max(d, Math.max(left, right));

	}

	private static int depth(Node root) {
		if (root == null)
			return 0;

		int left = depth(root.left);
		int right = depth(root.right);

		int depth = Math.max(left, right) + 1; // 1 is root
		return depth;
	}
}
