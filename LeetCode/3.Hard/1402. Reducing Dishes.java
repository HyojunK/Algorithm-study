class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        // 최종적으로 반환할 최대값
        int maxSum = 0;
        
        // satisfaction 배열을 오름차순으로 정렬
        Arrays.sort(satisfaction);
        
        // 가장 높은 만족도 값이 음수인 경우 음식을 준비할 필요가 없으므로 0을 바로 return
        if(satisfaction[satisfaction.length - 1] < 0) return 0;
        
        // 지금까지 탐색한 각 음식의 만족도의 합
        int sum = 0;
        
        // 마지막 인덱스 부터 반대로 탐색
        for(int i = satisfaction.length -1; i >= 0; i--) {
            // 현재 음식의 만족도를 합계에 추가
            sum += satisfaction[i];
            
            // 현재까지 음식의 만족도의 합이 음수가 되는 경우
            // 이 지점부터는 최대값이 줄어들게 되므로 현재까지 탐색한 최대값을 return
            if(sum <= 0)  return maxSum;
            // 현재까지 음식의 만족도의 합이 양수가 되는 경우
            // 최대값에 만족도의 합을 추가
            else maxSum += sum;
        }

        return maxSum;
    }
}