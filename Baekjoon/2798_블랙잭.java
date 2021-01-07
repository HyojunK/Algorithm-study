import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int min = 299990;
		int answer = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int[] cards = new int[n];
		for(int i = 0; i < n; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int j = 0; j < n-2; j++) {
			for(int k = j + 1; k < n-1; k++) {
				for(int l = k + 1; l < n; l++) {
					int sum = cards[j] + cards[k] + cards[l];
					if(sum > m) {
						continue;
					}
					if(sum == m) {
						System.out.println(m);
						return;
					}
					else {
						if(m - sum < min) {
							min = m -sum;
							answer = sum;
						}
					}
				}
			}
		}
		System.out.println(answer);
	}
}//class end