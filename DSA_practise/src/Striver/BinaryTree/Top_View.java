package Striver.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Top_View {
	public static void main(String[] args) {

	}

	static ArrayList<Integer> topView_2(Node root) {
		ArrayList<Integer> ls = new ArrayList<>();
		if (root == null)
			return ls;

		Map<Integer, Integer> map = new TreeMap<>();
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(0, root));

		while (!q.isEmpty()) {
			Pair it = q.remove();
			int hd = it.level;

			Node temp = it.node;
			if (map.get(hd) == null)
				map.put(hd, temp.data);

			if (temp.left != null) {
				q.add(new Pair(hd - 1, temp.left));
			}
			if (temp.right != null) {
				q.add(new Pair(hd + 1, temp.right));
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			ls.add(entry.getValue());
		}

		return ls;
	}

}
