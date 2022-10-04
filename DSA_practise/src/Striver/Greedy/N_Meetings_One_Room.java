package Striver.Greedy;

import java.util.ArrayList;
import java.util.Collections;

//Input:
//N = 6
//start[] = {1,3,0,5,8,5}
//end[] =  {2,4,6,7,9,9}
//Output: 
//4
//Explanation:
//Maximum four meetings can be held with
//given start and end timings.
//The meetings are - (1, 2),(3, 4), (5,7) and (8,9)

public class N_Meetings_One_Room {
	public static void main(String[] args) {

		int[] start = new int[] { 10, 12, 20 };
		int[] end = new int[] { 20, 25, 30 };
		int ans = maxMeetings(start, end, 3);
		System.out.println(ans);
	}

	public static int maxMeetings(int start[], int end[], int n) {
		int count = 1;

		// two conditions as my way
		// a[i]
		// b[j]
		// -> b[0]<a[1] || b[1]<a[2]
		// first 2<3 (1,2) in (+1)
		// 3>2 so (3,4) in (+1)
		// 4!<0 so not the (0,6)
		// now we're skipping (0,6) so 4<5 or say 5<4 add (5,7) (+1)
		// 7<8 (8,9) added (+1)
		// 9!<5 so skip (5,9)
		// total 4
// below code is sort of working for few inputs 
//		for (int i = 0; i < start.length; i++) {
//			for (int j = i + 1; j < end.length; j++) {
//				if (end[i] < start[j]) {
//					System.out.println(end[i] + " " + start[j]);
//					i++;
//					count++;
//				}
//			}
//		}
//		System.out.println(count);

		ArrayList<int[]> al = new ArrayList<int[]>();
		 for(int i = 0; i < n; i++)
       al.add(new int[]{start[i] , end[i]});
		Collections.sort(al, (a, b) -> (a[1] - b[1]));
		int prev = 0;
		for (int cur = 1; cur < n; cur++) {
			if (al.get(cur)[0] > al.get(prev)[1]) {
				count++;
				prev = cur;
			}
		}


		return count;
	}
}
