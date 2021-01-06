import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int[] xy = new int[1001];
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			xy[x] += 10;
			xy[y] += 1;
		}
		
		x = y = 0;
		
		for(int i = 0; i <= 1000; i++) {
			if(xy[i] == 0) continue;
			if(xy[i]/10 == 1) x = i;
			if(xy[i]%10 == 1) y = i;
			if(x != 0 && y != 0) break;
		}
		bw.write(x + " " + y);
		
		br.close();
		bw.flush();
		bw.close();
	}
}//class end