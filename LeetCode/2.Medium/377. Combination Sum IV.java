class Solution {
    public int combinationSum4(int[] nums, int target) {
        // 각 인덱스 n에 대하여 n을 만들 수 있는 경우의 수를 저장할 배열
        int[] dp = new int[target + 1];
        // 0을 만드는 경우의 수는 한 가지
        dp[0] = 1;
        
        // target까지의 경우의 수를 채워나감
        for(int i = 1; i <= target; i++) {
            // nums 배열의 각 값에 대해서 탐색
            // nums 배열의 각 값을 x라고 할 때 target을 만드는 경우의 수는
            // target - x를 만드는 경우의 수와 같음
            for(int j = 0; j < nums.length; j++) {
                // x가 만들고자 하는 target보다 작거나 같은 경우에만 탐색
                if(nums[j] <= i) {
                    // nums배열의 각 탐색값을 더함
                    dp[i] += dp[i - nums[j]];
                }
            }
        }

        // target에 해당하는 경우의 수를 반환
        return dp[target];
    }
}