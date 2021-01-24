import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String num = br.readLine();
		String[] arr = num.split("");
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(String i : arr) sb.append(i);
		
		System.out.println(sb);
	}
}//class end