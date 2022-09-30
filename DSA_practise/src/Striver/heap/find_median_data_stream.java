package Striver.heap;

import java.util.PriorityQueue;

//Input
//["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"]
//[[], [1], [2], [], [3], []]
//Output
//[null, null, null, 1.5, null, 2.0]
//
//Explanation
//MedianFinder medianFinder = new MedianFinder();
//medianFinder.addNum(1);    // arr = [1]
//medianFinder.addNum(2);    // arr = [1, 2]
//medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
//medianFinder.addNum(3);    // arr[1, 2, 3]
//medianFinder.findMedian(); // return 2.0

public class find_median_data_stream {
	PriorityQueue<Integer> left;
	PriorityQueue<Integer> right;

	public static void main(String[] args) {

	}

	public find_median_data_stream() {
		right = new PriorityQueue<>();
		left = new PriorityQueue<>((a, b) -> b - a);
	}

	public double findMedian() {
		return left.size() != right.size() ? left.peek() : (double) (left.peek() + right.peek()) / 2;
	}

	public void addNum(int num) {

		if (left.isEmpty() || num < left.peek()) {
			left.add(num);
		} else
			right.add(num);

		if (left.size() > right.size()) {
			right.add(left.poll());
		}
		if (right.size() > left.size()) {
			left.add(right.poll()); // poll is like pop
		}

	}
}
