package Binary_Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Left_Right_view_binaryTREE {
	static class Node {
		int key;
		Node left = null, right = null;

		Node(int key) {
			this.key = key;
		}
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);  /////////      1
		root.right = new Node(3);//////////     /\
		root.left.right = new Node(5);///      2  3
//		root.right.left = new Node(5);//	  /\  /\
		root.right.right = new Node(4);//      4  5 6
//		root.right.left.left = new Node(7);//    /\
//		root.right.left.right = new Node(8);//  7  8
//		root.left.right.left= new Node(9);
//		root.left.left = new Node(99);

		leftView(root);
		rightView(root);
	}
	public static void leftView(Node root) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		leftView(root,1,map);
		for(int i=1;i<=map.size();i++) {
			System.out.print(map.get(i)+" ");
		}
	}
	public static void rightView(Node root) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		rightView(root,1,map);
		for(int i=1;i<=map.size();i++) {
			System.out.print(map.get(i)+" ");
		}
	}
	public static void leftView(Node root, int level, Map<Integer, Integer> map) {
		//base
		if(root==null)
			return;
		
		map.putIfAbsent(level, root.key);
		
		leftView(root.left,level+1,map);
		leftView(root.right,level+1,map);
	}
	public static void rightView(Node root, int level, Map<Integer, Integer> map) {
		//base
		if(root==null)
			return;
		map.putIfAbsent(level, root.key);
		
		rightView(root.right,level+1,map);
		rightView(root.left,level+1,map);
	}
}
