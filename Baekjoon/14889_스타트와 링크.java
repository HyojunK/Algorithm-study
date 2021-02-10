import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int[][] stats;
	static int n;
	static int min = Integer.MAX_VALUE;
	static boolean[] visit;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		stats = new int[n][n];
		visit = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < n; j++) {
				stats[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		team(0, 0);
		System.out.println(min);
	}

	private static void team(int player, int num) {
		//팀 조합 완성
		if(num == n/2) {
			//능력치의 차이
			diff();
			return;
		}
		for(int i = player; i < n; i++) {
			//방문 하지 않은 경우
			if(!visit[i]) {
				visit[i] = true; //방문으로 변경
				team(i + 1, num + 1); //다음 플레이어 탐색
				visit[i] = false; //탐색이 끝나면 초기화
			}
		}
	}

	private static void diff() {
		int start = 0;
		int link = 0;
		//두 팀의 점수 차이
		int gap = -1;
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				//i와 j번째 플레이어가 true면 start팀
				if(visit[i] && visit[j]) {
					start += stats[i][j];
					start += stats[j][i];
				}
				//false이면 link팀
				if(!visit[i] && !visit[j]) {
					link += stats[i][j];
					link += stats[j][i];
				}
			}
		}
		gap = Math.abs(start - link);
		if(gap == 0) {
			System.out.println(0);
			System.exit(0);
		}
		
		min = Math.min(gap, min);
	}
}//class end