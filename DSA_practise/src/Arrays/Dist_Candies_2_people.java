package Arrays;

public class Dist_Candies_2_people {
	public static void main(String[] args) {
		int candies = 11, people = 4;
		int ans[] = dist(candies, people);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	static int[] dist(int candies, int people) {
		int ans[] = new int[people];
		int candy = 0;
		while (candies > 0) { // untill candies > 0 hase tyan sundi for again chalse so end ma i=0 thayu
			for (int i = 0; i < people; i++) {
				candy++;
				System.out.println(candy);
				if (candies <= 0) {
					break;
				} else {
					if (candy < candies) {
						ans[i] += candy;
					} else {
						ans[i] += candies;
					}

				}
				candies -= candy;
				System.out.println(candies+" "+i);
			}

		}
		return ans;
	}
}
