import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static int[] arr;
	public static int n, m;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		dfs(n, m, 0);
		System.out.println(sb);
		
		
	}
	
	//Depth First Search
	public static void dfs(int n, int m, int depth) {
		//깊이가 m과 같으면 배열을 출력
		if(depth == m) {
			for(int i : arr) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 1; i <= n; i++) {

			arr[depth] = i;
			dfs(n, m, depth + 1);
		}
	}
}//class end