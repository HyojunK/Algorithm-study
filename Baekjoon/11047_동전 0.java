import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int cnt = 0; //동전 개수 카운트
		int[] coin = new int[N]; //동전의 가치
	
		for(int i = 0; i < N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = N - 1; i >= 0; i--) {
			if(coin[i] > K) continue;
			
			cnt += K/coin[i];
			K -= K/coin[i] * coin[i];
		}
		
		System.out.println(cnt);
	}
}//class end