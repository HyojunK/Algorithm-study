import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		
		//입력값 배열화
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			String[] sArr = s.split("");
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(sArr[j]);
			}
		}
		sb = new StringBuilder();
		comp(arr, 0, 0, n);
		System.out.println(sb.toString());

	}

	 // 데이터를 추출할 배열, 시작점 x 좌표, 시작점 y 좌표, 한 변의 길이
	private static void comp(int[][] arr, int x, int y, int length) {
		int s = arr[x][y]; //시작점의 값
		
		if(length == 1) { //더이상 쪼갤 수 없을 때
			if(s == 0) sb.append("0");
			else sb.append("1");
			return;
		}
		
		boolean b = true; //압축 가능 여부
		check:
		for(int i = x; i < x + length; i++) {
			for(int j = y; j < y + length; j++){
				if(arr[i][j] != s) {
					b = false;
					break check;
				}
			}
		}
		
		if(b) { //압축이 가능 할 경우
			if(s == 0) sb.append("0");
			else sb.append("1");
		}
		else { //압축이 불가능 할 경우
			sb.append("(");//시작 괄호 추가
			for(int i = x; i < x + length; i += length / 2) {
				for(int j = y; j < y + length; j += length / 2) {
					comp(arr, i, j, length / 2);
				}
			}
			sb.append(")");//닫는 괄호 추가
		}
	}
}
