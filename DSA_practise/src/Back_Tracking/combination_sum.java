package Back_Tracking;

import java.util.ArrayList;
import java.util.List;

public class combination_sum {
//	arr = [1,2,3], target sum = 4
//			possible subsets are [1,1,1,1], [1,3], etc.

	public static void main(String[] args) {

		int[] candidates = new int[] { 2, 3, 6, 7 };
		combinationSum(candidates, 7);
//		System.out.println(candidates);
		for(int i=0;i<res.size();i++) {
			System.out.println(res.get(i));
		}
		
	}

	static List<List<Integer>> res = new ArrayList<List<Integer>>();

	static List<List<Integer>> combinationSum(int[] candidates, int target) {
		dfs(candidates, target, 0, new ArrayList<>());
		return res;
	}

	public static void dfs(int[] candidates, int target, int start, List<Integer> sub) {

		// base
		if (target < 0)
			return;

		if (target == 0) // jyare target 0 thai jay tyan sundhi sub ma list avi gayu hase
			res.add(new ArrayList<Integer>(sub));

		for (int i = start; i < candidates.length; i++) {
			sub.add(candidates[i]);
			dfs(candidates, target - candidates[i], i, sub);
			sub.remove(sub.size() - 1);
		}
	}

}
