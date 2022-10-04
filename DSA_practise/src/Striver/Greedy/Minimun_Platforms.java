package Striver.Greedy;
//Input: n = 6 

import java.util.Arrays;

//arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
//dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
//Output: 3
//Explanation: 
//Minimum 3 platforms are required to 
//safely arrive and depart all trains.

public class Minimun_Platforms {
	public static void main(String[] args) {
		int[] start = new int[] { 900, 940, 950, 1100, 1500, 1800 };
		int[] end = new int[] { 910, 1200, 1120, 1130, 1900, 2000 };
		int ans = findPlatform(start, end, 6);
		System.out.println(ans);
	}

	// suppose for platform 1 it arrive at 9 and dep 9 10
	// then another 9 40 and dep 12pm then another possible is 15 to 19 one
	// now other 9 50 to 11 20 is on platform 2 which can also serve 18 to 20 as it
	// is not conflicting
	// platform 3 can serve 11 to 11 30 one
	// so total 3 platforms
	// arr[] = {0900, 1100, 1235}
	// dep[] = {1000, 1200, 1240}
	// for above one as you can notice no one is oper-lapping it's departure timings
	// so only 1 platform is enough

	static int findPlatform(int arr[], int dep[], int n) {
//below solution is best one for comparing two arrays 
		Arrays.sort(arr);
		Arrays.sort(dep);
		int j = 0, res = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] <= dep[j])
				res++;
			else
				j++;
		}
		return res;

	}
}
