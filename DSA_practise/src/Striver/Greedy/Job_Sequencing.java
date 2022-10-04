package Striver.Greedy;

import java.util.Arrays;

//Input:

//N = 4
//Jobs = {(1,4,20),(2,1,10),(3,1,40),(4,1,30)}
//Output:
//2 60
//Explanation:
//Job1 and Job3 can be done with
//maximum profit of 60 (20+40).

public class Job_Sequencing {
	class Job {
		int id, profit, deadline;

		Job(int x, int y, int z) {
			this.id = x;
			this.deadline = y;
			this.profit = z;
		}
	}

	public static void main(String[] args) {

		Job a[] = new Job[] {};

	}

	static int[] JobScheduling(Job arr[], int n) {
		Arrays.sort(arr, (a, b) -> (b.profit - a.profit));
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i].deadline > max) {
				max = arr[i].deadline;
			}
		}

		int res[] = new int[max + 1];
		// initialize all with -1 as 0 jobs on that day
		for (int i = 1; i <= max; i++) {
			res[i] = -1;
		}

		int countJob = 0, jobProfit = 0;
		for (int i = 0; i < n; i++) {
			for (int j = arr[i].deadline; j > 0; j--) {
				// free slot
				if (res[j] == -1) {
					res[j] = i;
					countJob++;
					jobProfit += arr[i].profit;
					break;
				}
			}
		}
// return array so create and return the things 
		int ans[] = new int[2];
		ans[0] = countJob;
		ans[1] = jobProfit;
		return ans;

	}
}
