package Back_Tracking;

public class rat_in_a_maze {
	public static void main(String[] args) {
		int[][] maze = new int[][] { { 1, 1, 0, 0 }, 
			{ 1, 1, 1, 1 }, 
			{ 0, 1, 0, 1 }, 
			{ 0, 1, 0, 1} };
		solveMaze(maze);
	}

	static void solveMaze(int[][] maze) {
		int[][] sol = new int[][] { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
//		System.out.println(sol.length);
		if (!solveMazeUtil(maze, 0, 0, sol)) {
			System.out.println("no solution, can't reach to cheese");
		}
		printSolution(sol);
	}

	static void printSolution(int[][] sol) {
		for (int i = 0; i < sol.length; i++) {
			for (int j = 0; j < sol[0].length; j++) {
				System.out.print(sol[i][j]);
			}
			System.out.println("");
		}
	}

	static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
		// if (x,y is goal) return true
		if (x == maze.length - 1 && y == maze.length - 1) {
			sol[x][y] = 1;
			return true;
		}
		// Check if maze[x][y] is valid

		if (isSafe(maze, x, y)) {
			sol[x][y] = 1;
			// move forward
			if (solveMazeUtil(maze, x + 1, y, sol))
				return true;
			if (solveMazeUtil(maze, x, y + 1, sol))
				return true;
			/*
			 * If none of the above movements work then BACKTRACK: unmark x,y as part of
			 * solution path
			 */
			sol[x][y] = 0;
			return false;
		}
		return false;
	}

	static boolean isSafe(int[][] maze, int x, int y) {
		 // if (x,y outside maze) return false 
		if (x >= 0 && x < maze.length && y < maze.length && y >= 0 && maze[x][y] == 1)
			return true;

		return false;
	}
}
