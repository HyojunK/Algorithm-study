import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			
		}
		
		Arrays.sort(arr, (a,b) -> {
			if(a[1] == b[1]) {
				return a[0] - b[0];
			}
			else {
				return a[1] - b[1];
			}
		});
        
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(arr[i][0] + " " + arr[i][1] + "\n");
		}
        System.out.println(sb);
	}
}//class end