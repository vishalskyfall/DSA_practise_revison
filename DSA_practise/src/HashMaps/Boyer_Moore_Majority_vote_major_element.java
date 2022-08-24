package HashMaps;

public class Boyer_Moore_Majority_vote_major_element {

//	For example, the majority element is 2 in array {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2}.

	public static void main(String[] args) {

		// assumption: valid input (majority element is present)
		int[] nums = { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };

		System.out.println("The majority element is " + findMajorityElement(nums));

	}

	static int findMajorityElement(int[] a) {
		int m = -1;
		int i = 0;
		for (int j = 0; j < a.length; j++) {
			if (i == 0) {
				m = a[j];
				i = 1; // reseting the counter
			} else if (m == a[j]) {
				i++;
			} else {
				i = -1;
			}
		}
		return m;
	}
}
