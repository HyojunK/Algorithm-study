import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] order = new int[n];
		int[] size = new int[n*2];
		
		for(int a = 0; a < n*2; a += 2) {
			st = new StringTokenizer(br.readLine(), " ");
			size[a] = Integer.parseInt(st.nextToken());
			size[a+1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n*2; i += 2) {
			for(int j = 0; j < n*2; j += 2) {
				if(size[i] < size[j] && size[i+1] < size[j+1]) {
					order[i/2]++;
				}
			}
		}
		for(int k = 0; k < n; k++) {
			System.out.print((order[k]+1) + " ");
		}
	}
}//class end