import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int num : scoville) {
			pq.offer(num);
		}
		while(pq.peek() <= K) {
			if(pq.size() == 1) return -1;
			
			int a = pq.poll();
			int b = pq.poll();
			
			int sum = a + (b*2);
			
			pq.offer(sum);
			answer++;
		}
        
        return answer;
    }
}