import java.io.*;
import java.util.*;

public class Main {
	
	public static char[][] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new char[n][n];
		
		star(0, 0, n, false);
		
		for(int i = 0; i < n; i++) {
			bw.write(arr[i]);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
	
	static void star(int x, int y, int n, boolean blank) {
		// 빈칸인 경우
		if(blank) {
			for(int i = x; i < x + n; i++) {
				for(int j = y; j < y + n; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		//쪼갤 수 없는 블록일 때
		if(n == 1) {
			arr[x][y] = '*';
			return;
		}
		
		//9개 블럭중 한 칸의 길이
		int size = n / 3;
		int count = 0;
		for(int i = x; i < x + n; i += size) {
			for(int j = y; j < y + n; j += size) {
				count++;
				
				//공백 칸일 경우
				if(count == 5) {
					star(i, j, size, true);
				}
				else {
					star(i, j, size, false);
				}
			}
		}
	}
}//class end