package Striver.Arrays;

//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6
//Explanation: The above elevation map (black section) is represented by 
//array [0,1,0,2,1,0,1,3,2,1,2,1]. 
//In this case, 6 units of rain water (blue section) are being trapped.
public class Trapping_water {
	public static void main(String[] args) {
		int[] nums = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int ans = trapping_Rain_water(nums);
		System.out.println(ans);
	}

	private static int trapping_Rain_water(int[] height) {

		int i = 0, j = height.length - 1, maxLeft = 0, maxxRight = 0, water = 0;
		while (i < j) {
			if (height[i] <= height[j]) { // max left
				maxLeft = Math.max(maxLeft, height[i]);
				water += maxLeft - height[i];
				i++;
			} else {// max right
				maxxRight = Math.max(maxxRight, height[j]);
				water += maxxRight - height[j];
				j--;
			}
		}
		return water;
	}
}
