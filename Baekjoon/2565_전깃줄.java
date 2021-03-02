import java.io.*;
import java.util.*;

public class Main {
	
	static Integer[] data; //연결 가능한 전깃줄 개수 데이터
	static int[][] arr; //전깃줄 배치
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		data = new Integer[N];
		arr = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//시작점을 기준으로 정렬
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		for(int i = 0; i < N; i++) {
			solution(i); //i번째 전깃줄을 기준으로 연결 가능한 개수
		}
		
		int max = data[0]; //연결 가능한 개수 최대값
		for(int i = 1; i < N; i++) {
			max = Math.max(data[i], max);
		}
		
		//전체 전깃줄 - 최대값
		System.out.println(N - max);
		
	}
	
	private static int solution(int N) {
		//탐색 하지 않은 위치
		if(data[N] == null) {
			data[N] = 1; //부분 수열의 최소 길이 1로 초기화
			
			//N번째 이후 노드 탐색
			for(int i = N + 1; i < data.length; i++) {
				//기존 값보다 큰 경우 연결 가능
				if(arr[i][1] > arr[N][1]) {
					data[N] = Math.max(data[N], solution(i) + 1);
				}
			}
		}
		return data[N];
	}
}//class end