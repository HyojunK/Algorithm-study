class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 정답 리스트
        List<List<Integer>> answer = new ArrayList<>();

        // nums 배열을 정렬
        // 배열의 첫 번째 값이 양수인 경우 ( 양수로만 이루어진 경우 )
        // 배열의 마지막 값이 음수인 경우 ( 음수로만 이루어진 경우 )
        // 0이 될수 없으므로 빈 리스트를 return
        Arrays.sort(nums);
        if(nums[0] > 0 || nums[nums.length - 1] < 0) return answer;
        
        
        // i번째 값을 기준으로 다음 인덱스를 left, 마지막 인덱스를 right로 정의
        for(int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;               // 왼쪽 포인터
            int right = nums.length - 1;    // 오른쪽 포인터
            
            // i번째 값이 이전값과 같다면 탐색에서 제외
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            
            // left와 right가 겹칠때 까지 탐색
            while(left < right) {
                // 세 인덱스 값의 합
                int sum = nums[i] + nums[left] + nums[right];
                
                // i, left, right의 합이 0이 된다면 정답리스트에 추가하고
                // 다른 값이 나올 때까지 각 포인터 이동
                if(sum == 0) {
                    answer.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                }
                // 합이 0보다 크다면 다른값이 나올 때까지 right 인덱스 감소
                if(sum > 0) {
                    right --;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                }
                // 합이 0보다 작다면 다른값이 나올 때까지 left 인덱스 증가
                if(sum < 0) {
                    left++;
                    while(left < right && nums[left] == nums[left - 1]) left++;
                }
            }
        }

        return answer;
    }
}