package Back_Tracking;

public class M_coloring {
	public static void main(String[] args) {

		// no 2 neighbors have the same colors
//		writing just the code not printing 

	}

	static boolean isColoringPossible(int[][] adjMatrix, int m) {
		int n = adjMatrix.length;
		int color[] = new int[n];

		for (int i = 0; i < n; i++) {
			if (adjMatrix[i][i] == 1)
				return false;
		}
		return graphColoring(adjMatrix, m, 0, color, n);
	}

	private static boolean graphColoring(int[][] adjMatrix, int m, int index, int[] color, int n) {
		if (index == n)
			return ((isSafe(adjMatrix, color, n)));

		for (int j = 1; j <= m; j++) {
			color[index] = j;
			if (graphColoring(adjMatrix, m, index + 1, color, n)) {
				return true;
			}
			color[index] = 0;
		}

		return false;
	}

	private static boolean isSafe(int[][] adjMatrix, int[] color, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (adjMatrix[i][j] == 1 && color[j] == color[i]) {
					return false;
				}
			}
		}
		return true;
	}

}
