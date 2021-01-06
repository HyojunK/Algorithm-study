import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] side = new int[3];
		String answer = null;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			side[0] = Integer.parseInt(st.nextToken());
			side[1] = Integer.parseInt(st.nextToken());
			side[2] = Integer.parseInt(st.nextToken());
			
			if(side[0] == 0 && side[1] == 0 && side[2] == 0) break;
			
			Arrays.sort(side);
			
			if(Math.pow(side[2], 2) == Math.pow(side[0], 2) + Math.pow(side[1], 2)) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
	}
}//class end