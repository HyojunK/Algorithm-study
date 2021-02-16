import java.io.*;

public class Main {
	static Integer[] data;
	static int[] wine;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		data = new Integer[N + 1];
		wine = new int[N + 1];
		
		for(int i = 1; i < N + 1; i++) {
			wine[i] = Integer.parseInt(br.readLine());
		}
		data[0] = 0;
		data[1] = wine[1];
		
		if(N > 1) {
			data[2] = wine[1] + wine[2];
		}
		
		System.out.println(dp(N));
		
	}

	private static int dp(int n) {
		if(data[n] == null) {
			data[n] = Math.max(Math.max(dp(n - 2), dp(n - 3) + wine[n-1]) + wine[n], dp(n - 1));
		}
		
		return data[n];
	}
}//class end