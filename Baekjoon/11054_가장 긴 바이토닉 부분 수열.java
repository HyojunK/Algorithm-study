import java.io.*;
import java.util.*;

public class Main {
	
	static Integer[] lisData; //최장 증가 부분수열 데이터
	static Integer[] ldsData; //최장 감소 부분수열 데이터
	static int[] seq;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		lisData = new Integer[N];
		ldsData = new Integer[N];
		seq = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			LIS(i); //i를 마지막 원소로 하는 부분수열 개수
			LDS(i); //i를 시작 원소로 하는 부분수열 개수
		}
		
		int max = -1;
		for(int i = 0; i < N; i++) {
			max = Math.max(lisData[i] + ldsData[i], max);
		}
		
		//기준 원소가 하나 겹치므로 -1
		System.out.println(max - 1);
	}

	private static int LIS(int N) {
		//탐색 하지 않은 위치
		if(lisData[N] == null) {
			lisData[N] = 1; //부분 수열의 최소 길이 1로 초기화
			
			//기준 값 이전 노드 탐색
			for(int i = N - 1; i >= 0; i--) {
				//기존 값보다 작은 경우
				if(seq[i] < seq[N]) {
					lisData[N] = Math.max(lisData[N], LIS(i) + 1);
				}
			}
		}
		return lisData[N];
	}

	//LIS의 역방향 탐색
	private static int LDS(int N) {
		//탐색 하지 않은 위치
		if(ldsData[N] == null) {
			ldsData[N] = 1; //부분 수열의 최소 길이 1로 초기화
			
			//기준 값 이후 노드 탐색
			for(int i = N + 1; i < ldsData.length; i++) {
				//기존 값보다 작은 경우
				if(seq[i] < seq[N]) {
					ldsData[N] = Math.max(ldsData[N], LDS(i) + 1);
				}
			}
		}
		return ldsData[N];
	}
}//class end