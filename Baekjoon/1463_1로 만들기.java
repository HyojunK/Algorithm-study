import java.io.*;

public class Main {
	static Integer[] data;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		
			data = new Integer[X + 1];
			data[0] = data[1] = 0;
			
			System.out.println(dp(X));
	}

	private static int dp(int X) {
		//저장된 데이터가 있으면 값을 리턴
		if(data[X] == null)  {
			//6으로 나누어 떨어지면, 2,3으로 나눈 값과 1을 뺀값의 데이터중 최소값 + 1회
			if(X % 6 == 0) {
				return data[X] = Math.min(dp(X/2), Math.min(dp(X/3), dp(X-1))) + 1;
			}
			//3으로 나누어 떨어지면, 3으로 나눈값과 1을 뺀값의 데이터중 최소값 + 1회
			else if(X % 3 == 0) {
				return data[X] = Math.min(dp(X/3), dp(X-1)) + 1;
			}
			//2로 나누어 떨어지면, 2로 나눈값과 1을 뺀값의 데이터중 최소값 + 1회
			else if(X % 2 == 0) {
				return data[X] = Math.min(dp(X/2), dp(X-1)) + 1;
			}
			//1을 뺀값의 데이터 + 1회
			else {
				return data[X] = dp(X-1) + 1;
			}
		}
		return data[X];
	}
}//class end