import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i : priorities) {
			pq.offer(i);
		}
		
		while(!pq.isEmpty()) {
			for(int i = 0; i < priorities.length; i++) {
				if(pq.peek() == priorities[i]) {
					if(location == i) {
						return answer;
					}
					pq.poll();
					answer++;
				}
			}
		}
        return answer;
    }
}