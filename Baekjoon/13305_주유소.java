import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		long[] distance = new long[N - 1]; //도시 이동간 거리
		long[] gas = new long[N];//도시별 기름 가격
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N - 1; i++) {
			distance[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			gas[i] = Integer.parseInt(st.nextToken());
		}
		
		long sum = gas[0]*distance[0]; //처음 도시 주유
		long curPrice = gas[0]; //비교할 현재 기름 가격 초기화
		
		//더 싼 주유소가 나올때까지 거리를 한번에 주유
		for(int i = 1; i < N - 1; i++) {
			if(gas[i] < curPrice) {
				curPrice = gas[i];
			}
			sum += curPrice*distance[i];
		}
		
		System.out.println(sum);
	}
}//class end