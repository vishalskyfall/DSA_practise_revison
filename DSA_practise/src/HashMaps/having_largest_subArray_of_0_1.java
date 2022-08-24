package HashMaps;

import java.util.HashMap;
import java.util.Map;

//Input:  { 0, 0, 1, 0, 1, 0, 0 }
//
//Output: Largest subarray is { 0, 1, 0, 1 } or { 1, 0, 1, 0 }
public class having_largest_subArray_of_0_1 {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 1 };

		findLargestSubarray(nums);
	}

	static void findLargestSubarray(int[] a) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		map.put(0, -1);
		int len = 0;
		int sum = 0;
		int end = -1;
		for(int i=0;i<a.length;i++) {
			sum+=(a[i]==0)?-1:1;
			System.out.println(sum+" "+i+" "+map.containsKey(sum)+" "+map.get(sum));
			if(map.containsKey(sum)) {
				if(len<i-map.get(sum)) {
					len=i-map.get(sum);
					end=i;
				}
			}
			else {
				map.put(sum, i);
			}
		}
		// print the subarray if present
        if (end != -1)
        {
            System.out.println("[" + (end - len + 1) + ", " +
            		end + "]");
        }
        else {
            System.out.println("No subarray exists");
        }
	}
}
