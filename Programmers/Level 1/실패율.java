import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        float[][] fRate = new float[N][2]; //스테이지 번호, 실패율
		
		for(int i = 0; i < N; i++) {
			//i번째 스테이지(0번째 == 1스테이지)
			fRate[i][0] = i + 1;
			
			//i번째 스테이지의 도전자
			int challenger = 0;
			//i번째 스테이지 실패자
			int fail = 0;
			
			for(int j = 0; j < stages.length; j++) {
				if(stages[j] >= i + 1) challenger++;
				if(stages[j] == i + 1) fail++;
			}
			
			//i번째 스테이지의 실패율
			if(challenger == 0) {
				fRate[i][1] = 0f;
			}
			else {
				fRate[i][1] = (float)fail/challenger;
			}
		}
		
		Arrays.sort(fRate, new Comparator<float[]>() {

			@Override
			public int compare(float[] o1, float[] o2) {
				if(o1[1] == o2[1] && o1[0] > o2[0]) {
					return 1;
				}
				else if(o1[1] < o2[1]) {
					return 1;
				}
				else return -1;
			}
			
		});
		
		for(int i = 0; i < N; i++) {
			answer[i] = (int)fRate[i][0];
		}
        
        return answer;
    }
}