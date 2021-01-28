import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][2];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			public int compare(String[] a, String[] b) {
				return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
		}
		System.out.println(sb);
	}
}//class end