import java.io.*;
import java.util.*;

public class Main {
	
	static int[] arr;
	static int N;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//이분 탐색을 위한 배열 정렬
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());
			sb.append(bs(key)).append("\n");
		}
		System.out.println(sb);
	}

	//이분탐색
	private static int bs(int key) {
		int left = 0; //첫번째 인덱스 값
		int right = N - 1; //마지막 인덱스 값
		int mid; //중앙값
		
		while(left <= right) {
			//중앙값
			mid = (left + right) / 2;
			
			//찾으려는 값이 중앙값과 일치
			if(key == arr[mid]) {
				return 1;
			}
			//찾으려는 값이 중앙값보다 작음
			if(key < arr[mid]) {
				right = mid - 1;
			}
			//찾으려는 값이 중앙값보다 큼
			if(key > arr[mid]) {
				left = mid + 1;
			}
		}
		return 0;
	}
}//class end