import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] value;
	static Integer[][] data;
	static int n;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		value = new int[n][n];
		data = new Integer[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < i + 1; j++) {
				value[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i < n; i++) {
			data[n - 1][i] = value[n - 1][i];
		}
		
		System.out.println(dp(0, 0));
	}

	private static int dp(int h, int w) {
		//마지막 행일 경우
		if(h == n - 1) return data[h][w];
		
		//저장된 데이터가 없으면 다음 행의 양쪽 값 비교
		if(data[h][w] == null) {
			data[h][w] = Math.max(dp(h + 1, w), dp(h + 1, w + 1)) + value[h][w];
		}
		return data[h][w];
	}
}//class end