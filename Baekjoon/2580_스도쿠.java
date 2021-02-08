import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static int[][] sudoku_board = new int[9][9];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 9; j++) {
				sudoku_board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		sudoku(0, 0);
	}

	private static void sudoku(int row, int col) {
		//한 행이 다 채워지면 다음 행 첫번째 열부터 시작
		if(col == 9) {
			sudoku(row + 1, 0);
			return;
		}
		
		//모든 행과 열이 다 채워지면 출력 후 종료
		if(row == 9) {
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					sb.append(sudoku_board[i][j]).append(" ");
				}
				sb.append("\n");
			}
			System.out.println(sb);
			System.exit(0);
		}
	
		//빈칸이면 가능한 수 탐색
		if(sudoku_board[row][col] == 0) {
			for(int i = 1; i <= 9; i++) {
				if(isPossible(row, col, i)) {
					sudoku_board[row][col] = i;
					sudoku(row, col + 1);
				}
			}
			//백트래킹 후 다시 초기화
			sudoku_board[row][col] = 0;
			return;
		}
		sudoku(row, col + 1);
	}

	private static boolean isPossible(int row, int col, int value) {
		//가로줄 탐색
		for(int i = 0; i < 9; i++) {
			if(sudoku_board[i][col] == value) {
				return false;
			}
		}
		
		//세로줄 탐색
		for(int i = 0; i < 9; i++) {
			if(sudoku_board[row][i] == value) {
				return false;
			}
		}
		
		//사각형 탐색
		int row_start = (row / 3) * 3; //value가 속한 사각형의 행 시작 위치
		int col_start = (col / 3) * 3; //value가 속한 사각형의 열 시작 위치
		
		for(int i = row_start; i < row_start + 3; i++) {
			for(int j = col_start; j < col_start + 3; j++) {
				if(sudoku_board[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}
	
}//class end