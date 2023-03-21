class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long answer = 0;

        // 0으로 채워진 배열의 길이
        long length = 0;
        
        // nums 배열의 모든 요소 탐색
        for(int i = 0; i < nums.length; i++) {
            // 현재 탐색 요소가 0인 경우
            // 0으로 채워진 배열의 길이 증가 및 길이만큼 정답 카운트 증가
            if(nums[i] == 0) {
                length++;
                answer += length;
            }
            // 현재 탐색 요소가 0이 아닌 경우 0으로 채워진 배열의 길이 초기화
            else length = 0;
        }

        return answer;
    }
}