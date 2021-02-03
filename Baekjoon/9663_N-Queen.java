import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static int cnt = 0;
	public static int n;
	public static int[] point;
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		point = new int[n];
		
		nQueen(0);
		System.out.println(cnt);
		
	}
	
	public static void nQueen(int depth) {
		if(depth == n) {
			cnt++;
			return;
		}
		
		for(int i = 0; i < n; i++) {
			point[depth] = i;
			if(isPossible(depth)) {
				nQueen(depth + 1);
			}
		}
	}

	private static boolean isPossible(int depth) {
		for(int i = 0; i < depth; i++) {
			//같은 줄에 말이 위치하는 경우
			if(point[i] == point[depth]) {
				return false;
			}
			
			//대각선에 말이 위치하는 경우 == 열의 차와 행의 차가 같은 경우
			if(Math.abs(depth - i) == Math.abs(point[depth] - point[i])) {
				return false;
			}
		}
		
		return true;
	}
}//class end