import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        Queue<Integer> q = new LinkedList<Integer>();
		
		//기능 배포에 걸리는 기간
		int[] day = new int[progresses.length];
		
		for(int i = 0; i < day.length; i++) {
			if((100 - progresses[i]) % speeds[i] == 0) {
				day[i] = (100 - progresses[i]) / speeds[i];
			}
			else {
				day[i] = ((100 - progresses[i]) / speeds[i]) + 1;
			}
			q.offer(day[i]);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		
		int cnt = 0; //한번의 배포에 배포되는 기능 카운트
		int before = q.peek(); //현재 큐에서 처음 기능이 배포되는데 걸리는 기간
		//큐가 빌 때 까지 반복
		while(!q.isEmpty()) {
			//배포에 걸리는 기간이 이전보다 같거나 짧으면 이전 기능을 빼고 배포되는 기능 카운트 +
			if(q.peek() <= before) {
				q.poll();
				cnt++;
			}
			//다음 기능 배포가 더 길면 이전까지 카운트를 리스트에 +, 카운트 초기화, before 재설정
			else {
				list.add(cnt);
				cnt = 0;
				before = q.peek();
			}
		}
		//마지막 배포 추가
		list.add(cnt);
		
		answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}