package Striver.BinaryTree;

public class Mirror_tree {
	public static void main(String[] args) {
//	check_Mirror();
	}

	boolean check_Mirror(TreeNode root) {
		return root == null ? true : isSym(root.left, root.right);

	}

	public boolean isSym(TreeNode node1, TreeNode node2) {
//Checking values of Nodes of Right and Left
		if (node1 != null && node2 != null) {
			// If they are Equal
			if (node1.val == node2.val) {
				return isSym(node1.left, node2.right) && isSym(node1.right, node2.left);
			}
		} else if (node1 == null && node2 == null) {
			return true;
		}
		return false;
	}
}
