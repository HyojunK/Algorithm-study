import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	//a, b, c중 하나가 20을 초과하면 w(20, 20, 20)을 호출하기 때문에
	//배열의 크기는 0~20을 초과하지 않음
	public static int[][][] data = new int[21][21][21];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == -1 && b == -1 && c == -1) {
				break;
			}
			
			sb.append("w(" + a + ", " + b + ", " + c + ") = ").append(w(a, b, c)).append("\n");
		}
		System.out.println(sb);
	}

	private static int w(int a, int b, int c) {

		//a, b, c가 범위를 벗어나지 않으면서 데이터가 저장되어있는 경우
		if(a >= 0 && a <= 20 && b >= 0 && b <= 20 && c >= 0 && c <= 20 && data[a][b][c] != 0) {
			return data[a][b][c];
		}
		if(a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		if(a > 20 || b > 20 || c > 20) {
			return data[20][20][20] = w(20, 20, 20);
		}
		if(a < b && b < c) {
			return data[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		}
		
		return data[a][b][c] = w(a-1, b, c) + + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}
}//class end