import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); //물품 개수
		int K = Integer.parseInt(st.nextToken()); //버틸 수 있는 무게
		
		int[] W = new int[N + 1]; //물품의 무게
		int[] V = new int[N + 1]; //물품의 가치
		int[] data = new int[K + 1]; //최대 가치
		
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i <= N; i++) {
			//무게 한계치가 넘지 않을 때까지 반복
			for(int j = K; j - W[i] >= 0; j--) {
				
				data[j] = Math.max(data[j], data[j - W[i]] + V[i]);
			}
		}
		System.out.println(data[K]);
	}
}//class end