import java.io.*;

public class Main {
	
	public static Integer[][] data = new Integer[41][2];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//기본 값
		data[0][0] = 1;
		data[0][1] = 0;
		data[1][0] = 0;
		data[1][1] = 1;
		
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			fibonacci(n);
			sb.append(data[n][0] + " " + data[n][1]).append("\n");
		}
		System.out.println(sb);
	}

	private static Integer[] fibonacci(int n) {
		//탐색하지 않은 값이면 탐색과 동시에 data에 값 저장
		if(data[n][0] == null || data[n][1] == null) {
			data[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
			data[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
		}
		
		return data[n];
	}
}//class end