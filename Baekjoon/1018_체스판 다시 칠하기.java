import java.io.*;
import java.util.*;

public class Main {
	
	public static boolean[][] arr;
	public static int min = 64;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new boolean [n][m];
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < m; j++) {
				if(str.charAt(j) == 'W') {
					arr[i][j] = true; // W일때 true, B일때 false
				}
			}
		}
		
		int row = n - 7;
		int col = m - 7;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				check(i, j);
			}
		}
		System.out.println(min);
	}
	
	public static void check(int x, int y) {
		int width = x + 8;
		int height = y + 8;
		int count = 0;
		
		boolean color = arr[x][y]; //해당 칸의 정답 색깔
		
		for(int i = x; i < width; i++) {
			for(int j = y; j < height; j++) {
				if(arr[i][j] != color) {
					count++;
				}
				
				color = !color; //다음칸의 색을 반대로 변경
			}
			color = !color; //줄이 바뀔때는 색이 바뀌지 않으므로 다시 변경
		}
		
		// 첫 번째 칸 기준 색칠할 개수와, 반대 색 기준 개수를 비교
		count = Math.min(count,  64 - count);
		
		min = Math.min(min, count);
	}
}//class end