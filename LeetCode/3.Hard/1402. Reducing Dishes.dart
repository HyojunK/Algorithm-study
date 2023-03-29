class Solution {
  int maxSatisfaction(List<int> satisfaction) {
    // 최종적으로 반환할 최대값
    var maxSum = 0;
    
    // satisfaction 리스트를 오름차순으로 정렬
    satisfaction.sort();
    
    // 가장 높은 만족도 값이 음수인 경우 음식을 준비할 필요가 없으므로 0을 return
    if(satisfaction[satisfaction.length - 1] < 0) return 0;
    
    // 지금까지 탐색한 각 음식의 만족도의 합
    var sum = 0;
    
    for(var i = satisfaction.length - 1; i >= 0; i--){
        // 현재 음식의 만족도를 합계에 추가
        sum += satisfaction[i];
        
        if(sum <= 0) return maxSum;
        else maxSum += sum;
    }
    
    return maxSum;
  }
}