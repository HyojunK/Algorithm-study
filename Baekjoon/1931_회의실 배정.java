import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 1; //회의 개수 카운트
		int N = Integer.parseInt(br.readLine());
		int[][] time = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//끝나는 시간 기준으로 오름차순 정렬
		Arrays.sort(time, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				//끝나는 시간이 같다면 시작시간이 빠른 순으로 정렬
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		
		//첫번째 회의가 끝나는 시간
		int finish = time[0][1];
		for(int i = 1; i < time.length; i++) {
			//다음 회의의 시작시간이 끝나는 시간보다 같거나 늦으면 조건 만족
			if(time[i][0] >= finish) {
				cnt++;
				finish = time[i][1];
			}
		}
		
		System.out.println(cnt);
	}
}//class end