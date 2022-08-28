package Back_Tracking;

public class Longest_possible_route {
	public static void main(String[] args) {
		int mat[][] = { { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 }, { 0, 0, 0, 0, 1, 0, 0, 1, 0, 0 }, { 1, 0, 0, 0, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 1, 0, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
				{ 1, 1, 0, 0, 1, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 } };
		int max_dist = findLongestPathLength(mat, 0, 0, 5, 7);
		System.out.println("The maximum length path is " + max_dist);
	}

	static int findLongestPathLength(int[][] mat, int i, int j, int k, int l) {
		if (mat == null || mat.length == 0 || mat[i][j] == 0 || mat[k][l] == 0) {
			return -1;
		}

		// `M × N` matrix
		int M = mat.length;
		int N = mat[0].length;

		// construct an `M × N` matrix to keep track of visited cells
		boolean[][] visited = new boolean[M][N];

		// (i, j) are the source cell, and (x, y) are the destination
		// cell coordinates
		return findLongestPath(mat, visited, i, j, k, l, 0, 0);
	}

	private static boolean isSafe(int[][] mat, boolean[][] visited, int x, int y) {
		return (x >= 0 && x < mat.length && y >= 0 && y < mat[0].length) && mat[x][y] == 1 && !visited[x][y];
	}

	public static int findLongestPath(int[][] mat, boolean[][] visited, int i, int j, int x, int y, int max_dist,
			int dist) {
// if the destination is not possible from the current cell
		if (mat[i][j] == 0) {
			return 0;
		}

// if the destination is found, update `max_dist`
		if (i == x && j == y) {
			return Integer.max(dist, max_dist);
		}

// set (i, j) cell as visited
		visited[i][j] = true;

// go to the bottom cell
		if (isSafe(mat, visited, i + 1, j)) {
			max_dist = findLongestPath(mat, visited, i + 1, j, x, y, max_dist, dist + 1);
		}

// go to the right cell
		if (isSafe(mat, visited, i, j + 1)) {
			max_dist = findLongestPath(mat, visited, i, j + 1, x, y, max_dist, dist + 1);
		}

// go to the top cell
		if (isSafe(mat, visited, i - 1, j)) {
			max_dist = findLongestPath(mat, visited, i - 1, j, x, y, max_dist, dist + 1);
		}

// go to the left cell
		if (isSafe(mat, visited, i, j - 1)) {
			max_dist = findLongestPath(mat, visited, i, j - 1, x, y, max_dist, dist + 1);
		}

// backtrack: remove (i, j) from the visited matrix
		visited[i][j] = false;

		return max_dist;
	}
}
