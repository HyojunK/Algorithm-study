class Solution {
    public int rob(int[] nums) {
        // 탐색한 결과값을 저장할 배열
        int[] dp = new int[nums.length];

        // nums의 원소가 한개인 경우 해당값을 반환
        if(nums.length == 1) return nums[0];

        // 첫 번째 집은 첫 번째 집의 가격으로 초기화
        dp[0] = nums[0];
        // 두 번째 집은 첫 번째 집과 두 번째 집 중 높은 가격으로 초기화
        dp[1] = Math.max(nums[0], nums[1]);

        // 남은 집들을 순회하며 탐색
        for(int i = 2; i < nums.length; i++){
            // n번째 집에서 탐색할 수 있는 경우는 두 가지
            // 1. n - 2번째 집까지의 최대 금액과 n번째 집 금액의 합
            // 2. n - 1번째 집까지의 최대 금액
            // 두 가지 경우 중 더 큰 값을 n에 저장한다.

            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        // 마지막 까지 탐색한 결과값을 반환
        return dp[nums.length - 1];
    }
}