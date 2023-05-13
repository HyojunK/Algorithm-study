class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int answer = 0;
        
        // 단어를 만들 수 있는 최소 길이
        int minLength = Math.min(zero, one);
        // 나머지 계산을 위한 수
        int mod = 1000000007;
        // 각 자리수마다 만들어질 수 있는 경우의 수를 저장할 배열
        int[] dp = new int[high + 1];
        // 아무것도 만들수 없는 경우의 수 1
        dp[0] = 1;
        
        // 단어를 만들 수 있는 최소 길이부터 탐색
        for(int i = minLength; i <= high; i++) {
            // 현재 탐색중인 문자열 자리수가 0이 들어갈 개수 이상인 경우
            if(i >= zero) {
                // 0의 개수 이전 자리수의 경우의 수 만큼 추가
                dp[i] = (dp[i] + dp[i - zero]) % mod;
            }
            // 현재 탐색중인 문자열 자리수가 1이 들어갈 개수 이상인 경우
            if(i >= one) {
                // 1의 개수 이전 자리수의 경우의 수 만큼 추가
                dp[i] = (dp[i] + dp[i - one]) % mod;
            }
            // 현재 탐색중인 문자열 자리수가 good string이 되는 길이인 경우
            if(i >= low) {
                // 정답 개수 추가
                answer = (answer + dp[i]) % mod;
            }
        }

        return answer;
    }
}