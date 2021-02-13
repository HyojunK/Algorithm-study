import java.io.*;

public class Main {
	static int[] step;
	static Integer[] data;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		step = new int[n + 1];
		data = new Integer[n + 1];
		
		for(int i = 1; i <= n; i++) {
			step[i] = Integer.parseInt(br.readLine());
		}
		
		data[0] = step[0];
		data[1] = step[1];
		
		if(n >= 2) {
			data[2] = step[1] + step[2];
		}
		
		System.out.println(dp(n));
	}

	private static int dp(int n) {
		if(data[n] == null) {
			data[n] = Math.max(dp(n - 2), dp(n - 3) + step[n - 1]) + step[n];
		}
		
		return data[n];
	}
}//class end