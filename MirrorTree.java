package level.hunter;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorTree {
	private static class Node<T> {
		public Node<T> left = null;
		public Node<T> right = null;
		public T data;

		public Node(T data) {
			super();
			this.data = data;
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Node<Integer> root = new Node<Integer>(3);
		Node<Integer> tempNode;
		Queue<Node> queue = new LinkedList<Node>();
		root.left = new Node<Integer>(5);
		root.right = new Node<Integer>(6);
		root.right.left = new Node<Integer>(2);
		root.right.right = new Node<Integer>(1);
		queue.add(root);
		System.out.println("After mirroring tree traversed by BFS:");

		while (!queue.isEmpty()) {
			root = queue.remove();
			tempNode = root.left;
			root.left = root.right;
			root.right = tempNode;
			System.out.println(root.data);
			if (root.left != null) {
				queue.add(root.left);
			}
			if (root.right != null) {
				queue.add(root.right);
			}
		}
	}

}
