import java.util.*;
public class Main {
	public static void print(int board[][],int n) {
		int i;
		for (i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				if (board[i][j] == 1) {
					System.out.print("Q\t");
				} else {
					System.out.print("*\t");
				}
			System.out.println("\n");
		}
	}
	public static boolean place(int board[][], int row, int col,int n) {
		int i, j;
		for (i = 0; i < col; i++) {
			if (board[row][i] == 1)
				return false;
		}
		for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1)
				return false;
		}
		for (i = row, j = col; j >= 0 && i < n; i++, j--) {
			if (board[i][j] == 1)
				return false;
		}
		return true;
	}
	public static boolean solve(int board[][], int col,int n) {
		if (col >= n)
			return true;
		for (int i = 0; i < n; i++) {
			if (place(board, i, col,n)) {
				board[i][col] = 1;
				if (solve(board, col + 1,n))
					return true;
				board[i][col] = 0;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		if (!solve(board, 0,n)) {
			System.out.println("Solution not found.");
		}
		print(board,n);
	}
}
