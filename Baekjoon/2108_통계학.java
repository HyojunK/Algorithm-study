import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		//입력 범위 -4000 ~ 4000
		int[] arr = new int[8001];
		
		//합계
		int sum = 0;
		//최댓값
		int max = Integer.MIN_VALUE;
		//최솟값
		int min = Integer.MAX_VALUE;
		//중앙값
		int mid = 9999;
		//최빈값
		int freq = 9999;
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			sum += num;
			arr[num + 4000]++;
			
			if(max < num) max = num;
			if(min > num) min = num;
		
		}
		
		//중앙값 카운트
		int cnt = 0;
		//최빈값의 최대 횟수
		int max_freq = 0;
		//최빈값 중복 체크
		boolean check = false;
		
		for(int i = min + 4000; i <= max + 4000; i++) {
			if(arr[i] > 0) {
				//중앙값 찾기
				if(cnt < (n + 1) / 2) {
					cnt += arr[i];
					mid = i - 4000;
				}
				
				//최빈값 찾기
				//새로운 최빈값
				if(max_freq < arr[i]) {
					max_freq = arr[i];
					freq = i - 4000;
					check = true;
				}
				
				//최빈값 최대 횟수와 동일하고 한 번만 중복
				else if(max_freq == arr[i] && check == true) {
					freq = i - 4000;
					check = false;
				}
			}
		}
		//산술평균
		System.out.println((int)Math.round((double)sum / n));
		//중앙값
		System.out.println(mid);
		//최빈값
		System.out.println(freq);
		//범위값
		System.out.println(max - min);
		
	}
}//class end