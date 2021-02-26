import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int cnt = 1;
		
		Queue<Integer> q = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		//큐 초기화
		for(int i = 1; i <= N; i++) {
			q.offer(i);
		}
		
		while(N > 0) {
			if(cnt == K) {
				sb.append(q.poll());
				if(N > 1) sb.append(", ");
				N--;
				cnt = 1;
			}
			else{
				q.offer(q.poll());
				cnt++;
			}
		}
		
		sb.append(">");
		System.out.println(sb);
	}
}//class end