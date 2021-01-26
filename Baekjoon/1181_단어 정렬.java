import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<String>();
		
		for(int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		
		String[] arr = new String[set.size()];
		set.toArray(arr);
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String a, String b) {
				if(a.length() == b.length()) {
					return a.compareTo(b);
				}
				else {
					return a.length() - b.length();
				}
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i] + "\n");
		}
		System.out.println(sb);
	}
}//class end