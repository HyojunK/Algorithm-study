import java.io.*;

public class Main {
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		sb.append((int)(Math.pow(2, n) - 1)).append("\n");
		
		//hanoi(원판의 개수, 출발, 경유, 도착)
		hanoi(n, 1, 2, 3);
		System.out.println(sb);
		
	}
	
	public static void hanoi(int n, int x, int y, int z) {
		//이동할 원반이 하나일 때
		if(n == 1) {
			sb.append(x + " " + z + "\n");
			return;
		}
		//n-1개를 x에서 y로 이동
		hanoi(n - 1, x, z, y);
		//1개를 x에서 z로 이동
		sb.append(x + " " + z + "\n");
		//n - 1개를 y에서 z로 이동
		hanoi(n - 1, y, x, z);
	}
}//class end