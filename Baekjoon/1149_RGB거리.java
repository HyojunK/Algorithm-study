import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] RGB;
	static int[][] data;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		RGB = new int[n][3];
		data = new int[n][3];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			RGB[i][0] = Integer.parseInt(st.nextToken());
			RGB[i][1] = Integer.parseInt(st.nextToken());
			RGB[i][2] = Integer.parseInt(st.nextToken());
		}
		
		//data 첫번째 값 초기화
		data[0][0] = RGB[0][0];
		data[0][1] = RGB[0][1];
		data[0][2] = RGB[0][2];
		
		System.out.println(Math.min(cost(n - 1, 0), Math.min(cost(n - 1, 1), cost(n - 1, 2))));
	}

	private static int cost(int n, int color) {
		//저장된 데이터가 없으면
		if(data[n][color] == 0) {
			//빨강
			if(color == 0) {
				data[n][0] = Math.min(cost(n - 1, 1), cost(n - 1, 2)) + RGB[n][0];
			}
			//초록
			else if(color == 1) {
				data[n][1] = Math.min(cost(n - 1, 0), cost(n - 1, 2)) + RGB[n][1];
			}
			//파랑
			else {
				data[n][2] = Math.min(cost(n - 1, 0), cost(n - 1, 1)) + RGB[n][2];
			}
		}
		return data[n][color];
	}
}//class end