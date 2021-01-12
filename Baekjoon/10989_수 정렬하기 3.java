import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] cnt = new int[10001];
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i = 0; i < 10001; i++) {
			while(cnt[i] > 0) {
				sb.append(i).append("\n");
				cnt[i]--;
			}
		}
		
		System.out.println(sb);
	}
	
}//class end