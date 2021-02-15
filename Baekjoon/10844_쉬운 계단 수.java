import java.io.*;

public class Main {
	static Long[][] data;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		//0~9로 시작하는 N자리수의 계단수
		data = new Long[10][N + 1];
		
		//1자리 수 데이터 초기화
		for(int i = 0; i < 10; i++) {
			data[i][1] = 1L;
		}
		
		long answer = 0;
		for(int i = 1; i <= 9; i++) {
			answer += dp(i, N);
		}
		System.out.println(answer % 1000000000);
	}

	private static long dp(int start, int length) {
		if(length == 1) {
			return data[start][length];
		}
		
		//탐색 하지 않은 값이면
		if(data[start][length] == null) {
			//0으로 시작하면 다음은 1만 가능
			if(start == 0) {
				data[start][length] = dp(1, length - 1);
			}
			//9로 시작한다면 다음은 8만 가능
			else if( start == 9) {
				data[start][length] = dp(8, length - 1);
			}
			//나머지는 +-1
			else {
				data[start][length] = dp(start - 1, length - 1) + dp(start + 1, length - 1);
			}
		}
		return data[start][length] % 1000000000;
	}
}//class end