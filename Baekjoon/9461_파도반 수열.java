import java.io.*;

public class Main {
	
	static long[] P = new long[101];
	static int T;
	static int N;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		P[1] = 1;
		P[2] = 1;
		P[3] = 1;
		
		T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			
			sb.append(dp(N)).append("\n");
		}
		
		System.out.println(sb);
		
	}

	private static long dp(int num) {
		//저장된 데이터가 있으면 리턴
		if(P[num] != 0) {
			return P[num];
		}
		//아니면 탐색 후 저장
		//P(N) = P(N-3) + P(N-2)
		return P[num] = dp(num - 3) + dp(num -2);
	}
}//class end