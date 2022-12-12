class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1]; // n번째 자리까지 복호화하는 경우의 수 배열
        
        // 0으로 시작하면 복호화 불가능
        if(s.charAt(0) == '0') return 0;
        
        dp[0] = dp[1] = 1; // 0번째, 1번째 자리의 경우의 수는 1로 초기화
        // 문자열 내 각 문자 탐색
        // 탐색 인덱스는 0부터 시작하지만 자리수는 1부터 시작
        for(int i = 1; i < s.length(); i++) {
            // 현재 문자가 복호화가 가능하면 -> '0'이 아닌 경우
            // 현재 문자까지 복호화 경우의수에
            // 이전 문자까지의 경우의 수를 더함
            if(s.charAt(i) != '0') dp[i + 1] += dp[i];
            
            // 이전 문자 + 현재 문자가 복호화가 가능하면 -> '26'이하인 경우
            // 현재 문자까지 복호화 경우의수에
            // 두 자리 전까지의 경우의 수를 더함
            int target = (s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0');
            if(10 <= target && target <= 26) dp[i + 1] += dp[i - 1];
        }
        
        return dp[s.length()];
    }
}