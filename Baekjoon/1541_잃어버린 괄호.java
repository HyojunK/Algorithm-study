import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean minus = false;
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), "+|-", true);
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			
			if(s.equals("+")) continue;
			else if(s.equals("-")) minus = true;
			else {
				if(minus == false) sum += Integer.parseInt(s);
				else sum -= Integer.parseInt(s);
			}
		}
		System.out.println(sum);
	}
}//class end