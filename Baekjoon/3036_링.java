import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < N; i++) {
			//첫번째 링과 i번째 링의 최대 공약수
			int g = gcd(arr[0], arr[i]);
			
			sb.append(arr[0] / g).append("/").append(arr[i] / g).append("\n");
		}
		
		System.out.println(sb);
		
	}

	private static int gcd(int a, int b) {
		int r = a % b;
		if(r == 0) return b;
		else return gcd(b, r);
	}
}//class end