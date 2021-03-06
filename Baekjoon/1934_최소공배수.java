import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			//최대 공약수
			int g = gcd(a, b);
			//최소 공배수
			int l = (a*b) / g;
			
			sb.append(l).append("\n");
		}
		System.out.println(sb);
	}

	//유클리드 호제
	private static int gcd(int a, int b) {
		int r = a % b;
		if(r == 0) return b;
		else return gcd(b, r);
	}
}//class end