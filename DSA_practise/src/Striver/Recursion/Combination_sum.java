package Striver.Recursion;

import java.util.ArrayList;
import java.util.List;

//Input: candidates = [2,3,6,7], target = 7
//Output: [[2,2,3],[7]]
//Explanation:
//2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
//7 is a candidate, and 7 = 7.
//These are the only two combinations.
//Input: candidates = [2,3,5], target = 8
//Output: [[2,2,2,2],[2,3,3],[3,5]]

public class Combination_sum {
	public static void main(String[] args) {
		int num[] = new int[] { 2, 3, 6, 7 };
		List<List<Integer>> ls = combinationSum(num, 7);
		System.out.println(ls);
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();

		dfs(candidates, target, 0, new ArrayList<>(), res);
		return res;
	}

	public static void dfs(int[] candidates, int target, int start, List<Integer> sub, List<List<Integer>> res) {

		// base
		if (target < 0)
			return;

		if (target == 0)
			res.add(new ArrayList<Integer>(sub));

		for (int i = start; i < candidates.length; i++) {
			sub.add(candidates[i]);
			dfs(candidates, target - candidates[i], i, sub, res);
			sub.remove(sub.size() - 1);
		}
	}
}
