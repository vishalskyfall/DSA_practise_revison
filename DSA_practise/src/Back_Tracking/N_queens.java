package Back_Tracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class N_queens {

//	 __ __ __ __ __ __ __ __
//	|_q|__|__|__|__|__|__|__|         
//	|__|__|__|__|__|__|__|_q|
//	|__|_q|__|__|__|__|__|__|
//	|__|__|__|__|_q|__|__|__|
//	|__|__|_q|__|__|__|__|__|
//	|__|__|__|__|__|__|_q|__|
//	|__|__|__|_q|__|__|__|__|
//	|__|__|__|__|__|_q|__|__|

//	 not possible 		backtracked and solution
//	|_q|__|__|__|     |__|_q|__|__| 
//	|__|__|__|__|	  |__|__|__|_q| 
//	|__|_q|__|__|	  |_q|__|__|__| 
//	|__|__|__|__|     |__|__|_q|__| 

	public static void main(String[] args) {
		int k = 4;
		List<List<String>> ls = new LinkedList<List<String>>();
		ls = solveNQueens(k);
		System.out.println(ls);
	}

	static List<List<String>> solveNQueens(int n) {
		List<List<String>> allBoards = new ArrayList<>();
		char[][] board = new char[n][n];
		helper_backtracking(board, allBoards, 0);
		return allBoards;
	}

	static void saveBoard(char[][] board, List<List<String>> allBoards) {
		String row = "";
		List<String> board1 = new ArrayList<String>();
		for (int i = 0; i < board.length; i++) {
			row = "";
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 'Q')
					row += 'Q';

				else
					row += ".";

			}
			board1.add(row);
		}
		allBoards.add(board1);
	}

	static void helper_backtracking(char[][] board, List<List<String>> allBoards, int col) {
		if (col == board.length) {
			saveBoard(board, allBoards);
			return;
		}

		for (int row = 0; row < board.length; row++) {
			if (isSafe(row, col, board)) {
				board[row][col] = 'Q';
				helper_backtracking(board, allBoards, col + 1);
				board[row][col] = '.';
			} // backtrack now

		}
	}

	static boolean isSafe(int row, int col, char[][] board) {
		// 6 conditions
		// horizontal check
		for (int j = 0; j < board.length; j++) {
			if (board[row][j] == 'Q') {
				return false;
			}
		}
		// vertical check board[0] inside row so 0 nakhvu
		for (int i = 0; i < board[0].length; i++) {
			if (board[i][col] == 'Q') {
				return false;
			}
		}

		// for all 4 directions :
		// top left = r-1, c-1
		// top right = r-1,c+1
		// bottom right = r+1, c+1
		// bottom left = r+1,c-1
		// upper left
		int r = row;
		for (int c = col; c >= 0 && r >= 0; c--, r--) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}

		// upper right
		r = row;
		for (int c = col; c < board.length && r >= 0; r--, c++) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}
		// lower left
		r = row;
		for (int c = col; r < board.length && c >= 0; r++, c--) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}
		// lower right
		r = row;
		for (int c = col; c< board.length && r < board.length; r++, c++) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}
		return true;
	}
}
