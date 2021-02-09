import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static int min = Integer.MAX_VALUE;
	public static int max = Integer.MIN_VALUE;
	public static int[] num;
	public static int[] operator = new int[4];
	public static int n;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		num = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(num[0], 1);
		
		System.out.println(max);
		System.out.println(min);
	}

	private static void dfs(int x, int idx) {
		if(idx == n) {
			max = Math.max(max, x);
			min = Math.min(min, x);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			//연산자 개수가 1개 이상
			if(operator[i] > 0) {
				operator[i]--;
				
				switch(i) {
				case 0: dfs(x + num[idx], idx + 1);
					break;
				case 1: dfs(x - num[idx], idx + 1);
					break;
				case 2: dfs(x * num[idx], idx + 1);
					break;
				case 3: dfs(x / num[idx], idx + 1);
					break;
				}
				operator[i]++;
			}
		}
		
	}
}//class end