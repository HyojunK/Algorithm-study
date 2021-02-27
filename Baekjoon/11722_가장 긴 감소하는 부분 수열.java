import java.io.*;
import java.util.*;

public class Main {
	
	static Integer[] data; //최장 감소 부분수열 데이터
	static int[] seq;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		data = new Integer[N];
		seq = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			LDS(i); //i를 시작 원소로 하는 부분수열 개수
		}
		
		int max = data[0];
		for(int i = 0; i < N; i++) {
			max = Math.max(data[i], max);
		}
		System.out.println(max);
	}

	//최장 감소 부분수열
	private static int LDS(int N) {
		//탐색 하지 않은 위치
		if(data[N] == null) {
			data[N] = 1; //부분 수열의 최소 길이 1로 초기화
			
			//기준 값 이후 노드 탐색
			for(int i = N + 1; i < data.length; i++) {
				//기존 값보다 작은 경우
				if(seq[i] < seq[N]) {
					data[N] = Math.max(data[N], LDS(i) + 1);
				}
			}
		}
		return data[N];
	}
}//class end