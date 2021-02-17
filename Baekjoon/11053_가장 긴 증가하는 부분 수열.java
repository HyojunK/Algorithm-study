import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static Integer[] data;
	static int[] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		data = new Integer[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//수열의 각 자리수를 마지막 원소로 가지는 부분 수열의 개수 탐색
		for(int i = 0; i < N; i++) {
			lis(i);
		}
		
		//최대값
		int max = data[0];
		for(int i = 1; i < N; i++) {
			max = Math.max(max, data[i]);
		}
		System.out.println(max);
	}

	private static int lis(int N) {
		//아직 탐색하지 않은 경우
		if(data[N] == null) {
			//모든 부분수열의 개수는 최소 1이상
			data[N] = 1;
			
			//배열 자리수를 감소시키며 N보다 작은 값을 탐색
			for(int i = N - 1; i >= 0; i--) {
				if(arr[i] < arr[N]) {
					data[N] = Math.max(data[N], lis(i) + 1);
				}
			}
		}
		return data[N];
	}
}//class end