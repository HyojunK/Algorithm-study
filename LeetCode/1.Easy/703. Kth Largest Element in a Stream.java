class KthLargest {
    // 크기 순으로 저장할 우선순위큐 선언
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    // 큐에 저장할 최대 길이
    int size;

    public KthLargest(int k, int[] nums) {
        size = k;
        
        // nums 배열의 요소들을 큐에 저장
        for(int i : nums) {
            pq.offer(i);
            // 큐의 크기가 k보다 큰 경우 마지막 요소 제거
            if(pq.size() > k) pq.poll();
        }
    }
    
    public int add(int val) {
        // val 값을 큐에 추가
        pq.offer(val);
        // k길이를 초과하게되는 마지막 요소 제거
        if(pq.size() > size) pq.poll();
        
        // 마지막에 있는 요소를 return
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */