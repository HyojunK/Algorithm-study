class Solution {
    public int lastStoneWeight(int[] stones) {
        // 돌의 개수가 한 개인 경우 해당 돌의 무게를 바로 return
        if(stones.length == 1) return stones[0];

        // 돌의 무게를 무거운 순으로 저장할 우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // 모든 돌을 우선순위 큐에 삽입
        for(int i : stones) pq.offer(i);

        // 우선순위큐에 남은 돌의 개수가 한 개 이하가 될 때까지 반복
        while(pq.size() > 1){
            // 가장 무거운 돌 두 개 꺼냄
            int y = pq.poll();
            int x = pq.poll();

            // x와 y의 무게가 같지 않은 경우 y-x의 무게를 다시 우선순위 큐에 삽입
            if(x != y) pq.offer(y - x);
        }

        // 우선순위큐에 남은 값이 있는 경우 해당 값을 return
        // 남은 값이 없는 경우 0을 return
        return pq.size() == 0 ? 0 : pq.poll();
    }
}