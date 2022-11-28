class Solution {
    public int coinChange(int[] coins, int amount) {
        // 탐색한 데이터를 저장할 배열
        int[] data = new int[amount + 1];
        
        // 원하는 결과값을 찾을 때 까지 반복
        for(int i = 1; i <= amount; i++) {
            // i번째 값을 amount + 1로 초기화
            data[i] = amount + 1;
            // 코인의 종류만큼 반복
            for(int coin : coins) {
                // 현재 사용할 코인이 i 이하인 경우에만 탐색
                if(i >= coin) {
                    // i - coin을 만들 수 있는 최소값에서
                    // 현재 코인을 더하는 경우가 i를 만드는 최소값
                    // 각 코인마다의 경우의 수를 더해 최소값을 i값으로 설정
                    data[i] = Math.min(data[i], data[i - coin] + 1);
                }
            }
        }
        // 결과값이 amount + 1이라면 최소값을 만드는 경우가 존재하지 않았으므로 -1을 return
        return data[amount] == amount + 1 ? -1 : data[amount];
    }
}