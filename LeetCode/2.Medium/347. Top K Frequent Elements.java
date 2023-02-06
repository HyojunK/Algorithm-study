class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 최종 return할 결과 배열
        int[] answer = new int[k];
        
        // 배열의 숫자의 개수와 k값이 같다면 nums자체가 정답이 됨
        if(nums.length == k) return nums;
        
        Map<Integer, Integer> countMap = new HashMap<>();
        // num배열의 각 요소의 개수를 세며 map에 저장
        for(int i : nums) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }
        
        // 우선순위큐 생성
        // countMap의 두 번째 요소 = 각 요소의 개수를 기준으로 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> countMap.get(o1) - countMap.get(o2));
        // nums 배열의 모든 요소 값들을 큐에 삽입
        for(int i : countMap.keySet()) {
            pq.add(i);
            // 큐의 길이가 k보다 커지는 경우 마지막 요소를 제거
            if(pq.size() > k) pq.poll();
        }
        
        // 큐의 값을 차례대로 결과 배열에 저장하여 return
        for(int i = 0; i < k; i++) {
            answer[i] = pq.poll();
        }
        
        return answer;
    }
}