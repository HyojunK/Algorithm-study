class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        
        for(int coin : coins) {
            for(int i = coin; i <= amount; i++) {
                // i원이 될 수 있는 경우의 수는
                // i원에서 coin만큼 뺀금액의 경우의 수
                // 따라서 i - coin의 경우의 수를 i의 경우의 수에 추가
                dp[i] += dp[i - coin];
            }
        }

        return dp[amount];
    }
}