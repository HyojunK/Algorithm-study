import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] data = new int[N];
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//최대값
		data[0] = arr[0];
		int max = data[0];
		for(int i = 1; i < N; i++) {
			//현재 노드 값과 (이전 노드 데이터 최대값 + 현재 노드 값) 중 큰값으로 갱신
			data[i] = Math.max(arr[i], data[i - 1] + arr[i]);
			//최대값
			max = Math.max(max, data[i]);
		}
		System.out.println(max);
	}
}//class end