import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        // score 배열 크기 만큼의 정답배열 선언
        int[] answer = new int[score.length];
        
        // 낮은 순서대로 정렬되는 우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // score 배열을 반복 탐색
        for(int i = 0; i < score.length; i++) {
            // 우선순위 큐에 현재 점수 입력
            pq.add(score[i]);
            // 우선순위 큐의 사이즈가 k보다 커지는 경우 가장 낮은 점수 하나를 제거
            if(pq.size() > k) pq.poll();
            // 현재 최저 점수 정답배열에 입력
            answer[i] = pq.peek();
        }
        
        return answer;
    }
}