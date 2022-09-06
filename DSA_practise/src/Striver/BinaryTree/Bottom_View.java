package Striver.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Pair {
	int level;
	Node node;

	Pair(int _level, Node _node) {
		this.level = _level;
		this.node = _node;
	}
}

public class Bottom_View {

	public static ArrayList<Integer> bottomView(Node root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (root == null)
			return list;
		Map<Integer, Integer> map = new TreeMap<>();
		Queue<Pair> queue = new LinkedList<>();

		queue.add(new Pair(0, root));

		while (!queue.isEmpty()) {
			Pair p = queue.remove();
			int level = p.level;
			// int data = p.data;
			Node n = p.node;

			map.put(level, n.data);

			if (n.left != null)
				queue.add(new Pair(level - 1, n.left));

			if (n.right != null)
				queue.add(new Pair(level + 1, n.right));
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			list.add(entry.getValue());
		}

		return list;

	}
}
